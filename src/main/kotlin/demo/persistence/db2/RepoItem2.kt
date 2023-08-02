package demo.persistence.db2

import demo.persistence.db1.Item1
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository(value = "db2")
interface RepoItem2: CrudRepository<Item2,Long> {
}