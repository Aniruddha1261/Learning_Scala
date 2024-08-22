import Array._

object O12_Arrays {
  // fixed size and same data type


  val myarray: Array[Int] = new Array[Int](4)
  val myarray2 = new Array[Int](5)
  val myarray3 = Array(1, 2, 3, 4, 5)

  def main(args: Array[String]): Unit = {
    println(myarray3.length)


    myarray(0) = 20;
    myarray(1) = 50;
    myarray(2) = 10;
    myarray(3) = 30;

    val result = concat(myarray, myarray3)

    //    println(myarray)
    //    for (x <- myarray) {
    //      println(x)
    //    }

    //    for (i <- 0 to (myarray.length - 1)) {
    //      println(myarray(i));
    //    }

    for (x <- result) {
      println(x)
    }

  }

}
