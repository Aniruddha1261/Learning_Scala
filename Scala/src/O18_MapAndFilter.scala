object O18_MapAndFilter {


  val lst = List(1, 2, 3, 5, 7, 10, 13)
  val mymap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")

  def main(args: Array[String]): Unit = {

    // Map Method
    println("Map Methods")
    println(lst.map(_ * 2)) // will double each element of the list
    println(lst.map(x => x * 2))
    println(lst.map(x => "Hi" + x))
    println(lst.map(x => "Hi" * x))
    println(lst) // original list doesn't change

    println()

    println(mymap.map(x => "Hi" + x))
    println(mymap.mapValues(x => "Hi " + x))

    println()

    println("hello".map(_.toUpper))
    println(List(List(1, 2, 3), List(3, 4, 5)).flatten)
    println(lst.map(x => List(x, x + 1)))
    println(lst.flatMap(x => List(x, x + 1)))

    println()

    // Filter Method
    println("Filter Methods")
    println(lst.filter(x => x % 2 == 0))
    println(lst.filter(x => x % 2 != 0))
  }
}
