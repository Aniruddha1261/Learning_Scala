object O14_Sets {
  // they cannon have duplicate values inside them
  // Mutable sets and immutable sets
  // by default sets are immutable
  // sets are not ordered

  val myList: List[Int] = List(1, 2, 3, 5, 8, 9, 4, 4)

  val mySet: Set[Int] = Set(1, 2, 3, 5, 8, 9, 4, 4)
  val mySet3: Set[Int] = Set(4, 2, 9, 18, 19)

  // for mutable sets
  var mySet2: scala.collection.mutable.Set[Int] = scala.collection.mutable.Set(1, 2, 3, 4, 5)

  def main(args: Array[String]): Unit = {
    // mutable sets
    println(myList)
    println(mySet)
    println(mySet(8)) // check if the value is present

    // immutable sets
    println(mySet2 + 10)
    println(mySet2)


    println(mySet.head)
    println(mySet.tail)
    println(mySet.isEmpty)

    // concatenation
    println(mySet ++ mySet3)
    println(mySet.++(mySet3))

    // intersection of 2 sets
    println(mySet.&(mySet3))
    println(mySet.intersect(mySet3))

    println(mySet.min)
    println(mySet.max)


    // iteration
    mySet.foreach(println)
    println()
    for (x <- mySet) {
      println(x)
    }
  }
}
