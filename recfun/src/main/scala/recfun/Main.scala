package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int =
      if(r==0 || c==0 || c==r) 1 else pascal(c-1, r-1) + pascal(c, r-1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balanceInner(chars: List[Char], count: Int): Boolean = {
        if (chars.isEmpty)
          return count == 0
        if (count < 0)
          return false
        if (chars.head == '(') {
          return balanceInner(chars.tail, count+1)
        }
        if (chars.head == ')') {
          return balanceInner(chars.tail, count-1)
        }

        balanceInner(chars.tail, count)
      }

      balanceInner(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

      def countChangeSorted(money: Int, sortedCoins: List[Int]) : Int = {
        if (sortedCoins.isEmpty) return 0
        if (money < 0) return 0
        if (money == 0) return 1
        val moneyLeft = money - sortedCoins.head
        countChangeSorted(money, sortedCoins.tail) + countChangeSorted(moneyLeft, sortedCoins)
      }

      countChangeSorted(money, coins.sortWith(_ > _))
    }
  }