package demo.persistence.db2

import javax.persistence.Entity
import javax.persistence.Id


@Entity
class Item2 {

    @Id
    var id: Long = 1
    var value: String = "some Value"
}