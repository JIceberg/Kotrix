package org.kotrix.vector

interface NumberVector<T>: VectorBase<T> where T: Number {
    operator fun plus(other: NumberVector<T>): NumberVector<T>

    operator fun minus(other: NumberVector<T>): NumberVector<T>

    operator fun times(other: NumberVector<T>): NumberVector<T>

    operator fun div(other: NumberVector<T>): NumberVector<T>

    operator fun rem(other: NumberVector<T>): NumberVector<T>

    infix fun pow(other: NumberVector<T>): NumberVector<T>

    operator fun plusAssign(other: NumberVector<T>)

    operator fun minusAssign(other: NumberVector<T>)

    operator fun timesAssign(other: NumberVector<T>)

    operator fun divAssign(other: NumberVector<T>)

    operator fun remAssign(other: NumberVector<T>)

    infix fun powAssign(other: NumberVector<T>)

    operator fun unaryPlus(): NumberVector<T>

    operator fun unaryMinus(): NumberVector<T>

    infix fun dot(other: NumberVector<T>): T

    infix fun cross(other: NumberVector<T>): NumberVector<T>

    fun toArray(): Array<T>

    fun toIntVector(): IntVector

    fun toDoubleVector(): DoubleVector
}