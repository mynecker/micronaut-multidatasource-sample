package demo.persistence.db1

import demo.persistence.db1.Item1
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository(value = "db1")
interface RepoItem1: CrudRepository<Item1,Long> {
}