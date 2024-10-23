class User4(var name: String, var age: Int) {
  def this() {
    this("Tom", 32)
  }

  def this(name: String) {
    this(name, 32)
  }
}

object O21_AuxiliaryConstructor {
  def main(args: Array[String]): Unit = {
    var user1 = new User4("Annu", 23)
    var user2 = new User4()
    var user3 = new User4("Annu")
  }
}
