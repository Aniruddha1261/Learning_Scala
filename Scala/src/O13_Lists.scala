object O13_Lists {

  val myList: List[Int] = List(1, 2, 3, 4, 5, 6, 7)
  val names: List[String] = List("Annu", "Nikku", "Tom")


  def main(args: Array[String]): Unit = {
    println(myList)
    println(names)

//    myList(0) = 5; // Immutable -> can't change value
    println(0 :: myList) // cons ::
    println(myList)

    println(Nil)  // Empty LIst
    println( 1 :: 5 :: 9 :: Nil)

    println(myList.head)
    println(myList.tail)
    print(myList.isEmpty)
    println(myList.reverse)
    println(List.fill(5)(2))
    println(myList.max)


    // Iteration
    myList.foreach(println)


    var sum : Int = 0;
    myList.foreach(sum += _)
    println(sum)

    for (name <- names){
      println(name)
    }
  }

}
