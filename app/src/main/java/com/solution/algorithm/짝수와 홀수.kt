package com.solution.algorithm

/*
코딩테스트 연습 > 연습문제 > 짝수와 홀수
https://school.programmers.co.kr/learn/courses/30/lessons/12937
*/

fun main() {
    fun solution(num: Int): String {
        return if ((num % 2) != 0) "Odd" else "Even"
    }

    val result = solution(2)
    print(result)
}