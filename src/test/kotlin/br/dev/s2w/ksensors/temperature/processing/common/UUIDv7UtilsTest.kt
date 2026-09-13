package br.dev.s2w.ksensors.temperature.processing.common

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.OffsetDateTime
import java.time.temporal.ChronoUnit

class UUIDv7UtilsTest {

    @Test
    fun `should generate UUID v7`() {
        val uuid = IdGenerator.generateTimeBasedUUID()

        val uuidDateTime: OffsetDateTime? = UUIDv7Utils.extractOffsetDateTime(uuid)?.truncatedTo(ChronoUnit.MINUTES)
        val currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES)

        assertThat(uuidDateTime).isEqualTo(currentDateTime)
    }


}