package demo

import demo.persistence.db1.Service1
import io.micronaut.configuration.picocli.PicocliRunner
import jakarta.inject.Inject
import picocli.CommandLine.Command

@Command(
    name = "multidatasources", description = ["..."],
    mixinStandardHelpOptions = true
)
class MultidatasourcesCommand : Runnable {

    @Inject
    lateinit var service1: Service1

    override fun run() {
          service1.doSomething()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            PicocliRunner.run(MultidatasourcesCommand::class.java, *args)
        }
    }
}
