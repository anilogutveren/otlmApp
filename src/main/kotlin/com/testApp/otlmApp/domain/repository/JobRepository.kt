package com.testApp.otlmApp.domain.repository

import com.testApp.otlmApp.domain.model.JobEntity

interface JobRepository {

    fun findJobById(id: String): JobEntity?

    fun saveOrUpdate(job: JobEntity): JobEntity

    fun saveAll(jobs: List<JobEntity>): List<JobEntity>
}