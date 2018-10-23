package com.home.assistant.home

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HomeAssistantApplication

fun main(args: Array<String>) {
    runApplication<HomeAssistantApplication>(*args)
}
