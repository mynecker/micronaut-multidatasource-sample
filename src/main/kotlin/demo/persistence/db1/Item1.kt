package demo.persistence.db1

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
data class Item1 (

    @Id
    var myId: Long = 1,
    var myValue: String = "some Value"
)