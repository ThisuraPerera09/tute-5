package Tute5
import scala.io.StdIn.readInt
object five {
  def addEven(n1: Int,n2 : Int): Int = {
    if(n1>=n2)
      0
    else
      n1+addEven(n1+2,n2);
  }


  def main(args: Array[String]) {
    var num1=2;
    printf("Enter the number => ")
    var num2 = readInt()
    println(addEven(num1,num2));

}
}
