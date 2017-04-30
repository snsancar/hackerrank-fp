package com.sankar

object ArrayOfNElements {
  def main(args: Array[String]): Unit = {

    f(4)
  }

  def f(num: Int): List[Int] = {
    val list = List.range(0, num)

    //print(list + "\n")
    return list
  }
}