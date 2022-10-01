package com.solution.algorithm

/*
코딩테스트 연습 > 연습문제 > 하샤드 수
https://school.programmers.co.kr/learn/courses/30/lessons/12947
*/

fun main() {
    fun solution(x: Int): Boolean {
        var requestNum = x
        var sum = 0

        while (requestNum != 0) {
            sum += requestNum % 10
            requestNum /= 10
        }
        return x % sum == 0
    }

    val result = solution(10)
    print(result)
}