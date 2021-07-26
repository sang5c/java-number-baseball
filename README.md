# java-number-baseball

TDD, Java로 숫자 야구 게임을 구현 연습.

## 개발 사이클
지키지 않았다면 `git reset --hard HEAD`
1. 실패하는 테스트 코드 작성
2. 통과하는 코드 구현
3. 리팩토링

## 게임 규칙
* 숫자 세개를 맞추는 게임. 
* 숫자만 맞추면 ball, 같은자리의 숫자를 맞추면 strike 둘 다 아니라면 nothing

## 개발 전 요구사항 check.
1. Game
- 세자리 숫자를 받아 게임 생성
  - 입력 길이
    - 3자리
  - 숫자
    - 범위는 1 ~ 9
    - 경계값, is digit 확인 필요.
  - 1번을 완료하고 다시 정리할 것.