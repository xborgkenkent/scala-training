import scala.io.StdIn.readLine


object Main{
  def main(args: Array[String]) = {
    val x: List[Int] = List(1,2,3,4,5)
    print(x(1))
  }

  def triple(x: Int): Int = 3 * x

  def tripleEither(x: Either[String, Int]): Either[String, Int] =
    x.map(triple)


  def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(x: Int, acc: Int): Int =
    if (x > b) acc
    else loop(x + 1, acc + f(x))
  loop(a,0)
}


  def printDig(nums: List[Int]): Unit = {
    nums.foreach(num => {
      val x = printBinary(num)
      println(x)
    })
  }
  def printBinary(num: Int): String = {
    if (num <= 1) num.toString
    else printBinary(num / 2) + (num % 2).toString
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


