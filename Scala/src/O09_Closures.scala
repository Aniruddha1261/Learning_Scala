import java.util.Date;
// A closure is a function which uses one or more variables declared outside this function.
// impure closure -> var || pure closure -> val

object O09_Closures {

  var number = 10;
  val add = (x: Int) => {
    number = x + number;
    number;
  };


  def main(args: Array[String]) {
    println(add(20));
    number = 100;
    println(add(20));
    println(number);
  }
}
