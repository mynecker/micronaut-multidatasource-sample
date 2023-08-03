package demo.persistence

import demo.persistence.db1.Service1
import io.micronaut.scheduling.annotation.Scheduled
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
class MyTrigger {

    @Inject
    lateinit var myService: Service1
    @Scheduled(fixedRate = "5s")
    fun triggerMe(){
        println("Triggered")
        val result = myService.doSomething()
        println("Received something")
        result.forEach {
            println("   -> $it")
        }

    }
}