package com.testApp.otlmApp.adapter.api

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    private val logger: Log = LogFactory.getLog(HelloWorldController::class.java)

    @RequestMapping("/")
    fun home(): String {
        logger.info("home() has been called")
        return "Hello, World!"
    }
}