package demo.persistence.db2

import io.micronaut.core.annotation.NonNull
import io.micronaut.transaction.annotation.Transactional
import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext

@Singleton
open class Service2 {

    @Inject
    @Named(value="db2")
    @PersistenceContext
    lateinit var entityManager: EntityManager

    @Inject
    lateinit var repoItem2: RepoItem2


    @Transactional(transactionManager = "db2")
    open fun doSomething(): Pair<MutableList<Item2>, MutableList<Any?>> {
        //sql will fail, just to have some entityManager sample code
        repoItem2.save(Item2(System.currentTimeMillis(),"some value "))
        entityManager.flush()
        val query = entityManager.createNativeQuery("select count(*) from Item2")
        val justAnotherResultList = query.resultList

        return Pair(repoItem2.findAll(),justAnotherResultList)
    }

}