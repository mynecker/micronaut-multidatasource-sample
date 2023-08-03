package demo.persistence

import demo.persistence.db1.Service1
import io.micronaut.scheduling.annotation.Scheduled
import jakarta.annotation.PostConstruct
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
class MyTrigger {

    @Inject
    lateinit var myService: Service1

    @PostConstruct
    fun allDone(){
        println("*** Wiring of beans seems to be ok ***")
    }
    @Scheduled(fixedRate = "5s")
    fun triggerMe(){

        val result = myService.doSomething()
        println("JPA and EntityManager seem to be ok")
        println("  Result of repository query")
        result.first.forEach {
            println("      -> $it")
        }
        println("  Result of native query")
        result.second.forEach {
            println("      -> $it")
        }

    }
}