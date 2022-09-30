package com.solution.algorithm

/*
코딩테스트 연습 > 연습문제 > 자연수 뒤집어 배열로 만들기
https://school.programmers.co.kr/learn/courses/30/lessons/12932
*/

fun main() {
    fun solution(n: Long): IntArray {
        var request = n
        val array: ArrayList<Int> = ArrayList()

        while (request > 0) {
            val result = (request % 10)
            array.add(result.toInt())
            request /= 10
        }

        return array.toIntArray()
    }

    val result = solution(12345)
    print(result)
}