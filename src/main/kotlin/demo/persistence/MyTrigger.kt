package demo.persistence

import demo.persistence.db1.Service1
import demo.persistence.db2.Service2
import io.micronaut.scheduling.annotation.Scheduled
import jakarta.annotation.PostConstruct
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
class MyTrigger {

    @Inject
    lateinit var myService1: Service1

    @Inject
    lateinit var myService2: Service2

    @PostConstruct
    fun allDone(){
        println("*** Wiring of beans seems to be ok ***")
    }
    @Scheduled(fixedRate = "5s")
    fun triggerMe(){

        val result1 = myService1.doSomething()
        println("JPA and EntityManager seem to be ok")
        println("  Result of repository1 query")
        result1.first.forEach {
            println("      -> $it")
        }
        println("  Result of native query1")
        result1.second.forEach {
            println("      -> $it")
        }

        val result2 = myService2.doSomething()
        println("  Result of repository2 query")
        result2.first.forEach {
            println("      -> $it")
        }
        println("  Result of native query2")
        result2.second.forEach {
            println("      -> $it")
        }
    }
}