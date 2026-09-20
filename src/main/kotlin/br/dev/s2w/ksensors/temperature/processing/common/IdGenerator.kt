package br.dev.s2w.ksensors.temperature.processing.common

import com.fasterxml.uuid.Generators
import java.util.*

object IdGenerator {

    private val timeBasedEpochRandomGenerator = Generators.timeBasedEpochRandomGenerator()

    fun generateTimeBasedUUID(): UUID =
        timeBasedEpochRandomGenerator.generate()

}
