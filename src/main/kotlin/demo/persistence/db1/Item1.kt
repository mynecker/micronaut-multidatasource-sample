package demo.persistence.db1

import javax.persistence.Entity
import javax.persistence.Id


@Entity
class Item1 {

    @Id
    var id: Long = 1
    var value: String = "some Value"
}