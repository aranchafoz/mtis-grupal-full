const database = require('./../database/database')

exports.creaFactura = function(req, res) {
    var idProducto = req.body.idProducto
    var idCliente = req.body.idCliente
    var Cantidad = req.body.Cantidad

    database.getProduct(res,idProducto,function(row) {//Comprobamos que el producto existe, y obtenemos el producto
        if( row[0].Cantidad >= Cantidad){ //Comprobamos que haya suficientes unidades en stock
            if(row !== null){//ok
                var Precio = row[0].PrecioU *Cantidad
                var total = row[0].Cantidad - Cantidad
                database.insertFactura(res,idProducto, idCliente, Cantidad, Precio,function(err) {
                    if(!err){ 
                        database.modifyProduct(res, idProducto,  row[0].Nombre, total, row[0].PrecioU, function(err){
                            if(err != null){
                                res.status(400)
                                res.send({'error' : 'Los datos introducidos no son correctos'})
                            }
                        })
                        var array = {
                            "Generado" : true,
                            "panelesEncargados" : 0,
                            "cliente" : idCliente
                        }
                        res.status(200)
                        res.send(array)
                    }else{
                        res.status(404)
                        res.send({'ERROR':'No se ha encontrado el producto'})
                    }
                })

               
            }else{
                res.status(404)
                res.send({'ERROR':'No se ha encontrado el producto'})
            }
        }else{
            var necesarios = Cantidad -  row[0].Cantidad
            var array = {
                "Generado" : false,
                "panelesEncargados" : necesarios,
                "cliente" : idCliente
            }
            res.status(200)
            res.send(array)
        }

    })


}

exports.deleteFactura = function(req, res) {
    var idProducto = req.params.id
    
    database.deleteFactura(res,idProducto,function(err) {
        if(err == null){
            res.status(204)
            res.send()
        }else{
            res.status(404)
            res.send({'ERROR':'No se ha encontrado el producto'})
        }
    })
}

exports.getFacturas = function(req, res) {
    database.getFacturas(res, function(row) {
        if(row != null){
            res.status(200)
            res.send(row)
        }else{
            res.status(404)
            res.send({'ERROR':'No hay nada en stock'})
        }
    })
}
