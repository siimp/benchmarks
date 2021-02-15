package main

import (
    "github.com/gin-gonic/gin"
)

func main() {
	r := gin.New()
	r.GET("/", func(c *gin.Context) {
		c.Data(200, "text/plain; charset=utf-8", []byte("hello world"))
	})
	r.Run()
}