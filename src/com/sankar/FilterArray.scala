package com.sankar

object FilterArray {
  def main(args: Array[String]): Unit = {
    val arr = Array(10,9,8,2,7,5,1,3,0)
    val filteredList = f(3, arr.toList)
    filteredList.foreach { x => println(x) }
  }
  
  def f(delim:Int,arr:List[Int]):List[Int] = {
     arr.filter { x => x<delim }
 }

}