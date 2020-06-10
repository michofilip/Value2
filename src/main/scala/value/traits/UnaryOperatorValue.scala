package value.traits

import value.ValueTypes.Unary
import value.{Value, ValueContext}

trait UnaryOperatorValue[V, R] extends Value[R] {
    protected val operator: Unary[V, R]
    val value: Value[V]

    final override def get(implicit gameContext: ValueContext): Option[R] =
        value.get.flatMap(x => operator(x))
}