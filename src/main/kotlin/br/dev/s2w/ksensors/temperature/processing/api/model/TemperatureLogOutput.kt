package br.dev.s2w.ksensors.temperature.processing.api.model

import io.hypersistence.tsid.TSID
import java.time.OffsetDateTime
import java.util.*

data class TemperatureLogOutput(
    val id: UUID,

    val sensorId: TSID,

    val registeredAt: OffsetDateTime,

    val value: Double
)