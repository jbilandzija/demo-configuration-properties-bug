package com.example.democonfigurationpropertiesbug.properties

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "custom")
data class CustomProperties(
    var prop: String = "",
)
