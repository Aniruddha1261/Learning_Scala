object O19_ReduceFoldOrScan {
  // Reduce, Fold, or Scan (LEFT/RIGHT)
  // reduceLeft, reduceRight, foldLeft, foldRight, scanRight, scanLeft

  val lst = List(1, 2, 3, 5, 7, 10, 13)
  val lst2 = List("A", "B", "C")

  def main(args: Array[String]): Unit = {
    println("redueLeft and reduceRight method")
    println(lst2.reduceLeft(_ + _))
    println(lst.reduceLeft(_ + _))

    println(lst.reduceLeft((x, y) => {
      println(x + " , " + y); x + y
    }))

    println(lst.reduceLeft(_ - _))
    println(lst.reduceRight(_ - _))
    println(lst.reduceRight((x, y) => {
      println(x + " , " + y); x - y
    }))

    println()
    println("foldLeft and foldRight method")
    println(lst.foldLeft(0)(_ + _))
    println(lst.foldLeft(100)(_ + _)) // here 100 is the first value

    println(lst2.foldLeft("Z")(_ + _))
    println(lst2.foldRight("Z")(_ + _))

    println()
    println("scanLeft and scanRight method")
    println(lst.scanLeft(100)(_ + _)) // here 100 is the first value
    println(lst2.scanLeft("Z")(_ + _))

    println(lst.scanRight(100)(_ + _)) // here 100 is the first value
    println(lst2.scanRight("Z")(_ + _))
  }

}
