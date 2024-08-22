object O02_StringInterpolation {
  def main(args: Array[String]): Unit = {
    val name = "mark"
    val age = 18
    println(name + " is " + age + " years old")
    println(s"$name is $age years old")         // s string interpolation
    println(f"$name%s is $age%d years old")     // f string interpolation to give the type of variable, this is type safe
    println(s"Hello \nworld")
    println(raw"Hello \nworld")                 // \n doesn't work
  }
}