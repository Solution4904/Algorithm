package com.solution.algorithm

/*
코딩테스트 연습 > 연습문제 > 자릿수 더하기
https://school.programmers.co.kr/learn/courses/30/lessons/12931
*/

fun main() {
    fun solution(n: Int): Int {
        var request = n
        var sum = 0

        while (request != 0) {
            sum += request % 10
            request /= 10
        }
        return sum
    }

    val result = solution(987)
    print(result)
}