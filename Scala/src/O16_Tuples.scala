object O16_Tuples {
  // can contain different types of datatype
  // fixed size & immutable
  // Tuples can contain 22 elements

  val mytuple = (1, 2, "hello", true)
  val mytuple2 = new Tuple3(1, false, "nikku") // you need to define the number of element in front of tuple declaration
  val mytuple3 = new Tuple3(1, "hello", (2,3));

  def main(args: Array[String]){
    println(mytuple)
    println(mytuple2)

    println(mytuple._3)
    println(mytuple3._3)

    //iteration in tuples
    mytuple2.productIterator.foreach{
      i => println(i);
    }

    // creating a tuple
    println(1 -> "Tom")
    println(1 -> "Tom" -> true)
  }
}
