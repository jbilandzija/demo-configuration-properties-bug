package com.example.democonfigurationpropertiesbug.controller

import com.example.democonfigurationpropertiesbug.properties.CustomProperties
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController(
    private val customProperties: CustomProperties,
) {

    @GetMapping("/example")
    @ResponseStatus(HttpStatus.OK)
    suspend fun example() = customProperties.prop
}
