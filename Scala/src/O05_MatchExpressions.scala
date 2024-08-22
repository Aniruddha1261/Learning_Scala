object O05_MatchExpressions {
  def main(args: Array[String]): Unit = {
    val age = "18";

    age match {
      case "20" => println(age);
      case "18" => println(age);
      case "30" => println(age);
      case "40" => println(age);
      case "50" => println(age);

      case _ => println("default"); // if nothing matches this is the default case
    }


    val result = age match {
      case "20" => age;
      case "18" => age;
      case "30" => age;
      case "40" => age;
      case "50" => age;

      case _ => println("default"); // if nothing matches this is the default case
    }
    println("result = " + result);

    val i = 5;
    i match {
      case 1 | 3 | 5 | 7 | 9  => println("odd");
      case 2 | 4 | 6 | 8 | 10 => println("even");
    }
  }
}
