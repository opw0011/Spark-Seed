package com.domain;
import static spark.Spark.get;
import static spark.Spark.port;

/**
 * Created by opw on 12/1/2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        // define the port number
        port(8080);

        // routes
        get("/", (req, res) -> "Root");
        get("/hello", (req, res) -> "Hello World");
        get("/hello/:name", (req, res) -> String.format("Hello %s !", req.params(":name")));
    }
}
