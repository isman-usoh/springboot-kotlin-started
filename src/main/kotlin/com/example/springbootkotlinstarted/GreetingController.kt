package com.example.springbootkotlinstarted

import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController(val repository: GreetingRepository) {

    @GetMapping("/all")
    fun findAll() = repository.findAll()

    @GetMapping("/id/{name}")
    fun findByLastname(@PathVariable name: String) = repository.findByLastName(name)

    @GetMapping("/api")
    fun loadApi(): Quote {
        val restTemplate = RestTemplate()
        return restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote::class.java)
    }
}