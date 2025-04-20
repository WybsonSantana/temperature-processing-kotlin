package br.dev.s2w.jsensors.temperature.processing.api.controller

import br.dev.s2w.jsensors.temperature.processing.api.model.TemperatureLogOutput
import br.dev.s2w.jsensors.temperature.processing.common.IdGenerator
import io.hypersistence.tsid.TSID
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.time.OffsetDateTime

@RestController
@RequestMapping("/api/sensors/{sensorId}/temperatures/data")
class TemperatureProcessingController {

    private val log: Logger = LoggerFactory.getLogger(TemperatureProcessingController::class.java)

    @PostMapping(consumes = [MediaType.TEXT_PLAIN_VALUE])
    fun data(@PathVariable sensorId: TSID, @RequestBody input: String) {
        if (input.isBlank())
            throw ResponseStatusException(HttpStatus.BAD_REQUEST)

        val temperature = input.toDoubleOrNull()
            ?: throw ResponseStatusException(HttpStatus.BAD_REQUEST)

        val logOutput = TemperatureLogOutput(
            id = IdGenerator.generateTimeBasedUUID(),
            sensorId = sensorId,
            value = temperature,
            registeredAt = OffsetDateTime.now()
        )

        log.info(logOutput.toString())
    }

}
