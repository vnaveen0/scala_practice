import IntSet._

val t1 = new NonEmpty(3, Empty, Empty)
val t2 = t1 incl 4
t2 contains 4
t2 contains 3
t2 union t1


