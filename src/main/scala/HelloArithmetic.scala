import Chainsaw.arithmetic.bitheap._
import scala.math._
object HelloArithmetic extends App {
  // define BitHeap
  val bitHeap = BitHeap.fromHeights(Seq(10, 16, 15, 12, 13, 17, 19), 0, 0)
  println(bitHeap)
}
