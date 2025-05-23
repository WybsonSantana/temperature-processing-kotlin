package br.dev.s2w.ksensors.temperature.processing

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TemperatureProcessingApplication

fun main(args: Array<String>) {
	runApplication<TemperatureProcessingApplication>(*args)
}
