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

/**
 * 1. string split으로 하려했는데 수학적으로 생각해야한다고 생각해서 패스
 * 2. 각 자릿수별로 10,100으로 나눈 몫을 이용하려 했으나 n의 범위가 1억 이하의 자연수이고 어떤 값이 들어올지 모르니 현실성x
 * 3. 결국 검색
 * 4. 조금이나마 자기위로를 하자면 생각했던 10으로 나눈 몫과 관련된 것이 답이긴 했다. 다만 내가 생각했던건 단순히 10으로 나눈 몫일 뿐이여서 결과 값이 항상 일의 자리 수만 나오는 게 문제여서 틀린 줄 알았다.
 */