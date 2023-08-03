package demo.persistence.db1

import jakarta.persistence.Entity
import jakarta.persistence.Id


@Entity
class Item1 {

    @Id
    var id: Long = 1
    var value: String = "some Value"
}