import value.ValueContext
import value.ValueImplicits._

object Main extends App {
    implicit val gc: ValueContext = new ValueContext {}

    val v1 = 5.2.toValue
    val v2 = 2.toValue
    val v3 = false.toValue
    val v4 = (-v1 < v2.toDoubleValue) && !v3
    val v5 = 3.14.toValue.toIntValue
    val v6 = ("Ala".toValue + " ma " + "kota").length

    println(v4)
    println(v4.get)
    println(v5)
    println(v5.get)
    println(v6)
    println(v6.get)

}


