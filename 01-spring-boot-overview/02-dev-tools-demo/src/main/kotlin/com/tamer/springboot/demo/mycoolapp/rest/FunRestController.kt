package com.tamer.springboot.demo.mycoolapp.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FunRestController {
    @GetMapping("/")
    fun sayHello(): String {
        return "Hello World From Spring Boot Kotlin"
    }

    @get:GetMapping("/workout")
    val dailyWorkOut: String
        get() = "Run a hard 5k Kotlin !"

    @get:GetMapping("/fortune")
    val dailyFortune: String
        get() = "Today is your lucky day. Kotlin"
}
