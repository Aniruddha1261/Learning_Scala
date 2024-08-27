// Scala - Class

//             Getter?   Setter?
// --------   --------   --------
//  var         yes        yes
//  val         yes        no
// default      no         no

class User3(private var name: String, val age: Int) {
  def printName {
    println(name)
  }
}

object O20_Class2 {
  def main(args: Array[String]) {
    var user = new User3("Annu", 23)
    user.printName;
    println(user.age)
  }
}
