class User(var name: String, var age: Int)

// if you define name as private you cannot access it outside the class
class User2(private var name: String, var age: Int) {
  def printName: Unit = {
    println(name)
  }
}

// var     getter  setter
// val     getter  ------
// default ------  ------

object O20_Class {
  // you can't create an instance out of object
  def main(args: Array[String]): Unit = {
    var user = new User("Annu", 23)
    println(user.name)
    println(user.age)

    user.name = "Nikku";
    user.age = 20
    println(user.name)
    println(user.age)

    var user2 = new User2("Ann", 15)
    user2.printName
    println(user2.age)
  }


}


