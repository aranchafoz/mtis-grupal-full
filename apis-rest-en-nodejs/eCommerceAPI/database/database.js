const mysql = require('mysql')

const db_config = { //si necesitas las credenciales contacta conmigo
  database: 'almacentesla',
  host: 'localhost',
  user: 'almacentesla',
  password: 'almacentesla'
}
exports.db_config = db_config
var mysqlPool = mysql.createPool(db_config);

//STOCK
exports.getStock = function (res, callback) { //Devuelve todos los productos
  mysqlPool.getConnection(function (err, db) {
    if (!err) {
      db.query('SELECT * FROM `productos`', function (err, rows) {
        if (!err) {
          if (rows.length > 0) {
            callback(rows)
          } else {
            callback(null)
          }
        } else {
          console.log(err.message)
          res.status(500)
          res.send({ 'error': 'Problema con la base de datos' })
        }
        db.release()
      })
    } else {
      console.log(err.message)
      res.status(500)
      res.send({ 'error': 'Problema de conexión con la base de datos' })
    }
  })
}

exports.getProduct = function (res, id, callback) { //Devuelve un producto por id
  mysqlPool.getConnection(function (err, db) {
    if (!err) {
      db.query('SELECT * FROM `productos` WHERE id = ?', [id], function (err, rows) {
        if (!err) {
          if (rows.length > 0) {
            callback(rows)
          } else {
            callback(null)
          }
        } else {
          console.log(err.message)
          res.status(500)
          res.send({ 'ERROR': 'Problema con la base de datos' })
        }
        db.release()
      })
    } else {
      console.log(err.message)
      res.status(500)
      res.send({ 'ERROR': 'Problema de conexión con la base de datos' })
    }
  })
}

exports.getProductId = function (res, nombre, callback) { //Devuelve la id de un producto
  mysqlPool.getConnection(function (err, db) {
    if (!err) {
      db.query('SELECT id FROM `productos` WHERE Nombre = ?', [nombre], function (err, rows) {
        if (!err) {
          if (rows.length > 0) {
            callback(rows)
          } else {
            callback(null)
          }
        } else {
          console.log(err.message)
          res.status(500)
          res.send({ 'ERROR': 'Problema con la base de datos' })
        }
        db.release()
      })
    } else {
      console.log(err.message)
      res.status(500)
      res.send({ 'ERROR': 'Problema de conexión con la base de datos' })
    }
  })
}

exports.insertStock = function (res, nombre, cantidad, precio, callback) { //Inserta un producto en el stock
  mysqlPool.getConnection(function (err, db) {
    if (!err) {
      db.query('INSERT INTO `productos`(`Nombre`, `Cantidad`, `PrecioU`) VALUES (?,?,?)', [nombre, cantidad, precio], function (err, rows) {
        if (!err) {
          callback()
        } else {
          console.log(err.message)
          res.status(500)
          res.send({ 'ERROR': 'Problema con la base de datos' })
        }
        db.release()
      })
    } else {
      console.log(err.message)
      res.status(500)
      res.send({ 'ERROR': 'Problema de conexión con la base de datos' })
    }
  })
}

exports.modifyProduct = function (res, id, nombre, cantidad, precio, callback) { //Modifica un producto por id
  mysqlPool.getConnection(function (err, db) {
    if (!err) {
      if (nombre && cantidad && precio) {
        
          db.query('UPDATE `productos` SET `Nombre` = ?, `Cantidad` = ?, `PrecioU` = ? WHERE `productos`.`id` = ?;', [nombre, cantidad, precio, id], function (err, rows) {
            if (!err) {
              callback(null)
            } else {
              callback({err : "error al modificar el producto"})
            }
          })
        /*
        if (cantidad) {
          db.query('UPDATE `productos` SET `Cantidad` = ? WHERE `productos`.`id` = ?;', [cantidad, id], function (err, rows) {
            if (!err) {
              callback(null)
            } else {
              callback({err : "error al modificar la cantidad"})
            }
          })
        }
        if (precio) {
          db.query('UPDATE `productos` SET `PrecioU` = ? WHERE `productos`.`id` = ?;', [precio, id], function (err, rows) {
            if (!err) {
              callback(null)
            } else {
              callback({err : "error al modificar el precio"})
            }
          })
        }*/
        db.release()
      }else{
        var err = "Error con los datos"
        callback(err)
      }
    } else {
      callback({err : "Error con la base de datos"})
    }
  })
}

exports.deleteProduct = function (res, id, callback) { //Borra un producto por id
  mysqlPool.getConnection(function (err, db) {
    if (!err) {
      db.query('DELETE FROM `productos` WHERE id = ?', [id], function (err, rows) {
        if (!err && rows.affectedRows > 0) {
          callback(null)
          res.status(200)
        } else {
          var err = "Error con los datos"
          callback(err)
        }
        db.release()
      })
    } else {
      callback({err : "Error con la base de datos"})
    }
  })
}

exports.insertFactura = function (res, idProducto, idCliente, Cantidad, Precio, callback) { //Inserta un producto en el stock
  mysqlPool.getConnection(function (err, db) {
    if (!err) {
      db.query('INSERT INTO `facturas`(`idProducto`, `idCliente`, `Cantidad`,`Precio`) VALUES (?,?,?,?)', [idProducto, idCliente, Cantidad, Precio], function (err, rows) {
        if (!err) {
          var err = null
          callback(err)
        } else {
          var err = "Error con los datos"
          callback(err)
        }
        db.release()
      })
    } else {
      var err = "Problema con los datos"
      callback(err)
    }
  })
}

exports.deleteFactura = function (res, id, callback) { //Borra un producto por id
  mysqlPool.getConnection(function (err, db) {
    if (!err) {
      db.query('DELETE FROM `facturas` WHERE id = ?', [id], function (err, rows) {
        if (!err && rows.affectedRows > 0) {
          callback(null)
          res.status(200)
        } else {
          var err = "Error con los datos"
          callback(err)
        }
        db.release()
      })
    } else {
      callback({err : "Error con la base de datos"})
    }
  })
}

exports.getFacturas= function (res, callback) { //Devuelve todos los productos
  mysqlPool.getConnection(function (err, db) {
    if (!err) {
      db.query('SELECT * FROM `facturas`', function (err, rows) {
        if (!err) {
          if (rows.length > 0) {
            callback(rows)
          } else {
            callback(null)
          }
        } else {
          console.log(err.message)
          res.status(500)
          res.send({ 'error': 'Problema con la base de datos' })
        }
        db.release()
      })
    } else {
      console.log(err.message)
      res.status(500)
      res.send({ 'error': 'Problema de conexión con la base de datos' })
    }
  })
}