package demo.persistence.db1

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository("db1")
interface  RepoItem1: JpaRepository<Item1,Long> {
}