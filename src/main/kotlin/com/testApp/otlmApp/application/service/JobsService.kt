package com.testApp.otlmApp.application.service

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

class JobsService {


    private val logger: Log = LogFactory.getLog(JobsService::class.java)

    fun saveJobs(): String {
        logger.info("save jobs has been called")
        return "Found Jobs are saved"
    }
}