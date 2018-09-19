package recfun
import scala.collection.mutable.Stack

object Main {
    def main(args: Array[String]) {
      println("Pascal's Triangle")
      for (row <- 0 to 10) {
        add_space(row)
        for (col <- 0 to row)
          print(pascal(col, row) + " " )
          println()
      }
    }


  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int =
    if (c == 0) 1
    else if (r == c) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)

  def add_space(row: Int): Unit =
    for (space <- 0 to (10 - row))
      print(" ")


  /**
    * Exercise 2
    */

  //  def main(args: Array[String]) {
  //    print (balance( List('(', ')', ')','(' ) ) )
  //  }

  def printme(chars: List[Char]) = chars.foreach(print)

  def balance(chars: List[Char]): Boolean = {
    val stack = new scala.collection.mutable.Stack[Char]
    //      printme(chars)

    for (item <- chars) {
      //        print(item)
      if (item == '(') stack.push('(')

      else if (item == ')') {
        if (stack.isEmpty) return false
        else stack.pop()
      }
      //        else
      //          print(item)
    }

    if (stack.isEmpty) true
    else false
  }


  /**
    * Exercise 3
    */

//  def main(args: Array[String]) {
//    print(countChange(6, List(2, 3, 5)))
//  }


  def countChange_1(money: Int, coins: List[Int], i: Int): Int = {
    if (i < 0) 0

    else {

      if (money < 0) 0
      else if (money == 0) 1
      else if (money < coins(i)) countChange_1(money, coins, i - 1)
      else countChange_1(money - coins(i), coins, i) + countChange_1(money, coins, i - 1)
    }
  }


  def countChange(money: Int, coins: List[Int]): Int = {
    countChange_1(money, coins, coins.length -1)
  }

}