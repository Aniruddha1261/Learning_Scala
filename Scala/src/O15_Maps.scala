object O15_Maps {
  // collection of key - value pair
  // keys are unique, if you give duplicate keys it will take the last key
  // Mutable and immutable maps

  val myMap : Map[Int, String] = Map(801 -> "Annu", 802 -> "Nikku", 803 -> "Max")
  val myMap2: Map[Int, String] = Map(805 -> "Lua")

  def main(args: Array[String]): Unit = {
    println(myMap)
    println(myMap(801))
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)


    // iteration
    myMap.keys.foreach{ key =>
      println("key " + key)
      println("Value " + myMap(key))
    }

    //check if a key is present
    println(myMap.contains(801))

    // concatenate
    println(myMap ++ myMap2)

    println(myMap.size)
  }

}
