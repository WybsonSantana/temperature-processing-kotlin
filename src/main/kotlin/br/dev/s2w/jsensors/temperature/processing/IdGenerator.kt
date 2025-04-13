package br.dev.s2w.jsensors.temperature.processing

import com.fasterxml.uuid.Generators
import java.util.*

class IdGenerator {

    companion object {
        private val timeBasedEpochRandomGenerator = Generators.timeBasedEpochRandomGenerator()

        fun generateTimeBasedUUID(): UUID = timeBasedEpochRandomGenerator.generate()
    }

}
