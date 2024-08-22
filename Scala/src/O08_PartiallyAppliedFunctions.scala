import java.util.Date

object O08_PartiallyAppliedFunctions {
// if you keep a default/wildcard value it is called as a partially applied function

  def log(date: Date, message: String) = {
    println(date + " " + message);
  }


  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a+b+c;
    val f = sum(10, 20, _ : Int);
    println(sum(10, 20, 30));
    println(f(20)); // value will be given to the 3rd argument


    val date = new Date;
    val newLog = log(date, _:String);
    newLog("The message 1");
    newLog("The message 2");
    newLog("The message 3");
    newLog("The message 4");
  }
}
