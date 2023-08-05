package demo.persistence.db2

import io.micronaut.serde.annotation.Serdeable
import jakarta.persistence.Entity
import jakarta.persistence.Id


@Serdeable
@Entity
data class Item2(
    @Id
    var myid: Long = 1,
    var myvalue: String = "some Value"
){

}