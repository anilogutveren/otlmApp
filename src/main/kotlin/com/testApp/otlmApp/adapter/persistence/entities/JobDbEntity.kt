package com.testApp.otlmApp.adapter.persistence.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.Instant
import java.util.UUID

@Entity
@Table
data class JobDbEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null,

    @Column
    var title: String,

    @Column
    var description: String,

    @Column
    var link: String,

    @Column
    var createdAt: Instant?
)