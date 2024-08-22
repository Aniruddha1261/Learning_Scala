object O07_HigherOrderFunction { // functions which can return functions


  def math(x: Double, y: Double, f: (Double, Double) => Double) : Double = f(x, y);

  def math2(x: Double, y: Double, z : Double , f: (Double, Double) => Double) : Double = f(f(x, y),z);

  def main(args: Array[String]): Unit = {
    val result = math(50, 20, (x, y) => x+y);
    val result2 = math(50, 20, (x, y) => x-y);
    val result3 = math(50, 20, (x, y) => x min y);
//    println(result);
//    println(result2);
//    println(result3);

    val result4 = math2(10, 20, 30, (x, y) => x min y)
    val result5 = math2(10, 20, 30, _+_);
    println(result4)
    println(result5)
  }
}
