package com.sankar

object ListReplication {
  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4,5)
    val replicatedList = f(2, list)
    replicatedList.foreach { x => println(x) }
  }

  def f(num: Int, arr: List[Int]): List[Int] = {
    val l = scala.collection.mutable.ListBuffer.empty[Int]
    arr.foreach(i => {
      (1 to num).foreach(_ => l += i)
    })
    l.toList
  }
}