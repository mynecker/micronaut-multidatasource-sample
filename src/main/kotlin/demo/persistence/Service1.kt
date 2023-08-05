package demo.persistence

import demo.persistence.db1.Item1
import demo.persistence.db1.RepoItem1
import io.micronaut.transaction.annotation.Transactional
import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext

@Singleton
open class Service1 {

    @Inject
    @PersistenceContext(name = "default")
    lateinit var entityManager: EntityManager

    @Inject
    lateinit var repoItem1: RepoItem1

    @Transactional("default")
    open fun doSomething(){
        repoItem1.save(Item1(System.currentTimeMillis(),"some value"))
        entityManager.flush()
    }

}