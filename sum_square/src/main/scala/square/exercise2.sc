
//object exercise2 {
//  def sum (f: Int => Int, a: Int, b: Int ): Int = {
//    def loop(a: Int, acc: Int) : Int =
//      if (a > b) acc
//      else loop(a + 1, f(a) + acc)
//      loop(a,0)
//  }
//  sum(x=> x*x, 3, 5)
//}


//object exercise3 {
//  def sum (f: Int => Int): (Int,Int) => Int = {

//  }
////  def sumInts = sum(x => x*x)
////  def sumCubes = sum(x=> x*x*x)
////  def sumFactorials = sum(fact)
////
////  sumInts(3,5)
////  sumCubes(3,5)
//
//  sum(x= >x+x)(3,5) + sum(x=>x*x*x)(3,5)
//
//}
//
object exercise4 {
  def sum(f: Int => Int) (a:Int, b:Int) : Int = {
      if (a > b) 0
      else f(a) + sum(f)(a + 1, b)
  }
  sum(x=>x)(3,5)
}





