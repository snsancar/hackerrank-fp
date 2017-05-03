package com.sankar

object StringOPermute {
  
  def permute(s: String): String = {
    //s.sliding(2, 2).map(_.reverse).mkString
    s.grouped(2).map { x => x.reverse }.mkString
  }
  def main(args: Array[String]) {
    val n = readInt()
    (0 until n).foreach(_ => println(permute(readLine())))
  }
}