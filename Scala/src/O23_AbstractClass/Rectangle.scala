package O23_AbstractClass

class Rectangle(var width: Double, var height : Double) extends Polygon {
  override def area: Double = width * height // this has to be implemented
}
