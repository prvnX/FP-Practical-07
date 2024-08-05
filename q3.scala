object q3 {
  def isPrime(n: Int): Boolean = {
    def isPrimeRecursive(n: Int, m: Int): Boolean = {
      if (m < 2) true
      else if (n % m == 0) false
      else isPrimeRecursive(n, m - 1)
    }
    if (n <= 1) false
    else if (n == 2) true
    else isPrimeRecursive(n, n - 1)
  }

  def filterPrime(Numbers: List[Int]): List[Int] = {
    Numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val Numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(filterPrime(Numbers))
  }
}
