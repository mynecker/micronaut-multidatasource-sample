package demo.persistence.db1

import io.micronaut.core.annotation.NonNull
import io.micronaut.transaction.annotation.Transactional
import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext

@Singleton
open class Service1 {

    @Inject
    @Named(value="db1")
    @PersistenceContext
    lateinit var entityManager: EntityManager

    @Inject
    lateinit var repoItem1: RepoItem1


    @Transactional(transactionManager = "db1")
    open fun doSomething(): Pair<MutableList<Item1>, MutableList<Any?>> {
        //sql will fail, just to have some entityManager sample code
        repoItem1.save(Item1(System.currentTimeMillis(),"some value "))
        entityManager.flush()
        val query = entityManager.createNativeQuery("select count(*) from Item1")
        val justAnotherResultList = query.resultList

        return Pair(repoItem1.findAll(),justAnotherResultList)
    }

}