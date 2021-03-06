package csvreader

import org.bson.types.ObjectId

case class States(_id: ObjectId, name: String, count: Int) {}

object States {
  def apply(name: String, count: Int): States =
    States(new ObjectId(), name, count)
}
