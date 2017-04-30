package com.sankar

object FilterPositionsInAList {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5, 6)
    val removedList = f(list)
    removedList.foreach { x => println(x) }
  }

  def f(arr: List[Int]): List[Int] = {
    val l = scala.collection.mutable.ListBuffer.empty[Int]
    var position = 0
    arr.foreach(i => {
      position += 1
      if (position % 2 == 0) l += i
    })
    l.toList
  }
}