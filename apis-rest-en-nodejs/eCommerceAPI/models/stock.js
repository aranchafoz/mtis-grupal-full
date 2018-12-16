const database = require('./../database/database')

exports.getStock = function(req, res) { //Devuelve todos los productos del stock
    database.getStock(res, function(row) {
        if(row != null){
            res.status(200)
            res.send(row)
        }else{
            res.status(404)
            res.send({'ERROR':'No hay nada en stock'})
        }
    })
}

exports.getProduct = function(req, res) { //Devuelve todos los productos del stock
    var idProducto = req.params.id
    database.getProduct(res,idProducto,function(row) {
        if(row != null){
            res.status(200)
            res.send(row)
        }else{
            res.status(404)
            res.send({'ERROR':'No se ha encontrado el producto'})
        }
    })
}

exports.addProduct = function(req, res) {//Añade un roducto al stock
    console.log(req.body)
    var cantidad = req.body.Cantidad
    var precio = req.body.PrecioU
    var nombre = req.body.Nombre
    if (cantidad && precio && nombre){
        database.insertStock(res, nombre, cantidad, precio, function(){
        
        })
        res.status(200)
        res.send()
    } else{
        var errorCantidad = (!cantidad) ? '(El parámetro cantidad no ha sido establecido)' : ''
        var errorPrecio = (!precio) ? ' (El parámetro precio no ha sido establecido)' : ''
        var errorNombre = (!nombre) ? ' (El parámetro nombre no ha sido establecido)' : ''
        res.status(400)
        res.send({'error':'Error al crear el producto' + errorCantidad + errorPrecio + errorNombre})
    }
}

exports.modifyProduct = function(req, res) {//modifica un producto del stock
    console.log(req.body)
    var cantidad = req.body.Cantidad
    var precio = req.body.PrecioU
    var nombre = req.body.Nombre
    var idProducto = req.params.id

    if (idProducto){
        database.modifyProduct(res, idProducto, nombre, cantidad, precio, function(err){
            if(!err){
                res.status(204)
                res.send()
            }else{
                res.status(400)
                res.send({'error' : 'Los datos introducidos no son correctos'})
                res.end()
            }
        })
    }else{
        var errorId = (!nombre) ? ' (El parámetro id no ha sido establecido)' : ''
        res.status(400)
        res.send({'error':'Error al crear el producto' + errorCantidad + errorPrecio + errorNombre + errorId})
        res.end()
    }
}

exports.deleteProduct = function(req, res) {//borra un producto del stock
    console.log(req.params.id)
    var idProducto = req.params.id
    database.deleteProduct(res,idProducto,function(err) {
        if(err == null){
            res.status(204)
            res.send()
        }else{
            res.status(404)
            res.send({'ERROR':'No se ha encontrado el producto'})
        }
    })
}