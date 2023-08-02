package demo.persistence

import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import io.micronaut.transaction.annotation.Transactional

@Singleton
open class Service1 {

    @Inject
    @PersistenceContext
    lateinit var entityManager: EntityManager

    @Transactional(name="db1")
    open fun doSomething(){
        //sql will fail, just to have some entityManager sample code
        entityManager.createNativeQuery("SELECT * from universe")
    }

}