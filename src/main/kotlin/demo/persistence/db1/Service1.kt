package demo.persistence.db1

import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import io.micronaut.transaction.annotation.Transactional

@Singleton
open class Service1 {

    @Inject
    @Named("db1")
    @PersistenceContext
    lateinit var entityManager: EntityManager

    @Transactional(transactionManager = "db1")
    open fun doSomething(){
        //sql will fail, just to have some entityManager sample code
        entityManager.createNativeQuery("SELECT * from universe")
    }

}