package com.example.democonfigurationpropertiesbug.controller

import com.example.democonfigurationpropertiesbug.properties.CustomProperties
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.context.annotation.Import
import org.springframework.test.web.reactive.server.WebTestClient

@WebFluxTest(ExampleController::class)
@Import(CustomProperties::class)
internal class ExampleControllerTest {

    @Autowired
    private lateinit var client: WebTestClient

    @Test
    fun `verify example property value`() {
        val result = client
            .get()
            .uri("/example")
            .exchange()
            .expectStatus().isOk
            .expectBody(String::class.java)
            .returnResult()
            .responseBody

        assertThat(result).isEqualTo("example")
    }
}
