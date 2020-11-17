object Main {
  def main(args:Array[String]){
    var a = scala.io.StdIn.readLine()
    var b = scala.io.StdIn.readDouble()
    var c = scala.io.StdIn.readDouble()

    println("TOTAL = R$ %.2f".format(c * 0.15 + b))
  }
}
