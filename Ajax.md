# XMLHttpRequest 객체

Ajax의 핵심 구성요소로 웹 브라우저가 서버와 데이터를 교환할 때 사용한다.          



## 1. 객체 생성 
현재 대부분의 주요 웹 브라우저는 XMLHttpRequest 객체를 내장하고 있습니다.          




두가지 방법이 있다.        

1. XMLHttpRequest 객체를 이용한 방법
2. ActiveXObject 객체를 이용한 방법

예시)
```
var 변수이름 = new XMLHttpRequest();
```

익스플로러의 구형 버전인 5와 6 버전에서는 ActiveXObject 객체를 사용해야한다. 

```
var 변수이름 = new ActiveXObject("Microsoft.XMLHTTP");
```
그래서 모든 웹 브라우저에서 할려면 아래와 같이 해야한다.  

```
var httpRequest;
function createRequest() {
    if (window.XMLHttpRequest) { // 익스플로러 7과 그 이상의 버전, 크롬, 파이어폭스, 사파리, 오페라 등
        return new XMLHttpRequest();
    } else {                     // 익스플로러 6과 그 이하의 버전
        return new ActiveXObject("Microsoft.XMLHTTP");
    }
}
```


## 2. 서버에 요청하기
서버와 데이터를 교환하기 위해서 XMLHttpRequest 객체를 사용하여야하기때문에       
우선  XMLHttpRequest인스턴스를 생성해야한다.           

요청을 보내는 메소드로는 open과 send가 있다.           

### 1. open() 메소드
open() 메소드는 서버로 보낼 Ajax 요청의 형식을 설정한다.     
```
open(전달방식, URL주소, 동기여부);
```
전달 방식은 요청을 전달할 방식으로 GET 방식과 POST 중 하나 선택          
URL 주소는 요청을 처리할 서버의 파일 주소를 전달              
동기 여부는 요청을 동기식으로 전달할지 비동기식으로 전달할지를 전달합니다.


### 2. send() 메소드
send() 메소드는 작성된 Ajax 요청을 서버로 전달합니다.                 
이 메소드는 전달 방식에 따라 인수를 가질 수도 안 가질 수도 있습니다.             

```
send();       // GET 방식
send(문자열); // POST 방식
```
### 3. 서버 응답 확인
Ajax에서 서버로부터의 응답을 확인하기 위해 사용하는 XMLHttpRequest 객체의 프로퍼티는 다음과 같다.               

#### 1. readyState 프로퍼티
readyState 프로퍼티는 XMLHttpRequest 객체의 현재 상태를 나타낸다.           

 1. UNSENT (숫자 0) : XMLHttpRequest 객체가 생성됨.
 2. OPENED (숫자 1) : open() 메소드가 성공적으로 실행됨.
 3. HEADERS_RECEIVED (숫자 2) : 모든 요청에 대한 응답이 도착함.
 4. LOADING (숫자 3) : 요청한 데이터를 처리 중임.
 5. DONE (숫자 4) : 요청한 데이터의 처리가 완료되어 응답할 준비가 완료됨.


#### 2. status 프로퍼티

status 프로퍼티는 서버의 문서 상태를 나타냅니다.

 - 200 : 서버에 문서가 존재함.
 - 404 : 서버에 문서가 존재하지 않음.

### 3. onreadystatechange 프로퍼티
onreadystatechange 프로퍼티는 XMLHttpRequest 객체의 readyState 프로퍼티 값이 변할 때마다 자동으로 호출되는 함수를 설정합니다.   






