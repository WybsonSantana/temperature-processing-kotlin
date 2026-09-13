package br.dev.s2w.ksensors.temperature.processing.common

import java.time.Instant
import java.time.OffsetDateTime
import java.time.ZoneId
import java.util.*

object UUIDv7Utils {

    fun extractOffsetDateTime(uuid: UUID?): OffsetDateTime? =
        uuid?.run {
            OffsetDateTime.ofInstant(
                Instant.ofEpochMilli(mostSignificantBits ushr 16),
                ZoneId.systemDefault()
            )
        }

}
