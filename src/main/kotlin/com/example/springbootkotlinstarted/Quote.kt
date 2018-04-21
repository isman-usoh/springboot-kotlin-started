package com.example.springbootkotlinstarted

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Value(
        val id: Long = 0,
        val quote: String = ""
) {
    override fun toString(): String {
        return "Value{" +
                "id=" + this.id +
                ", quote='" + quote + '\'' +
                '}'
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
data class Quote(
        val type: String = "",
        val value: Value = Value()
) {
    override fun toString(): String {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}'
    }
}
