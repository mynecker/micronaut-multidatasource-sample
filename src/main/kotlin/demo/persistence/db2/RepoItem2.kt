package demo.persistence.db2

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository("db2")
interface RepoItem2: JpaRepository<Item2,Long> {
}