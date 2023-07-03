package com.example.democonfigurationpropertiesbug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class DemoConfigurationPropertiesBugApplication

fun main(args: Array<String>) {
    runApplication<DemoConfigurationPropertiesBugApplication>(*args)
}
