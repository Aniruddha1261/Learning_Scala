//Open scala interpreter and run
//
//scala> val e = 9
//e: Int = 9
//
//scala> lazy val l = 9
//l: Int = <lazy>  // thus the value is not assigned directly to l
//                 // it will be assigned when l is used

class strict {
  val e = {
    println("Strict")
    9
  }
}

class LazyEval {
  lazy val l = {
    println("Lazy")
    9
  }
}

object O24_LazyEvaluation {

  def method1(n: Int) {
    println("Method 1")
    println(n)
  }

  def method2(n: => Int) {
    println("Method2")
    println(n)
  }


  def main(args: Array[String]): Unit = {
    val x = new strict
    val y = new LazyEval // lazy will not be printed as it is not still assigned

    println(x.e)
    println(y.l)


    val add = (a : Int, b : Int) => {
      println("Add")
      a + b
    }

    method1(add(5, 6))
    method2(add(5, 6))


  }
}