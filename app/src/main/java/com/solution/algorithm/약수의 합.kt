package com.solution.algorithm

/*
코딩테스트 연습 > 연습문제 > 약수의 합
https://school.programmers.co.kr/learn/courses/30/lessons/12928
*/

fun main() {
    fun solution(n: Int): Int {
        var sum = 0
        for (i in 1..n) {
            if (n % i == 0)
                sum += i
        }
        return sum
    }

    val result = solution(12)
    print(result)
}