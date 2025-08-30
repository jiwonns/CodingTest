# 📝 코딩테스트 연습 기록

> 꾸준히 풀고, 기록하고, 성장하는 코테 준비 레포지토리 ✨

---

## 📂 디렉토리 구조

```
📦 coding-test
 ┣ 📂 programmers   # 프로그래머스 문제 풀이
 ┣ 📂 baekjoon      # 백준 문제 풀이
 ┣ 📂 leetcode      # LeetCode 문제 풀이
 ┣ 📂 notes         # 알고리즘/자료구조 개념 정리
 ┣ 📜 README.md     # 코테 리드미
```

---

## 🚀 목표

- 하루 최소 1문제 이상 풀이
- 단순 정답보다 **가독성** + **효율성** 고려
- 오답/실패한 문제는 꼭 기록하고 다시 도전하기

---

## 🛠 사용 언어 & 환경

- **JavaScript (ES6+)**
- **Java 21 / Kotlin**
- **Python 3.10+**

> IDE: IntelliJ / VSCode  
> 버전관리: Git + GitHub

---

## ✨ 문제 풀이 방식

1. 문제 이해
2. 접근 방식 & 알고리즘 선택
3. 코드 작성
4. 시간복잡도/공간복잡도 분석
5. 개선 포인트 기록

---

## 📒 문제 풀이 예시

### 📌 [Programmers] 문자열 압축

- **난이도**: Level 2  
- **풀이 언어**: JavaScript  
- **접근 방식**  
  - 문자열을 `n` 길이 단위로 자르며 압축
  - 이전 문자열과 같으면 count 증가, 다르면 결과에 추가  

```js
function solution(s) {
  let answer = s.length;
  for (let i = 1; i <= s.length / 2; i++) {
    let compressed = "";
    let prev = s.slice(0, i);
    let count = 1;
    for (let j = i; j < s.length; j += i) {
      const cur = s.slice(j, j + i);
      if (prev === cur) count++;
      else {
        compressed += (count > 1 ? count : "") + prev;
        prev = cur;
        count = 1;
      }
    }
    compressed += (count > 1 ? count : "") + prev;
    answer = Math.min(answer, compressed.length);
  }
  return answer;
}
```

- **시간복잡도**: O(N²)  
- **공간복잡도**: O(N)

---

## 🏆 진행 현황


---

## 📌 메모

- **그날의 문제 풀이 실패 → 꼭 다시 풀기**
- **풀이 후에는 블로그 정리까지 해야 완성**
- **코드보다 접근법과 사고 과정을 중점적으로 기록**
