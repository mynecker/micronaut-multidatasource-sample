package demo.persistence.db2

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
class Item2 {

    @Id
    var id: Long = 1
    var value: String = "some Value"
}