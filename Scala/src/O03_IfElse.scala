object O03_IfElse {
  def main(args: Array[String]): Unit = {
    val x = 20;
    var res = "";

    if (x == 20) {
      //      println("x is equal to 20")
      res = "x == 20";
    } else {
      //      println("x is not equal to 20")
      res = "x != 20";
    }
    println(res);


    val res2 = if (x == 20) "x == 20" else "x != 20"; // if else statement
    println(res2);
  }
}
