package demo.persistence

import io.micronaut.transaction.annotation.TransactionalAdvice
import jakarta.inject.Inject
import jakarta.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Singleton
open class Service2 {

    @Inject
    @PersistenceContext(name = "db2")
    lateinit var entityManager: EntityManager

    @TransactionalAdvice("db2")
    open fun doSomething(){
        entityManager.createNativeQuery("SELECT * from universe")
    }

}