import java.util.NoSuchElementException

/**
  * Created by vnaveen0 on 14/02/17.
  */
trait List [T] {
  def isEmpty: Boolean
  def head: T
  def tail : List[T]
}

class Cons[T] (val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new Error("Nil.head") //throw NoSuchElementException("Nil.head")
  def tail: Nothing = throw new Error //NoSuchElementException("Nil.tail")

}
