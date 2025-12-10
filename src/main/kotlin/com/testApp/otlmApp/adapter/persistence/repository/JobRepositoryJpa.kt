package com.testApp.otlmApp.adapter.persistence.repository

import com.testApp.otlmApp.adapter.persistence.entities.JobDbEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface JobRepositoryJpa : JpaRepository<JobDbEntity, UUID> {

    fun saveAllJobs(jobs: List<JobDbEntity>): List<JobDbEntity> {
        return saveAll(jobs)
    }

}