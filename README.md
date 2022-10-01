# Algorithm

#### 프로그래머스 알고리즘 문제 풀이
---

### 코딩테스트 연습 > 연습문제 > 짝수와 홀수

* [문제](https://school.programmers.co.kr/learn/courses/30/lessons/12937)
* [풀이](https://github.com/Solution4904/Algorithm/blob/289e9ea897e3a9dcdf73980751906bb999084bef/app/src/main/java/com/solution/algorithm/%EC%A7%9D%EC%88%98%EC%99%80%20%ED%99%80%EC%88%98.kt)

1. 문제 접근  
   : 특별한 제약은 없어보이니 예전부터 많이 보고 사용했던 '2로 나눈 나머지 값'으로 판단하면 되겠다고 생각했다.

2. 결과 / 틀렸다면 그 이유  
   : 샘플 값에서는 문제 없었지만 테스트 케이스들 중 다수에서 잘못되었다는 결과를 받았다. 나와 같은 사람의 질문이 있어서 보니 음수일 경우를 생각하지 않고'(n%2)>0'으로 조건을 걸었기 때문이였다.

3. 문제에 대한 해결 방법 구상  
   : 양수이던 음수이던 똑같이 양수로 나오면 된다고 판단, 절대값으로 바꾸는 Math 함수를 사용해서 해결했다.

4. 다른 사람의 풀이와 차이점  
   : 제약에 별 달리 눈에 띄는 점이 없었기에 가볍에 0보다 크면 홀수 아니면 짝수로 생각했기 때문이였는데, 애초에 크고 작은 것과 상관 없이 '=0'을 조건으로 걸었으면 쉽게 해결되는 문제였다.

5. 회고  
   : 예전에 풀었던 알고리즘들도 이와 비슷하게 간단하게 해결할 수 있는 것들을 어렵게 생각해서 틀린 것들이 있었다. 물론 그때는 외국 사이트에서 모자란 영어 실력으로 해석하고 번역기를 사용해서 이상하게 이해해서였기도 했지만 무조건 영어였기 때문에 틀렸다고 생각하기에는 비슷한 실수들을 많이 했던 것으로 보아 생각을 좀 더 유연하게 할 수 있도록 해야겠다.

---

### 코딩테스트 연습 > 연습문제 > 평균 구하기

* [문제](https://school.programmers.co.kr/learn/courses/30/lessons/12944)
* [풀이](https://github.com/Solution4904/Algorithm/blob/debbcc18ab85964e7eb320ddbcfcbbe794af5ab1/app/src/main/java/com/solution/algorithm/%ED%8F%89%EA%B7%A0%20%EA%B5%AC%ED%95%98%EA%B8%B0.kt)

1. 문제 접근  
   : 평범하게 모든 값을 더하고 더해진 갯수만큼 나누어 해결하려 했다.

2. 결과 / 틀렸다면 그 이유  
   : 문제 없이 해결했다.

3. 다른 사람의 풀이와 차이점  
   : 크게 차이는 없었다. 생각보다 꽤 많은 사람들이 배열 컬렉션 값의 평균 값을 구해주는 'array.average()'라는 함수를 사용해 너무나도 간단하게 푼 사람들이 있었다.

4. 회고  
   : 다른 사람들의 풀이 방법에서 'average()'라는 함수가 있는지 몰랐는데 알게되었다. 다만, 알고리즘이라는게 문제를 어떻게 접근하고 풀어냈는지가 중요하다고 생각하는데, 만들어진 기능을 사용하는건 알고리즘 풀이에 과연 도움이 되는지 생각하게 되었다.

---

### 코딩테스트 연습 > 연습문제 > 약수의 합

* [문제](https://school.programmers.co.kr/learn/courses/30/lessons/12928)
* [풀이](https://github.com/Solution4904/Algorithm/blob/fe8755e220a0e5da85daefcd250e7d182fe72a6a/app/src/main/java/com/solution/algorithm/%EC%95%BD%EC%88%98%EC%9D%98%20%ED%95%A9.kt)

1. 문제 접근  
   : 나누었을 때 나머지 값이 발생하지 않으면 약수라고 판단하면 된다고 생각했다.

2. 결과 / 틀렸다면 그 이유  
   : 문제 없이 해결했다.

3. 다른 사람의 풀이와 차이점  
   : 손에 꼽히는 몇명을 제외하고는 다 같았다. 예외인 몇명은 'filter'나 'takeIf', 'let'을 사용해서 풀었던데, 사용해본 적이 없어서 생각하지 못했다.

4. 회고  
   : 약수를 알아내라는 문제는 한번도 접해본 적이 없었던 것 같다. 다른 사람이 생각하기에는 정말 간단해서 어려운 측에도 들지 않았으리라 생각하지만 처음 접해보니 어떻게 풀어내야 할지 잘 생각이 나질않았다. 다행히 금방 어떻게 풀어내야 할지 생각해냈다. 별 것 아니여도 한번도 낯선 것에서 오는 당황스러움은 컸다. 익숙해질 수 있게 여러 문제를 풀어봐야겠다.

---

### 코딩테스트 연습 > 연습문제 > 자릿수 더하기

* [문제](https://school.programmers.co.kr/learn/courses/30/lessons/12931)
* [풀이](https://github.com/Solution4904/Algorithm/blob/083b26444c0601e81fe2dffddfd889f7a995d13f/app/src/main/java/com/solution/algorithm/%EC%9E%90%EB%A6%BF%EC%88%98%20%EB%8D%94%ED%95%98%EA%B8%B0.kt)

1. 문제 접근  
   : 문자열로 변환하고 반복문을 사용해서 순서대로 덧셈하는 방식

2. 결과 / 틀렸다면 그 이유  
   : 문제 없이 해결했다. 다만 수학적으로 접근하는 것이 맞다고 생각해서 문자열로 변환하는 방법이 아닌 연산 방식을 생각해보았다. 도무지 생각나질 않아서 10으로 나눈 몫을 계산해봤는데 당연스럽게도 무조건 일의 자리 숫자만 알 수 있었다. 이걸 어떻게든 응용하면 되지 않을까 싶었지만 결국 해결하지 못하고 다른 사람들의 풀이를 찾아 보았다.

3. 다른 사람의 풀이와 차이점  
   : 내가 처음 생각했던 것처럼 문자열로 변환해서 푼 사람들도 있었다. 다만 이 방법이 옳바른 방법인지는 모르겠다.

4. 회고  
   : 정말 알고리즘 공부를 하나도 하지 않았던 것이 느껴졌다. 생각으로는 정말 간단한 문제인데도 불구하고 수학적으로 접근하려니 도저히 풀 수가 없었다. 반성해야겠다... 더 많은 알고리즘들을 접하고 풀어나가야겠다.

---

### 코딩테스트 연습 > 연습문제 > 정수 제곱근 판별

* [문제](https://school.programmers.co.kr/learn/courses/30/lessons/12934)
* [풀이](https://github.com/Solution4904/Algorithm/blob/1de0eaf658380c9108aa5cce9dc51e07cee8563b/app/src/main/java/com/solution/algorithm/%EC%A0%95%EC%88%98%20%EC%A0%9C%EA%B3%B1%EA%B7%BC%20%ED%8C%90%EB%B3%84.kt)

1. 문제 접근  
   : 요청받은 값보다 작은 수를 반복문을 사용해서 제곱했을 때 요청받은 값과 같은지 판단하자.

2. 결과 / 틀렸다면 그 이유  
   : 문제 없이 해결했다.

3. 다른 사람의 풀이와 차이점  
   : 많은 사람들은 'Math.sqrt'라는 처음보는 함수로 풀고 있었다. 

4. 회고  
   : 전부 다 그런 건 아니였지만 'Math'함수를 사용하는 사람들이 대부분이였다. 나 혼자 너무 무식하게 풀어낸 것 같아서 조금 거시기하다...

---

### 코딩테스트 연습 > 연습문제 > 자연수 뒤집어 배열로 만들기

* [문제](https://school.programmers.co.kr/learn/courses/30/lessons/12932)
* [풀이](https://github.com/Solution4904/Algorithm/blob/b09cd855a6df5d825e75a5c9478a9194464a909e/app/src/main/java/com/solution/algorithm/%EC%9E%90%EC%97%B0%EC%88%98%20%EB%92%A4%EC%A7%91%EC%96%B4%20%EB%B0%B0%EC%97%B4%EB%A1%9C%20%EB%A7%8C%EB%93%A4%EA%B8%B0.kt)

1. 문제 접근  
   : 전달받은 값을 문자열로 변환시킨 뒤 반복문을 통해 거꾸로 새 배열에 넣자 -> 였지만 이왕이면 '자릿수 더하기'알고리즘을 사용해서 문자열로 바꾸지 않고 숫자인 상태로 바꿔보자

2. 결과 / 틀렸다면 그 이유  
   : 문제 없이 해결했다.

3. 다른 사람의 풀이와 차이점  
   : 비슷한 사람들도 꽤 많았고, 처음 생각했던 것 처럼 문자열로 변환시켜서 푼 사람들도 꽤 많았다.

4. 회고  
   : 문자열로 바꿔서 처리하면 더 간단할 수도 있었겠지만 문자열로 바꾸지 않고 숫자에서 처리했다는 점이 만족스럽다.

---

### 코딩테스트 연습 > 연습문제 > 하샤드 수

* [문제](https://school.programmers.co.kr/learn/courses/30/lessons/12947)
* [풀이](https://github.com/Solution4904/Algorithm/blob/958d8f15662bde000a0c28ab29ab233bdae3e359/app/src/main/java/com/solution/algorithm/%ED%95%98%EC%83%A4%EB%93%9C%20%EC%88%98.kt)

1. 문제 접근  
   : 이전에 풀어봤던 '자릿수 더하기'를 응용하면 될 것이라고 생각했다.

2. 결과 / 틀렸다면 그 이유  
   : 문제 없이 해결했다.

3. 다른 사람의 풀이와 차이점  
   : 대부분 비슷하게 풀었고 역시나 '.fold'나 ASCII 같은 모르는 방식으로 풀어낸 사람도 있었다.

4. 회고  
   : '하샤드 수'라는 게 뭔지는 몰랐지만 문제를 보며 알았다. 다행히 '자릿수 더하기' 알고리즘을 이용해서 어렵지 않게 풀 수 있었다.

---

### 코딩테스트 연습 > 연습문제 > 정수 내림차순으로 배치하기

* [문제](https://school.programmers.co.kr/learn/courses/30/lessons/12933)
* [풀이](https://github.com/Solution4904/Algorithm/blob/958d8f15662bde000a0c28ab29ab233bdae3e359/app/src/main/java/com/solution/algorithm/%EC%A0%95%EC%88%98%20%EB%82%B4%EB%A6%BC%EC%B0%A8%EC%88%9C%EC%9C%BC%EB%A1%9C%20%EB%B0%B0%EC%B9%98%ED%95%98%EA%B8%B0.kt)

1. 문제 접근  
   : 자릿수별로 값을 잘라서 배열에 넣고 정렬 함수를 사용한 후 다시 Long 타입으로 변환

2. 결과 / 틀렸다면 그 이유  
   : 문제 없이 해결했다.

3. 다른 사람의 풀이와 차이점  
   : 이래저래 풀이가 가지각색이였지만 배열에 넣어 정렬한다는 점은 동일했다.

4. 회고  
   : 분명히 이렇게 한눈에 봐도 번잡하고 비효율적인 방법보다 내 생각대로 변환할 수 있는 함수가 있을꺼라 생각했는데 역시나 있었다. 'String(n.toString().toCharArray().sortedArrayDescending()).toLong()'한눈에 봐도 어떤 결과값을 줄지 알 수 있는 좋은 답안이 있었다. 풀어왔던 문제들도 'toCharArray'를 사용하면 비교적 쉽게 해결할 수 있었을 문제들도 있어보인다.

---

### 코딩테스트 연습 > 연습문제 > 문자열을 정수로 바꾸기

* [문제](https://school.programmers.co.kr/learn/courses/30/lessons/12925)
* [풀이](https://github.com/Solution4904/Algorithm/blob/958d8f15662bde000a0c28ab29ab233bdae3e359/app/src/main/java/com/solution/algorithm/%EB%AC%B8%EC%9E%90%EC%97%B4%EC%9D%84%20%EC%A0%95%EC%88%98%EB%A1%9C%20%EB%B0%94%EA%BE%B8%EA%B8%B0.kt)

1. 문제 접근  
   : 그냥 '.toInt()'하면 되는거 아닌가?

2. 결과 / 틀렸다면 그 이유  
   : 문제 없이 해결했다.

3. 다른 사람의 풀이와 차이점  
   : 당연히 완전 동일하게 푼 사람들이 대부분이였다. 일부러 문자열을 'subString'으로 잘라가며 푼 사람도 있긴한데, 기본적으로 제공해주는 기능을 사용하지 않고 푸는 것이 현명한건지, 사용할 수 있는 간단한 함수가 있다면 사용하는 것이 맞는 건지는 모르겠다.

4. 회고  
   : 뭘 특별히 코딩해서 푼 것이 아니라 별다른 건 없다.

---

### 코딩테스트 연습 > 연습문제 > x만큼 간격이 있는 n개이 숫자

* [문제](https://school.programmers.co.kr/learn/courses/30/lessons/12954)
* [풀이](https://github.com/Solution4904/Algorithm/blob/560750d5f95f0c2c9fcdd38c42ff80fbcc0b1e16/app/src/main/java/com/solution/algorithm/x%EB%A7%8C%ED%81%BC%20%EA%B0%84%EA%B2%A9%EC%9D%B4%20%EC%9E%88%EB%8A%94%20n%EA%B0%9C%EC%9D%98%20%EC%88%AB%EC%9E%90.kt)

1. 문제 접근  
   : 단순 반복문 계산으로 해결할 수 있을 것 같다.

2. 결과 / 틀렸다면 그 이유  
   : 문제 없이 해결했다.

3. 다른 사람의 풀이와 차이점  
   : 람다식이나 애초부터 'LongArray'를 사용한 사람들이 대다수이다.

4. 회고  
   : 반복문에서 연산 후에 나온 값을 배열에 추가시켜줘야한다고 생각해서 추가가 가능한 'ArrayList'를 사용한 후 반환할 때 'LongAraay'로 변환해서 보내야겠다고 생각했다. 그런데 다른 사람들은 'LongArray'를 선언하면서 연산하는 과정을 넣어줘서 추가로 변환하는 과정들이 모두 필요 없었다. 무조건 추가해야한다고 'ArrayList'를 사용하거나 변환과정이 추가로 들어간 건 실수인 것 같다.

---
