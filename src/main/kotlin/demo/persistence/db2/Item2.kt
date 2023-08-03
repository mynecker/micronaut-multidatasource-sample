package demo.persistence.db2

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
data class Item2 (
    @Id
    var myId: Long = 1,
    var myValue: String = "some Value"
)