package demo.persistence.db1

import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import io.micronaut.transaction.annotation.Transactional

@Singleton
open class Service1 {

    //@Inject
    @PersistenceContext
    lateinit var entityManager: EntityManager

    @Inject
    lateinit var repoItem1: RepoItem1


    @Transactional
    open fun doSomething(){
        //sql will fail, just to have some entityManager sample code
        repoItem1.save(Item1(System.currentTimeMillis(),"some value "))
    }

}