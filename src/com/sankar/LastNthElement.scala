package com.sankar

object LastNthElement {
  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4,5,6,7)
    val nthElement = lastNth(3, list)
    println(nthElement)
  }

  def lastNth[A](n: Int, l: List[A]): A = {
    def reverse[A](l: List[A]): List[A] = {
      def _reverse[A](r: List[A], l: List[A]): List[A] = l match {
        case Nil          => r
        case head :: tail => _reverse(head :: r, tail)
      }
      _reverse(List(), l)
    }

    def findKth[A](k: Int, l: List[A]): A = (k, l) match {
      case (0, h :: _)             => h
      case (k, _ :: tail) if k > 0 => findKth(k - 1, tail)
      case _                       => throw new NoSuchElementException
    }

    val r = reverse(l)
    findKth(n - 1, r)
  }
}