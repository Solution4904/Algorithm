package com.solution.algorithm

/*
코딩테스트 연습 > 연습문제 > 평균 구하기
https://school.programmers.co.kr/learn/courses/30/lessons/12944
*/

fun main() {
    fun solution(arr: IntArray): Double {
        var sum: Double = 0.0
        for (v in arr) sum += v
        return sum / arr.size
    }

    val result = solution(intArrayOf(1,2,3,4))
    println(result)
}