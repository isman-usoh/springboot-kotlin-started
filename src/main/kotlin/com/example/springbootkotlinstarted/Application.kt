package com.example.springbootkotlinstarted

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {
    @Bean
    fun init(repository: GreetingRepository) = CommandLineRunner {
        repository.save(Greeting("Jack", "Bauer"))
        repository.save(Greeting("Chloe", "O'Brian"))
        repository.save(Greeting("Kim", "Bauer"))
        repository.save(Greeting("David", "Palmer"))
        repository.save(Greeting("Michelle", "Dessler"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}