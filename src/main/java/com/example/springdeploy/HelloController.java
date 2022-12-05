package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Crear un controlador de tipo REST
public class HelloController {

    @Value("${app.message}")
    String message;

    @GetMapping("/hola") //Asociar una url al método holaMundo(). Pondríamos "localhost:8080/hola"
    public String holaMundo(){
        System.out.println(message);
        return"<h2>Holi caracoliiiii, vamos pal ayunti</h2>";
    }

    @GetMapping("/bootstrap")
    public String bootstrap(){
        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                  </head>
                  <body>
                    <h1>Hello, world!</h1>
                  </body>
                </html>
                """;
    }
}
