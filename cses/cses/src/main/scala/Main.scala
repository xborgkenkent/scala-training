import scala.io.StdIn.readLine


object Main{
  def main(args: Array[String]) = {
    var x: List[Int] = List(2)
    x = 1 +: x
    println(s"${x.mkString(" ")}")
  }

  // def weirdAlgo(n: Int): List[Int] = {
  //   if(n==1) List(1)
  //   else {
  //     val f = if(n%2==0) true else false
  //     if(f) n :: weirdAlgo(n/2)
  //     else n :: weirdAlgo(n*3+1)
  //   }
  // }
}


