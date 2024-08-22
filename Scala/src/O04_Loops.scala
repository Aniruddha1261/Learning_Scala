object O04_Loops {
  def main(args: Array[String]): Unit = {
    var x = 0;

    while (x < 10) {
      println("x = " + x);
      x += 1; // x = x + 1;
      //      x++; ?? Not Allowed
    }


    var y = 0;
    do {
      println("y = " + y)
      y += 1;
    } while (y < 10);


    for (i <- 1.to(5)) {
      println(" i using to " + i);
    }

    for (i <- 1.until(5)) {
      println(" i using until " + i);
    }

    for (i <- 1 to 5; j <- 1 to 3) {
      println(" i using multiple ranges " + i + " " + j);
    }


    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9);
    for (i <- lst) {
      println(" i using lst " + i);
    }

    for (i <- lst; if i < 6) {
      println(" i using filters " + i);
    }


    // use for loops as statements
    val result = for {i <- lst; if i < 6} yield {
      i * i
    }
    println("result = " + result);
  }
}