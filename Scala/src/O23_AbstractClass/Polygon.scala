package O23_AbstractClass

// If a class is declared abstract, it cannot be instantiated. An abstract class does a few things for the inheriting subclass
// Define methods which can be used by the inheriting subclass
// Define abstract methods which the inheriting subclass must implement
// Provide a common interface which allows the subclass to be interchanged with all other subclasses

abstract class Polygon {
  def area: Double; // don't provide body to this method
}

object Polygon{
  def main(args: Array[String]): Unit ={
//    var poly = new Polygon   // It cannot be instantiated
    var rect = new Rectangle(10, 5)
    var tria = new Triangle(10, 2)
    printArea(rect)
    printArea(tria)
  }

  def printArea(p : Polygon): Unit ={
    println(p.area)
  }
}