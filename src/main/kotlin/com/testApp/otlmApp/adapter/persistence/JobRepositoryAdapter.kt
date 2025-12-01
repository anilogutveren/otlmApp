package com.testApp.otlmApp.adapter.persistence

import com.testApp.otlmApp.adapter.persistence.entities.JobDbEntity
import com.testApp.otlmApp.adapter.persistence.repository.JobRepositoryJpa
import com.testApp.otlmApp.domain.model.JobEntity
import com.testApp.otlmApp.domain.repository.JobRepository
import org.springframework.stereotype.Repository

@Repository
class JobRepositoryAdapter(
    val jobRepositoryJpa: JobRepositoryJpa
) : JobRepository {
    override fun findJobById(id: String): JobEntity? {
        TODO("Not yet implemented")
    }

    override fun saveOrUpdate(job: JobEntity): JobEntity {
        TODO("Not yet implemented")
    }

    override fun saveAll(jobs: List<JobEntity>): List<JobEntity> {
        return jobRepositoryJpa.saveAllJobs(jobs)
    }

    fun JobEntity.toEntity() = JobDbEntity(

    )

}