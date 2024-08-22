object O06_Functions {
// in Scala you can also define function name as notations like +, ** etc.
  object Math {
    def add(x: Int, y: Int): Int = {
      return x + y;
    }

    def square(x: Int) = x * x;

    def sub(x: Int = 45, y: Int = 15): Int = {  // giving default parameters
      return x - y;
    }
  }


  def add(x: Int, y: Int): Int = {
    return x + y;
  }

  def sub(x: Int, y: Int): Int = {
    x - y; // if you don't use return keyword then the last line is returned automatically
  }

  def mul(x: Int, y: Int): Int = x * y; // single line function

  def div(x: Int, y: Int) = x / y; // if you know its going to return a certain type
                                        // of datatype then you can ignore declaring the return type

  def print(x: Int, y : Int): Unit = { // where the function does not return anything give return type as Unit
    println(x+y);
  }

  def main(args: Array[String]): Unit = {
    println(add(45, 15));
    println(sub(45, 15));
    println(mul(5, 5));
    println(div(45, 15));

    println(Math.add(45, 15));
    println(Math square 5); // if you have only one argument
    println(Math.sub(30)); // you only pass one parameter and the other has taken the default value

    print(30, 5);

    val ad = (x : Int, y : Int) => x + y; // anonymous function, function without a name
    println(ad(300,500));
  }

}
