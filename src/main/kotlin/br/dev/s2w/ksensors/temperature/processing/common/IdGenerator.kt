package br.dev.s2w.ksensors.temperature.processing.common

import com.fasterxml.uuid.Generators
import java.util.*

class IdGenerator {

    companion object {
        private val timeBasedEpochRandomGenerator = Generators.timeBasedEpochRandomGenerator()

        fun generateTimeBasedUUID(): UUID = timeBasedEpochRandomGenerator.generate()
    }

}
