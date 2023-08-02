package demo.persistence

import io.micronaut.transaction.annotation.Transactional
import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext

@Singleton
open class Service2 {

    @Inject
    @PersistenceContext
    lateinit var entityManager: EntityManager

    @Transactional(name="db2")
    open fun doSomething(){
        //sql will fail, just to have some entityManager sample code
        entityManager.createNativeQuery("SELECT * from universe")
    }

}