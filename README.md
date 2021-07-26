# java-number-baseball

## 목적
TDD, Java로 숫자 야구 게임을 구현 연습. 극단적인 코드 제한을 통해 TDD, 리팩토링을 수련한다.  
[최범균님의 영상](https://www.youtube.com/watch?v=Co2yAUJlm0c) 을 보고 자바로 다시 짜봐야겠다고 생각했습니다.

## 개발 사이클
지키지 않았다면 `git reset --hard HEAD`  
0. 요구사항 작성
1. 실패하는 테스트 코드 작성
2. 통과하는 코드 구현
3. 리팩토링

## 리팩토링
* 냄새 맡기
  - 많거나, 길거나, 어렵거나.
* 원시 타입을 사용하지 않기 위해 노력하라.
* 메소드 depth가 2를 넘으면 줄일 수 있는지 고민하라.
* 메소드 바디가 5줄을 넘으면 메소드 분리를 고민하라.
* 클래스가 길거나, 필드가 많거나, private 메소드가 많으면 분리를 고민하라.
* 테스트 하기 어렵다면 다른 구현 방법을 고민하라.
* 중복이 발생한다면 메소드 분리를 고민하라.

## 게임 규칙
* 숫자 세개를 맞추는 게임. 
* 숫자만 맞추면 ball, 같은자리의 숫자를 맞추면 strike 둘 다 아니라면 nothing

## 개발 전 요구사항 check.
1. Game
  - 세자리 숫자를 받아 게임 생성
    - 입력 길이
      - 3자리 -> 경계값 2, 4
    - 숫자
      - 범위는 1 ~ 9 -> 경계값 0
      - 숫자가 아닌 경우 NumberFormatException이 parseInt에서 발생
  - 값을 받아 생성한 게임과 비교
    - 위와 마찬가지로 입력 길이와 숫자 조건이 같음.
    - 비교
      - 아무것도 못맞추면 nothing
      - 숫자만 맞추면 ball
      - 숫자와 자리를 모두 맞추면 strike
2. Score
  - Game 비교 결과를 담는다.
  - 스트라이크는 0부터 3까지 숫자
  - 볼은 0부터 3까지 숫자
  - 볼과 스트라이크의 합은 최대 3

## 아마도 얻을 수 있는 것들
- 요구사항을 제대로 이해했는가 확인.
- 냄새를 맡는 연습.
