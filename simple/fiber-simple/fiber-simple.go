package main

import "github.com/gofiber/fiber/v2"

func main() {
    app := fiber.New()

    app.Get("/", func(c *fiber.Ctx) error {
        c.Status(200)
		c.Set("Content-Type", "text/plain; charset=utf-8")
		return c.Send([]byte("hello world"))
    })

    app.Listen(":8080")
}