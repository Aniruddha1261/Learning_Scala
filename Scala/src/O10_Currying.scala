object O10_Currying {

  // Currying is the technique of transforming a function that takes multiple arguments
  // in a function that takes a single argument

  def add(x: Int, y: Int) = x + y;

  def add2(x: Int) = (y: Int) => x + y;

  def add3(x: Int) (y: Int) = x + y;


  def main(args: Array[String]) = {
    println(add(20, 10));
    println(add2(20)(10)); // curry function

    val sum40 = add2(40);
    println(sum40(100));

    println(add3(30)(20));

    val sum50 = add3(50)_;
    println(sum50(400));
  }
}
