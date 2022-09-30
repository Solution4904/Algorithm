package com.solution.algorithm

/*
코딩테스트 연습 > 연습문제 > 정수 제곱근 판별
https://school.programmers.co.kr/learn/courses/30/lessons/12934
*/

fun main() {
    fun solution(n: Long): Long {
        for (i in 0..n)
            if (i * i == n) return (i + 1) * (i + 1)
        return -1
    }

    val result = solution(3)
    print(result)
}