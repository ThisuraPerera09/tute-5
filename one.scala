package Tute5
import scala.io.StdIn.readInt
object one {
  def prime(p:Int,n:Int):Boolean= {
    if(n==1) true
    else {
      if (p % n == 0) false
      else prime(p, n - 1)
    }
}

  def main(args: Array[String]) {
    printf("Enter the number => ")
    var num = readInt()
    println(prime(num,num/2))
  }
}
