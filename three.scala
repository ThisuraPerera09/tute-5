package Tute5

object three {

  def sum(num: Int): Int = {
    if (num == 1)
      1
    else
      sum(num - 1) + num
  }

  def main(args: Array[String]) {
    println(sum(5))
  }

}
