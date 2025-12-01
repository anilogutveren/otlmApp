package com.testApp.otlmApp.adapter.api

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class JobController {

    private val logger: Log = LogFactory.getLog(JobController::class.java)

    @RequestMapping("/jobs")
    fun postJobs(
        @RequestBody jobs: List<String>
    ): String {
        logger.info("Received jobs")
        return "Hello, World!"
    }
}