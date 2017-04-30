package com.sankar

object ListLength {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6)
    val count = f(list)
    println(count)
  }
  
  def f(arr:List[Int]):Int = {
    var count = 0
    arr.foreach { x => count += 1 }
    count
  }
}