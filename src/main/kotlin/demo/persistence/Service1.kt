package demo.persistence

import io.micronaut.transaction.annotation.TransactionalAdvice
import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Singleton
open class Service1 {

    @Inject
    @Named("db1")
    @PersistenceContext
    lateinit var entityManager: EntityManager

    @TransactionalAdvice("db1")
    open fun doSomething(){
        //sql will fail, just to have some entityManager sample code
        entityManager.createNativeQuery("SELECT * from universe")
    }

}