package demo.persistence

import io.micronaut.transaction.annotation.TransactionalAdvice
import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Singleton
open class Service2 {

    @Inject
    @Named("db2")
    @PersistenceContext
    lateinit var entityManager: EntityManager

    @TransactionalAdvice("db2")
    open fun doSomething(){
        //sql will fail, just to have some entityManager sample code
        entityManager.createNativeQuery("SELECT * from universe")
    }

}