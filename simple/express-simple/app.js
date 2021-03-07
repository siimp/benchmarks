const express = require('express')
const app = express()

const HOST = 'localhost'
const PORT = 8080

app.get('/', (req, res) => {
	res.setHeader('Content-Type', 'text/plain')
	res.send('hello world')
})

console.info(`running server on ${HOST}:${PORT}`)
app.listen(PORT, HOST)