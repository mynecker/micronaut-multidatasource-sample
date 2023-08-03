package demo

import demo.persistence.Service1
import demo.persistence.Service2
import io.micronaut.configuration.picocli.PicocliRunner
import jakarta.inject.Inject
import picocli.CommandLine
import picocli.CommandLine.Command

@Command(
    name = "multidatasources", description = ["..."],
    mixinStandardHelpOptions = true
)
class MultidatasourcesCommand : Runnable {

    @CommandLine.Option(names = ["-v", "--verbose"], description = ["..."])
    private var verbose : Boolean = false

    @Inject
    lateinit var service1: Service1

    @Inject
    lateinit var service2: Service2

    override fun run() {
        service1.doSomething()
        service2.doSomething()
        println("Bingo!")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            PicocliRunner.run(MultidatasourcesCommand::class.java, *args)
        }
    }
}
