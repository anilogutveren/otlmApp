package com.testApp.otlmApp.adapter.api

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class JobController {

    private val logger: Log = LogFactory.getLog(JobController::class.java)

    @PostMapping("/jobs")
    fun postJobs(
        @RequestBody jobs: String
    ): String {
        logger.info("postJobs() has been called with jobs: $jobs")
        return "Received jobs: $jobs"
    }
}