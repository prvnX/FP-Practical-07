object q1{
    def filterEvenNumbers(Numbers:List[Int]):List[Int]=Numbers.filter((n:Int)=>n%2==0)
    def main(args:Array[String]):Unit={
        var Numbers=List(1,2,3,4,5,6,7,8,9,10)
        println(filterEvenNumbers(Numbers))
    }
}