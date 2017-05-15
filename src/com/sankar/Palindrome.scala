package src.com.sankar

object Palindrome {
  def main(args: Array[String]): Unit = {

    val str = "madam"
    println(palindrome(str))
  }

  def palindrome(input: String) = input.reverse == input
}