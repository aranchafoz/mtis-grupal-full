const express = require('express')
const bodyParser = require('body-parser')
const app = express()

//FICHEROS USADOS
const stock = require('./models/stock')
const factura = require('./models/factura')
//INICIAALIZAR RUTAS
const router = express.Router()
router.use(bodyParser.json())
app.use(bodyParser.json())
app.use(router)



//DEFINIR RUTAS
//STOCK
app.get('/ecommerce/stock', stock.getStock)
app.post('/ecommerce/stock' , stock.addProduct)

app.get('/ecommerce/stock/:id', stock.getProduct)
app.put('/ecommerce/stock/:id', stock.modifyProduct)
app.delete('/ecommerce/stock/:id', stock.deleteProduct)

//FACTURA
app.get('/ecommerce/factura' , factura.getFacturas)
app.post('/ecommerce/factura' , factura.creaFactura)
app.delete('/ecommerce/factura/:id', factura.deleteFactura)

app.listen(process.env.PORT || 3002, function() {
    console.log('¡¡¡Supermegaservidor express iniciado, en el puerto 3002!!!')
    console.log('Ponlo a prueba...')
})

module.exports = app