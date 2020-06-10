package value.basic

import org.scalatest.funsuite.AnyFunSuite
import value.ValueContext
import value.ValueImplicits._
import value.basic.IntValue.IntNull

class IntValueTest extends AnyFunSuite {
    implicit private val valueContext: ValueContext = new ValueContext {}

    test("IntValue IntNull should get None") {
        // given
        val v = IntNull

        // then
        assertResult(None)(v.get)
    }

    test("IntValue 3 should get Some(3)") {
        // given
        val v = 3.toValue

        // then
        assertResult(Some(3))(v.get)
    }

    test("IntValue -3 should get Some(-3)") {
        // given
        val v = 3.toValue

        // when
        val result = -v

        // then
        assertResult(Some(-3))(result.get)
    }

    test("IntValue -IntNull should get None") {
        // given
        val v = IntNull

        // when
        val result = -v

        // then
        assertResult(None)(result.get)
    }

    test("IntValue 2 + 3 should get Some(5)") {
        // given
        val v1 = 2.toValue
        val v2 = 3.toValue

        // when
        val result = v1 + v2

        // then
        assertResult(Some(5))(result.get)
    }

    test("IntValue 2 + IntNull should get None") {
        // given
        val v1 = 2.toValue
        val v2 = IntNull

        // when
        val result = v1 + v2

        // then
        assertResult(None)(result.get)
    }

    test("IntValue 2 - 3 should get Some(-1)") {
        // given
        val v1 = 2.toValue
        val v2 = 3.toValue

        // when
        val result = v1 - v2

        // then
        assertResult(Some(-1))(result.get)
    }

    test("IntValue 2 - IntNull should get None") {
        // given
        val v1 = 2.toValue
        val v2 = IntNull

        // when
        val result = v1 - v2

        // then
        assertResult(None)(result.get)
    }

    test("IntValue 2 * 3 should get Some(6)") {
        // given
        val v1 = 2.toValue
        val v2 = 3.toValue

        // when
        val result = v1 * v2

        // then
        assertResult(Some(6))(result.get)
    }

    test("IntValue 2 * IntNull should get None") {
        // given
        val v1 = 2.toValue
        val v2 = IntNull

        // when
        val result = v1 * v2

        // then
        assertResult(None)(result.get)
    }

    test("IntValue 6 / 2 should get Some(3)") {
        // given
        val v1 = 6.toValue
        val v2 = 2.toValue

        // when
        val result = v1 / v2

        // then
        assertResult(Some(3))(result.get)
    }

    test("IntValue 6 / 4 should get Some(1)") {
        // given
        val v1 = 6.toValue
        val v2 = 4.toValue

        // when
        val result = v1 / v2

        // then
        assertResult(Some(1))(result.get)
    }

    test("IntValue 6 / 0 should get None") {
        // given
        val v1 = 6.toValue
        val v2 = 0.toValue

        // when
        val result = v1 / v2

        // then
        assertResult(None)(result.get)
    }

    test("IntValue 6 / IntNull should get None") {
        // given
        val v1 = 6.toValue
        val v2 = IntNull

        // when
        val result = v1 / v2

        // then
        assertResult(None)(result.get)
    }

    test("IntValue 3 % 2 should get Some(1)") {
        // given
        val v1 = 3.toValue
        val v2 = 2.toValue

        // when
        val result = v1 % v2

        // then
        assertResult(Some(1))(result.get)
    }

    test("IntValue 3 % 0 should get None") {
        // given
        val v1 = 3.toValue
        val v2 = 0.toValue

        // when
        val result = v1 % v2

        // then
        assertResult(None)(result.get)
    }

    test("IntValue 3 % IntNull should get None") {
        // given
        val v1 = 3.toValue
        val v2 = IntNull

        // when
        val result = v1 % v2

        // then
        assertResult(None)(result.get)
    }

    test("IntValue (2 * (9 + 5)) % 10 should get Some(8)") {
        // given
        val v = (2.toValue * (9.toValue + 5)) % 10

        // then
        assertResult(Some(8))(v.get)
    }

    test("IntValue 3.14 toInt should get Some(8)") {
        // given
        val v = 3.14.toValue.toIntValue

        // then
        assertResult(Some(3))(v.get)
    }

}
