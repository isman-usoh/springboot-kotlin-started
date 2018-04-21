package com.example.springbootkotlinstarted

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Greeting(
        val firstName: String = "",
        val lastName: String = "",
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0
)

fun main(args: Array<String>) {
    val data = Array<String>(10, "");
    data
}