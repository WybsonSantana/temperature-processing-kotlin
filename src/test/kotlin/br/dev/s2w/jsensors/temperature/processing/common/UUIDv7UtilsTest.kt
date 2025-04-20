package br.dev.s2w.jsensors.temperature.processing.common

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.time.OffsetDateTime
import java.time.temporal.ChronoUnit

internal class UUIDv7UtilsTest {

    @Test
    fun `should generate uuid v7`() {
        val uuid = IdGenerator.generateTimeBasedUUID()

        val uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid)?.truncatedTo(ChronoUnit.MINUTES)
        val currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES)

        Assertions.assertThat(uuidDateTime?.equals(currentDateTime))
    }

}
