package com.testApp.otlmApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OtlmAppApplication

fun main(args: Array<String>) {
	ElasticApmAttacher.attach();
	runApplication<OtlmAppApplication>(*args)
}
