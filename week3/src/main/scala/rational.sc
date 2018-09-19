

import scala.Predef.Set
//object  rationals {
//
//  class Rational (x: Int, y: Int) {
//
//    require( y !=0, " denominator cannot be zero")
//    // Constructor
//    def this(x: Int) = this(x,1)
//
//    private  def gcd ( a: Int, b: Int) : Int = if (b==0) a else gcd (b, a % b)
//    private val g = gcd(x, y)
//
//    def numer = x/g
//    def denom = y/g
//
//
//
//    def + (that: Rational) =
//      new Rational (
//        numer*that.denom + denom * that.numer ,
//        that.denom * denom)
//
//    def - (that: Rational) : Rational = this + -that
//    def unary_- : Rational = new Rational(-numer,denom)
//    def less(that: Rational) = numer*that.denom < denom*that.numer
//    def max(that: Rational) = if (this.less(that)) that else this
//    override def toString() = numer + "/" + denom
//  }
//
//
//
//  val x = new Rational(1,3)
//  val y = new Rational(5,7)
//  val z = new Rational(3,2)
//
//  x.numer
//  x.denom
//  x + y
//  -x
//  x  - y
//  y + y
//  x max y
//  val inte = new Rational(5)
////  val strange = new Rational(1,0)
//}

import scala.collection.mutable.ListBuffer
object Main {

  type Set = Int => Boolean
  val bound = 1000

  def map(s: Int => Boolean, f: Int => Int): (Int => Boolean) = {

    var uni_set = new ListBuffer[Int]()

    for ( x: Int <- -10 to 10) {
      if (s(x)) {
        uni_set += f(x)
        println (f(x))
      }
    }

//    def check_exist(a:Int): Boolean = uni_set.contains(a)
    def check_exist (a:Int) : Boolean = uni_set.contains(a)
    check_exist
  }


  map( (x=> x > 1) , (x => x*x))(9)
}