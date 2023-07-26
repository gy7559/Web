# 1. 자바 스크립트
웹의 동작을 구현 할수있다.     

## 1. 기초 

객체 기반의 스크립트 언어이다.     
주로 웹브라우저에 사용되나 Node.js와 같은 프레임 워크를 사용하면 서버 측 프로그래밍     
에도 사용 가능하다.     

**특징**

1. 객체 기반의 스크립트 언어
2. 동적이며 타입을 명시할 필요 없는 인터프리터 언어
3. 객체 지향형 프로그래밍과 함수형 프로그래밍 모두 표현 가능


## 2. 소개

1. HTML 내용을 변경할수 있다.
2. HTML의 속성을 변경할수 있다.
3. HTML의 스타일을 변경할수 있다.


## 3. 문법

실행문은 세미콜론(;)으로 구분된다.   

### 1. 리터럴
직접 표현되는 값

### 2. 식별자

변수나 함수의 이름을 작성할 때 사용하는 이름

1. Camel Case 방식
2. Underscore Case 방식

으로 나뉜다.       
작성 방식이 다른것으로  Camel Case 는 var firstVar =10;과같은 소문자시작 다른단어가 시작할때 대문자를 넣는방식으로       
Underscore는 대문자시작 단어의 이어질때 _를 넣는다.

주석은 CSS와 같은 방식      

## 4. 출력
웹페이지에 스크립트를 통한 결과물 출력 방법

1. window.alert() 메소드
2. HTML DOM 요소를 이용한 innerHTML 프로퍼티
3. document.write() 메소드
4. console.log() 메소드


### 1. window.alert()
window.alert() 메소드는 브라우저와는 별도의 대화 상자를 띄워 사용자에게 데이터를 출력해줌


### 2. innerHTML 프로퍼티
document 객체의 getElementByID()나 getElementsByTagName() 등의 메소드를 사용하여 HTML 요소를 선택           

그리고서 innerHTML 프로퍼티를 이용하면 선택된 HTML 요소의 내용(content)이나 속성(attribute)값 등을 손쉽게 변경할 수 있다.

```javaScript
<script>

    var str = document.getElementById("text");

    str.innerHTML = "이 문장으로 바뀌었습니다!";

</script>
```
