# 1. css

Cascading Style Sheets의 약자이다.      
HTML이 어떻게 보이는지를 결정하는대 사용된다.     


3가지의 스타일이 있다.

## 1. 인라인 스타일

태그(요소)안에 style을 넣어 지정하여 준다.


## 2. 내부 스타일 시트
head태그 안에 style태그를 사용하여 스타일을 지정하여 준다.


## 3. 외부 스타일 시트
css파일을 외부에 추가적으로 작성하여 link를 동해 style 시트를 가져오는 방식이다.


적용 우선순위로는 

1. 인라인
2. 내외부 스타일시트
3. 웹브라우저 기본 스타일

순서다.    


# 2. css선택자

선택자로는

1. HTML 요소 선택자
2. id선택자
3. class 선택자

로 나뉜다.    

요소의 이름을 직접 선택하여 적용하는것과       
각요소에 id를 넣어주어 id별로 선택하여 적용해주는 방식      
각요소의 집합에 class를 지정해주어 선택하는 방식이다.


id와 class는 비슷해보이지만 id의 경우 중복사용할 경우 자바스크립트 작업도중 에러가 발생할수있어서 중복을 피해야 한다.     


# 3. 자바스크립트
객체 기반의 스크립트 언어로서 웹의 동작을 구현할수 있다.     

**script요소**
script 요소는 해당 웹 페이지에 사용할 스크립트(script)를 정의하기 위해 사용한다.

반대로 noscript 요소는 스크립트를 지원하지 않는 브라우저를 사용하는 사용자에게 보여줄 문자열을 설정할때 사용한다.      
모든 브라우저가 스크립트를 지원한다는 가정을 할수 없기때문이다.     


# 4. XHTML
XHTML은  EXtensible HTML을 의미한다.       

XHTML을 사용하는 이유로는 플렛폼이 pc만 있는것이 아닌 요즘환경에서     
필요한 자원이 부족한 경우가 늘어나 문법적으로 정확한 XML문서를 사용하는 경우가 늘어서 그렇다.    

차이점으로는 

1. 종료태그가 없는 빈태그는 끝에 공백과 함께 /를 붙어여한다.
2. 비어있지 않은 요소는 반듯이 종료태그를 가져야한다.
3. 요소들이 열린순서대로 닫혀야한다.
4. img태그에는 alt속성이 기술되있어야 한다.
5. 모든 택스트는 태그로 감싸야 한다.
6. 속성값음 따옴표""로 감싸야한다.
7. 태그 이름 혹은 속성 이름에는 반듯이 소문자만 써야한다.
8. 속성값 생략이 없어져 반듯이 명시해야 한다.


# 5. HTML5의 변경점
추가되고 삭제된 요소들이 몇 있다.

추가 : header,nav,main,aside등

삭제된 요소들은 css로 적용하도록 바뀌거나 다른태그로 대채되거나 아에 삭제하였다. 
center,big,basefont등은 css로 대체되었으며 frame, frameset등은 삭제 되었다.


   