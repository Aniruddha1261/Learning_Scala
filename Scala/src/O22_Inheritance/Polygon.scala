package O22_Inheritance

class Polygon {
  def area: Double = 0.0
}

object Polygon{
  def main(args: Array[String]): Unit ={
    var poly = new Polygon
    var rect = new Rectangle(10, 5)
    var tria = new Triangle(10, 2)
    printArea(poly)
    printArea(rect)
    printArea(tria)
  }

  def printArea(p : Polygon): Unit ={
    println(p.area)
  }
}