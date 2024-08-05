object q2{
    def calculateSquare(Numbers:List[Int]):List[Int]=Numbers.map((n:Int)=>n*n)
    def main(args:Array[String]):Unit={
        var Numbers=List(1,2,3,4,5)
        println(calculateSquare(Numbers))
    }
}