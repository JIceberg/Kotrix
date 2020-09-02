package org.kotrix.vector

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import io.kotest.matchers.types.shouldBeTypeOf

class IntVectorTest: StringSpec({
    /** Constructors **/
    "IntVector(length) {}: IntVector(5) { it } should be [0, 1, 2, 3, 4] and be of type IntVector" {
        val intVector = IntVector(5) { it }

        intVector.shouldContainExactly(0, 1, 2, 3, 4)
        intVector.shouldBeTypeOf<IntVector>()
    }

    "IntVector(length, initValue): IntVector(5, 2) should be [2, 2, 2, 2, 2] and be of type IntVector" {
        val intVector = IntVector(5, 2)

        intVector.shouldContainExactly(2, 2, 2, 2, 2)
        intVector.shouldBeTypeOf<IntVector>()
    }

    "IntVector(vector): IntVector(Vector.of(1, 2, 3, 4, 5)) should be [1, 2, 3, 4, 5] and of type IntVector" {
        val intVector = IntVector(Vector.of(1, 2, 3, 4, 5))

        intVector.shouldContainExactly(1, 2, 3, 4, 5)
        intVector.shouldBeTypeOf<IntVector>()
    }

    "IntVector(list): IntVector(listOf(1, 2, 3, 4, 5)) should be [1, 2, 3, 4, 5] and be of type IntVector" {
        val intVector = IntVector(listOf(1, 2, 3, 4, 5))

        intVector.shouldContainExactly(1, 2, 3, 4, 5)
        intVector.shouldBeTypeOf<IntVector>()
    }

    /** Companion Object
     * of, EMPTY
     */
    "IntVector.of(vararg): IntVector.of(1, 2, 3, 4, 5) should be [1, 2, 3, 4, 5] and of type IntVector and have size of 5" {
        val intVector = IntVector.of(1, 2, 3, 4, 5)

        intVector.shouldBeTypeOf<IntVector>()
        intVector.shouldContainExactly(1, 2, 3, 4, 5)
        intVector.size shouldBe 5
    }

    "IntVector.EMPTY: IntVector.EMPTY should be of type IntVector with size 0" {
        val intVector = IntVector.EMPTY

        intVector.shouldBeTypeOf<IntVector>()
        intVector.size shouldBe 0
    }

    /** Fields
     * type, list, array
     */
    "IntVector.type should be Int::class" {
        IntVector().type shouldBe Int::class
    }

    "IntVector.list: IntVector.of(1, 2, 3, 4, 5).list should be [1, 2, 3, 4, 5] and of instance List<Int>" {
        val list = IntVector.of(1, 2, 3, 4, 5).list

        list.shouldBeInstanceOf<List<Int>>()
        list shouldBe listOf(1, 2, 3, 4, 5)
    }

    "IntVector.array: IntVector.of(1, 2, 3, 4, 5).array should be [1, 2, 3, 4, 5] and of type IntArray" {
        val intArray = IntVector.of(1, 2, 3, 4, 5).array

        intArray.shouldBeTypeOf<IntArray>()
        intArray shouldBe intArrayOf(1, 2, 3, 4, 5)
    }

    /** Element Wise Arithmetic
     * plus, minus, times, div, rem, pow
     * plusAssign, minusAssign, timesAssign, divAssign, remAssign, powAssign
     * unaryPlus, unaryMinus
     */

    /** Vector Arithmetic
     * dot, cross
     */

    /** Element Wise Arithmetic between IntVector op DoubleVector
     * plus, minus, times, div, rem
     */

    /** Element Wise Arithmetic between IntVector op (Int | Double)
     * plus, minus, times, div, rem
     */

    /** Conversion
     * toMatrix, toArray, toIntVector, toDoubleVector
     */
})