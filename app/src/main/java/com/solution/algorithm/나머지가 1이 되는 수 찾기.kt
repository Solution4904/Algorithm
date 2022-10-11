package com.solution.algorithm

/*
코딩테스트 연습 > 연습문제 > 나머지가 1이 되는 수 찾기
https://school.programmers.co.kr/learn/courses/30/lessons/87389
*/

fun main() {
    fun solution(n: Int): Int {
        var answer = 2
        while (n % answer != 1) {
            answer++
        }
        return answer

//        return if (n % 2 == 1) 2
//        else if (n % 3 == 1) 3
//        else n - 1
    }

    val result = solution(12)
    print(result)
}