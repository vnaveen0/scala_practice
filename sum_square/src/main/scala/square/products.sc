//object exercise {
//  def product (f: Int =>Int)(a:Int , b:Int): Int = {
//    if (a>b) 1
//    else f(a) * product(f)(a+1,b)
//  }
//  product(x=>x)(3,5)
//  product(x=>x*x)(3,5)
//}


object exercise {
  def mapReduce (f1: Int =>Int,
                 combine: (Int,Int) =>Int, zero: Int)
                 (a:Int , b:Int): Int = {
    if (a>b) zero
    else combine(f1(a), mapReduce(f1,combine, zero)(a+1,b))
  }



  mapReduce(x=>x,(a,b) => a+b,0)(3,5)
  mapReduce(x=>x,(a,b) => a*b,1)(3,5)

}