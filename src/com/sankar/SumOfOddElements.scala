package com.sankar

object SumOfOddElements {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val sum = f(list)
    println(sum)
  }

  def f(arr: List[Int]): Int = {
    arr.filter { x => x % 2 != 0 }.sum
  }
}