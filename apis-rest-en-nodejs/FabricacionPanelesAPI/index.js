var express = require('express');
var bodyparser = require('body-parser')
var mysql = require('mysql');
var port = process.env.PORT || 3000;

var app = express();
app.use(bodyparser.json())

var knex = require('knex')({
  dialect: 'mysql',
  connection: {
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'paneles_solares'
  }
});

app.listen(port, function(){
  console.log("Servidor arrancado"); 
})

module.exports = app;

//PEDIDOS

//Obtener todos los pedidos
app.get('/fabricacionPaneles/pedidos', function(pet, resp){
    knex.select().table('pedidos')
        .then(function(pedidos){
            var result = []
    
            resp.status(200)
            resp.send(pedidos)
        })
})

//Obtener todos los pedidos de un determinado estado
app.get('/fabricacionPaneles/pedidos/estado/:estado', function(pet, resp){
    var estado = pet.params.estado

    if(estado == "Resto"){
        knex.select().table('pedidos').where('estado', '!=', 'Nuevo')
            .then(function(pedidos){
                resp.status(200)
                resp.send(pedidos)
            })
    }
    else {
        knex.select().table('pedidos').where('estado', estado)
            .then(function(pedidos){
                resp.status(200)
                resp.send(pedidos)
            })
    }
})

//Pasar un pedido de Nuevo a En construccion
app.get('/fabricacionPaneles/pedidos/:idPedido/siguienteEstado', function(pet, resp){
    var id = parseInt(pet.params.idPedido)

    var nuevoEstado = ""

    knex('pedidos').where('id', id)
    .then(function(pedido){
        if (pedido != "") {
            if(pedido[0].estado == 'Nuevo'){
                var faltaMaterial = false
                knex.select().table('materiales')
                .then(function(materiales){
                    for(var i = 0; i < materiales.length;i++){
                        var materialRestante = materiales[i].cantidadDisponible - materiales[i].cantidadFabricacion * pedido[0].panelesEncargados
                        if(materialRestante >= 0){
                            knex('materiales').where('id', materiales[i].id).update({nombre: materiales[i].nombre, 
                                cantidadDisponible: materialRestante})
                                .then(function(updated){
                                    
                                })
                        }
                        else{
                            knex('materiales').where('id', materiales[i].id).update({nombre: materiales[i].nombre, 
                            cantidadDisponible: materiales[i].cantidadDisponible + (materiales[i].cantidadFabricacion * 10) + (pedido[0].panelesEncargados * materiales[i].cantidadFabricacion)})
                            .then(function(updated){
                                
                            })

                            knex('pedidos_materiales').returning('id').insert({material: materiales[i].nombre, 
                            cantidad: (materiales[i].cantidadFabricacion * 10) + (pedido[0].panelesEncargados * materiales[i].cantidadFabricacion)})
                            .then(function(id){
                                
                            })
                            faltaMaterial = true
                        }
                    }

                    if(faltaMaterial){
                        nuevoEstado = "Materiales insuficientes para construcción, esperando pedido a proveedores"
                    }
                    else{
                        nuevoEstado = "En construcción"
                    }

                    knex('pedidos').where('id', pedido[0].id).update({estado: nuevoEstado, 
                        panelesEncargados: pedido[0].panelesEncargados, cliente: pedido[0].cliente})
                        .then(function(updated){
                            if(updated) {
                                resp.status(200)
                                resp.send({
                                    message: 'Pedido actualizado correctamente'
                                })
                                resp.end() 
                            }
                            else {
                            resp.status(404)
                            resp.send({error: "No existe el pedido con id " + id})
                            resp.end()
                            }
                        })
                })
            }
            else{
                if(pedido[0].estado == 'Materiales insuficientes para construcción, esperando pedido a proveedores'){
                    nuevoEstado = "En construcción"
                }
                if(pedido[0].estado == 'En construcción'){
                    nuevoEstado = "En QA"
                }
                if(pedido[0].estado == 'En QA'){
                    nuevoEstado = "Listo"
                }
                if(pedido[0].estado == 'Listo'){
                    nuevoEstado = "Entregado"
                }
                if(pedido[0].estado == 'Entregado'){
                    nuevoEstado = "Entregado"
                }

                knex('pedidos').where('id', pedido[0].id).update({estado: nuevoEstado, 
                    panelesEncargados: pedido[0].panelesEncargados, cliente: pedido[0].cliente})
                    .then(function(updated){
                        if(updated) {
                            resp.status(204)
                            resp.send({
                                message: 'Pedido actualizado correctamente'
                            })
                            resp.end() 
                        }
                        else {
                        resp.status(404)
                        resp.send({error: "No existe el pedido con id " + id})
                        resp.end()
                        }
                    })
            }
        }
        else {
            resp.status(404)
            resp.send("El pedido no se ha encontrado") 
            resp.end()
        } 
    })
})

//Mostrar un pedido en concreto por su id
app.get('/fabricacionPaneles/pedidos/:idPedido', function(pet, resp){
    var id = parseInt(pet.params.idPedido)

    if (isNaN(id)) {
        resp.status(400)
        resp.send("El id debe ser numérico")
        resp.end()
    }
    else {
        knex('pedidos').where('id', id)
            .then(function(pedido){
                if (pedido != "") {
                    resp.status(200)
                    resp.send(pedido)  
                    resp.end()
                }
                else {
                    resp.status(404)
                    resp.send("El pedido no se ha encontrado") 
                    resp.end()
                } 
            })
    }
})

//Almacenar un pedido nuevo 
app.post('/fabricacionPaneles/pedidos', function(pet, resp){
    var newPedido = pet.body

    if(newPedido.estado && newPedido.panelesEncargados && newPedido.cliente) {
        knex('pedidos').returning('id').insert({estado: newPedido.estado, 
            panelesEncargados: newPedido.panelesEncargados, cliente: newPedido.cliente})
            .then(function(id){
                resp.status(201)
                resp.send({
                    message: 'Pedido generado correctamente'
                })  
                resp.end()
            })
    }
    else {
      resp.status(400)
      resp.send({error: "Falta estado, cliente y/o cantidad de paneles encargados"})
      resp.end()
    }
})

//Actualizar un pedido  
app.put('/fabricacionPaneles/pedidos/:idPedido', function(pet, resp){
    var newPedido = pet.body
    var id = parseInt(pet.params.idPedido)

    if (isNaN(id)) {
        resp.status(400)
        resp.send({error: "El id debe ser numérico"})
        resp.end()
    }

    if(newPedido.estado && newPedido.panelesEncargados && newPedido.cliente) {
        knex('pedidos').where('id', id).update({estado: newPedido.estado, 
            panelesEncargados: newPedido.panelesEncargados, cliente: newPedido.cliente})
            .then(function(updated){
                if(updated) {
                    resp.status(204)
                    resp.send({
                        message: 'Pedido actualizado correctamente'
                    })  
                    resp.end() 
                }
                else {
                resp.status(404)
                resp.send({error: "No existe el pedido con id " + id})
                resp.end()
                }
            })
    }
    else {
      resp.status(400)
      resp.send({error: "Falta estado, cliente y/o cantidad de paneles encargados"})
      resp.end()
    }
})

//MATERIALES

//Obtener todos los materiales
app.get('/fabricacionPaneles/materiales', function(pet, resp){
    knex.select().table('materiales')
        .then(function(materiales){
            var result = []
    
            resp.status(200)
            resp.send(materiales)
            resp.end()
        })
})

//Mostrar un material en concreto por su id
app.get('/fabricacionPaneles/materiales/:idMaterial', function(pet, resp){
    var id = parseInt(pet.params.idMaterial)
    if (isNaN(id)) {
        resp.status(400)
        resp.send("El id debe ser numérico")
        resp.end()
    }
    else {
        knex('materiales').where('id', id)
            .then(function(material){
                if (material != "") {
                    resp.status(200)
                    resp.send(material)  
                    resp.end()
                }
                else {
                    resp.status(404)
                    resp.send("El material no se ha encontrado") 
                    resp.end()
                } 
            })
    }
})

//Actualizar un material 
app.put('/fabricacionPaneles/materiales/:idMaterial', function(pet, resp){
    var newMaterial = pet.body
    var id = parseInt(pet.params.idMaterial)

    if (isNaN(id)) {
        resp.status(400)
        resp.send({error: "El id debe ser numérico"})
        resp.end()
    }

    if(newMaterial.nombre && newMaterial.cantidadDisponible) {
        knex('materiales').where('id', id).update({nombre: newMaterial.nombre, 
            cantidadDisponible: newMaterial.cantidadDisponible})
            .then(function(updated){
                if(updated) {
                    resp.status(204)
                    resp.send({
                        message: 'Material actualizado correctamente'
                    })  
                    resp.end() 
                }
                else {
                    resp.status(404)
                    resp.send({error: "No existe el material con id " + id})
                    resp.end()
                }
            })
    }
    else {
      resp.status(400)
      resp.send({error: "Falta estado, cliente y/o cantidad de paneles encargados"})
      resp.end()
    }
})

//Almacenar un pedido de materiales 
app.post('/fabricacionPaneles/pedidosMateriales/', function(pet, resp){
    var newPedido = pet.body

    if(newPedido.material && newPedido.cantidad) {
        knex('pedidos_materiales').returning('id').insert({material: newPedido.material, 
            cantidad: newPedido.cantidad})
            .then(function(id){
                resp.status(201)
                resp.send({
                    message: 'Pedido de material generado correctamente'
                })  
                resp.end()
            })
    }
    else {
      resp.status(400)
      resp.send({error: "Falta material y/o cantidad a pedir"})
      resp.end()
    }
})

//Obtener todos los pedidos de materiales
app.get('/fabricacionPaneles/pedidosMateriales', function(pet, resp){
    knex.select().table('pedidos_materiales')
        .then(function(pedidosMateriales){
            var result = []
    
            resp.status(200)
            resp.send(pedidosMateriales)
            resp.end()
        })
})
