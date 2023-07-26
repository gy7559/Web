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

### 3. document.write() 메소드

document.write() 메소드는 웹 페이지가 로딩될 때 실행되면, 웹 페이지에 가장 먼저 데이터를 출력합니다.        
따라서 document.write() 메소드는 대부분 테스트나 디버깅을 위해 사용됩니다.        


### 4. console.log() 메소드
F12를 눌러 콘솔창에 데이터를 띄우는 방식

## 5. 적용

내부 코드로 적용 방법과 외부 파일로 적용하는 방법이 있다.       

script태그를 통하여 HTML문서안에 코드로 삽입가능하다.       
.js파일로 자바스크립트 파일을 사용가능하다.        
파일을 적용하고싶은 웹페이지에 script태그를 사용해 외부 파일을 포함 하면 된다.      

        ex) <script src="/examples/media/example.js"></script>   


# 2. 타입

## 1. 기본타입
기본타입은 원시타입과 객체타입으로 구분 가능하며 

### 1. 원시타입 
1. 숫자(number)
2. 문자열(string)
3. 불리언(boolean)
4. 심볼(symbol) : ECMAScript 6부터 제공됨
5. undefined

#### 1. 숫자 
모든수가 실수 이다.

#### 2. 심볼
유일 하고 변경 불가한 타입으로 객체의 프로퍼티를 위한 식별자로 사용

#### 3. typeof 연산자
피연산자의 타입을 반환하는 피연산자가 단 하나뿐인 연산자입니다.

        ex) typeof 10;        // number 타입
            typeof "문자열";  // string 타입
            typeof true;      // boolean 타입

#### 4. null과 undefined

아직 값이 정해지지 않은것 = null(object타입)
타입이 정해지지 않은것 = undefined



### 2. 객체타입
객체타입은 여러 프로퍼티나 메소드를 같은이름으로 묶어놓은 집합체이다.


## 2. 타입변환
자바스크립트의 변수는 타입이 정해져 있지 않으며, 같은 변수에 다른 타입의 값을 다시 대입할 수 있다.       
단, 변수의 재선언은 불가 하다.        

### 1. 묵시적 타입 변환
특정 타입의 값을 기대하는곳에 다른 타입이 오면 자동으로 타입을 변환해서 사용한다.     


### 2. 명시적 타입 변환 
직접 타입변환을 명시 하는 방법

1. Number()
2. String()
3. Boolean()
4. Object()
5. parseInt()
6. parseFloat()

         ex) Number("10"); // 숫자 10
             String(true); // 문자열 "true"
             Boolean(0);   // 불리언 false

## 3. 변수

### 1. 변수 선언과 초기화

변수는 데이터를 저장하는 메모리공간 값 변경 가능       

```
var month; // month라는 이름의 변수 선언
date = 25; // date라는 이름의 변수를 묵시적으로 선언
```
위와 같이 선언을 할수있으며 
```
var month;     // 변수의 선언
var date = 25; // 변수의 선언과 동시에 초기화
month = 12;    // 변수의 초기화
```
선언을 하며 초기화를 하거나 선언뒤 초기화가 가능하다.      

### 2. 타입과 초깃값
선언만 되고 초기화 되지 않은 변수는 undefined값을 갖는다.
값을 초기화 해줄때 타입을 묵시적이든 명시적이든 선언을 하며 타입을 갖고 초기값을 받는다.      


