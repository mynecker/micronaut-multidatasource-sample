package demo.persistence.db1

import io.micronaut.serde.annotation.Serdeable
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.GenerationType.AUTO


@Serdeable
@Entity
data class Item1(
    @Id
    @GeneratedValue(strategy = AUTO)
    var myid: Long = 1,
    var myvalue: String = "some Value"
)