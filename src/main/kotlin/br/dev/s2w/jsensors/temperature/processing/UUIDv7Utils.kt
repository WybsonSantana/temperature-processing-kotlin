package br.dev.s2w.jsensors.temperature.processing

import java.time.Instant
import java.time.OffsetDateTime
import java.time.ZoneId
import java.util.*

class UUIDv7Utils {

    companion object {
        fun extractOffsetDateTime(uuid: UUID?): OffsetDateTime? =
            uuid?.mostSignificantBits
                ?.ushr(16)
                ?.let { Instant.ofEpochMilli(it) }
                ?.let { OffsetDateTime.ofInstant(it, ZoneId.systemDefault()) }
    }

}
