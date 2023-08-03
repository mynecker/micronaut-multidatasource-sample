package demo.persistence.db1

import io.micronaut.serde.annotation.Serdeable
import jakarta.persistence.Entity
import jakarta.persistence.Id


@Serdeable
@Entity
data class Item1(
    @Id
    var myid: Long = 1,
    var myvalue: String = "some Value"
){

}