package main

import "github.com/gofiber/fiber/v2"

func main() {
    app := fiber.New()

    app.Get("/", func(c *fiber.Ctx) error {
		c.Set("Content-Type", "text/plain")
        return c.SendString("hello world")
    })

    app.Listen(":8080")
}