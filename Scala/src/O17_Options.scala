object O17_Options {
  // it can give you instance of some or none

  val lst = List(1, 3, 2);
  val map = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")


  val opt : Option[Int] = None
  val opt2 : Option[Int] = Some(5)


  def main(args: Array[String]) {
    println(lst.find(_ > 1)) // gives the first satisfactory result in the list
    println(lst.find(_ > 6)) // gives none

    println(map.get(1))
    println(map.get(4))

    println(lst.find(_ > 0).get) // gives you the value inside the some
    //    println(lst.find(_ > 6).get) // gives an error // NoSuchElementException
    println(lst.find(_ > 6).getOrElse("No value found"))


    println(opt.isEmpty)
    println(opt2.isEmpty)
  }

}
