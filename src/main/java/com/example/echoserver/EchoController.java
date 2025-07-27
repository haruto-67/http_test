package com.example.echoserver;

import org.springframework.web.bind.annotation.*;

@RestController
public class EchoController {

    @GetMapping("/echo")
    public String echo(@RequestParam String text) {
        return text;
    }
}
