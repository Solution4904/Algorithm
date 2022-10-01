package com.solution.algorithm

import kotlin.collections.ArrayList

/*
코딩테스트 연습 > 연습문제 > 문자열을 정수로 바꾸기
https://school.programmers.co.kr/learn/courses/30/lessons/12954
*/

fun main() {
    fun solution(x: Int, n: Int): LongArray {
        val array: ArrayList<Long> = ArrayList()
        var sum: Long = x.toLong()
        var count = n
        while (count > 0) {
            val result = sum
            array.add(result)
            sum += x
            count--
        }
        for (num in array) println(num)

        return array.toLongArray()
    }

    val result = solution(-4, 2)
    print(result)
}