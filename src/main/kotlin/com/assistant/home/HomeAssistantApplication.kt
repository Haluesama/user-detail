package com.home.assistant.homeassistant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HomeAssistantApplication

fun main(args: Array<String>) {
    runApplication<HomeAssistantApplication>(*args)
}
