package com.solution.algorithm

/*
코딩테스트 연습 > 연습문제 > 문자열을 정수로 바꾸기
https://school.programmers.co.kr/learn/courses/30/lessons/12925
*/

fun main() {
    fun solution(s: String): Int = s.toInt()

    val result = solution("-1234")
    print(result)
}