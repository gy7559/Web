# 1. 문법
![img_css_syntax](https://github.com/gy7559/Web/assets/62734041/65419530-2635-47fb-9ec0-1fb3badce051)

css의 문법이다.
선택자와 속성명 속성값을 입력해준다.

선택자에 적용되는 속성명과 값을 명:값; 과같이 넣어주어 
명 뒤에 :(콜론) 을붙이고 값 뒤에 ;(세미콜론)을 붙어 끝마쳐야 한다.     


# 2. 선택자 
HTMLex에서 설명 하였듯이 요소,id,class가 있는대 그룹 선택자 도 있다.

요소의 경우 요소의 이름을 바로 선택자로 넣어주면 된다.


id의 경우 선택자 앞에 #을 붙여준다


클래스의 경우 .선택자 와 같이 작성한다.



그룹의 경우 위 선택자들의 공통부분을 지정하기 위해 여러 선택자를 한번에 쓸경우이다.

      ex) h1,h2,p{}

예시와 같이 ,쉼표를 통하여 작성한다.


**주석 또한 작성 가능하다.**
작성 방법은 /*(별표) (별표)*/로 작성 가능하다.(자바의 주석처리와 같다.)



# 3. 배경설정
css에서 background 속성은 다음과 같다.        
1. background-color :  배경색
2. background-image : 배경에 넣어두는 이미지
3. background-repeat : 배경 이미지를 수평 혹은 수직 방향으로 반복하여 나타내도록 설정
4. background-position : 배경 이미지의 상대적 위치 설정
5. background-attachment : 배경 이미지의 위치 고정


## background-position
1. left top
2. left center
3. left bottom
4. right top
5. right center
6. right bottom
7. center top
8. center center
9. center bottom


%나 px을 사용하여 상대 위치를 직접 명시할 수도 있다.




# 4. 텍스트
텍스트의 속성으로는 

1. color :  글자색 설정
2. direction : 텍스트가 써지는 방향 설정
3. letter-spacing : 텍스트내에서 글자 사이의 간격 설정
4. word-spacing : 텍스트내에서 단어 사이의 간격 설정
5. text-indent : 단락의 첫 줄에 들여쓰기 할지 안 할지 설정 합니다.
6. text-align : 텍스트의 수평 방향 정렬을 설정 합니다.
7. text-decoration : 여러 효과를 설정하거나 제거하는대 사용 ex) overline 택스트 윗줄 생성 
8. text-transform : 영문자에 대한 대소문자 설정 
9. line-height : 텍스트의 줄 간격을 설정 합니다.
10. text-shadow : 텍스트에 그림자 효과 설정

