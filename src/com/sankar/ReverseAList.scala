package com.sankar

import scala.annotation.tailrec

object ReverseAList {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val reversedList = reverseTR(list)
    reversedList.foreach { x => println(x) }
  }

  def f(arr: List[Int]): List[Int] = {
    var result: List[Int] = Nil
    var these = arr
    while (!these.isEmpty) {
      result = these.head :: result
      these = these.tail
    }
    result
  }

  def reverse(arr: List[Int]): List[Int] = {
    var result: List[Int] = Nil
    arr match {
      case head :: tail => head :: result
      case Nil          => Nil
    }
  }

  def reverseList[A](l: List[A]): List[A] = l match {
    case h :: tail => reverseList(tail) ::: List(h)
    case Nil       => Nil
  }

  def reverseTR[A](l: List[A]): List[A] = {
    @tailrec
    def _reverse(res: List[A], rem: List[A]): List[A] = rem match {
      case Nil       => res
      case h :: tail => _reverse(h :: res, tail)
    }
    _reverse(Nil, l)
  }

  def reverse[A](ls: List[A]): List[A] =
    ls.foldLeft(List[A]()) { (r, h) => h :: r }
}