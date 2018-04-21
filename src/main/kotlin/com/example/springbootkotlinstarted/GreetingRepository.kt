package com.example.springbootkotlinstarted

import org.springframework.data.repository.CrudRepository

interface GreetingRepository: CrudRepository<Greeting, Long> {
    fun findByLastName(name: String): List<Greeting>
}