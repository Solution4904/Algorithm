package com.solution.algorithm

/*
코딩테스트 연습 > 연습문제 > 정수 내림차순으로 배치하기
https://school.programmers.co.kr/learn/courses/30/lessons/12933
*/

fun main() {
    fun solution(n: Long): Long {
//        var request = String(n.toString().toCharArray().sortedArrayDescending()).toLong()
//        println(request)

        var answer = ""
        var requestNum = n
        val array: ArrayList<Long> = ArrayList()

        while (requestNum > 0) {
            array.add(requestNum % 10)
            requestNum /= 10
        }
        for (num in array.sortedDescending()) answer += num
        return answer.toLong()
    }

    val result = solution(118372)
    print(result)
}