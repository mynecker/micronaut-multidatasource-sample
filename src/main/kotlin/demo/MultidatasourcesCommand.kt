package demo

import demo.persistence.db1.Service1
import io.micronaut.configuration.picocli.PicocliRunner
import jakarta.inject.Inject
import picocli.CommandLine.Command
import io.micronaut.runtime.Micronaut.run
fun main(args: Array<String>) {
    run(*args)
}
