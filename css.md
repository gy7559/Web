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


# 5. font
font속성으로는 

1. font-family : 글씨체 지정(글꼴을 여러게 지정하여 처음 글꼴이 표시되지 않으면 두번째 세번째 순으로 글씨체가 표시됨)
2. font-style : 텍스트에 이탤리체를 적용하거나 하지않거나 텍스트를 기울이는것을 설정할수 있다.
3. font-variant : 텍스트내에 소문자를 작은 대문자로 바꾼다 대문자는 변함없다.
4. font-weight : 텍스트의 두깨 설정
5. font-size : 텍스트의 크기 설정 (상대적 크기와 절대적 크기로 나뉨)

크기의 단위로는 %, em,px 가 있다.



# 6. 링크

a태그 안에 같이 사용해야되며 target을 사용하여 링크에 들어가는 방법의 설정 가능      
상태를 지정하여 각각의 스타일을 적용 가능      


# 7. 리스트와 테이블
리스트의 속성은 type, image, position 3개로        
ilst-style-type 과 같이 작성하여 적용한다.
 
type의 경우 리스트 요소 앞의 마크를 변경가능하다.      
image의 경우 지정 이미지로 마크를 변경가능하다.      
position의 경우 요소의 위치 지정으로  insdie outside가 있다.      

그냥 ilst-style로 속성을 한번에 적용 가능하다.   



테이블의 속성으로는 태두리를 지정하는 border와 border-collapse        
요소간의 여백을 지정하는 border-spacing          
요소안의 정렬 기준을 정해주는 text-align       
수직으로 정렬하는(위에서부터, 아래서부터) vertical-align         


# 8. 이미지 스프라이트

여러 이미지를 하나의 이미지에 넣어서 관리하는것으로 이미지 처리가 빨라진다. 

![img_css_image_sprites](https://github.com/gy7559/Web/assets/62734041/b56944ed-90b8-444c-b1cc-40a2232b168f)
위 와같이 하나의 이미지에 4개의 아이콘을 넣어 이미지를 불러올때 위치를 지정 하나의 아이콘을 쓰는 방식



# 9. 크기지정
1. height  요소의 높이 지정
2. width  요소의 넓이지정 
3. max-width   요소의 최대넓이 지정으로 화면크기가 작아지면 맞춰서 작아진다.
4. min-width    요소의 최소넓이 지정으로 화면크기가 커지면 맞춰서 커진다.
5. max-height  요소의 최대높이 지정으로 화면크기가 작아지면 맞춰서 작아진다.
6. min-height  요소의 최소높이 지정으로 화면크기가 커지면 맞춰서 커진다.




# 10. 박스모델
![img_css_boxmodel](https://github.com/gy7559/Web/assets/62734041/42135a89-c845-4ab7-a05b-3cf4dba5cee5)
 

1. 내용(content) : 텍스트나 이미지가 들어있는 박스의 실질적인 내용 부분
2. 패딩(padding) : 내용과 테두리 사이의 간격
3. 테두리(border) : 내용와 패딩 주변을 감싸는 테두리
4. 마진(margin) : 테두리와 이웃하는 요소 사이의 간격

### 1. 패딩
패딩의 속성으로는 padding-top(이후로는 padding생략), right,bottom,left가 있다.      

축약표현      

      ex) padding: 20px 50px 30px 50px;  = 
            padding-top: 20px;
            padding-right: 50px;
            padding-bottom: 30px;
            padding-left: 50px;
            와 같고 3개로 축약할 경우 top, left와 right, bottom이다.


### 2. boder속성

속성으로는 실선설정 solid와 이중실선설정 double등 여러가지가 있으며       
border-width 속성으로 두께를 설정 가능하다.       

또한 border-color속성으로 색 설정도 가능하다.     
border-top, right,bottom,left를 이용하여 각 태두리별 속성을 개별 성정이 가능하다.      

### 3. 마진
패딩과 같지만 background-color 속성에 영향을 받지 않으며 각요소의 border간의 거리 설정이다.       

# 11. 아웃라인
outline 속성은 HTML 요소의 가장 바깥 부분을 둘러싸고 있는 아웃라인 부분의 스타일을 설정    
border와 같은속성들을 가진다. 하지만 요소의 전체크기에 포함되지 않아 높이 넓이 두께는 영향을 받지 않는다.     

축약표현또한 가능  

      ex) outline: 3px solid teal;
            outline: 5px teal;

px은 두께지정, soild는 실선 설정, teal은 색설정이다.



# 12. 디스플레이 속성
블록 요소와 인라인 요소를 지정하는 말이다.(보여주기 위한 요소들)


### 1. 인라인-블록
인라인 요소처럼 동작하지만 요소안에서 블록요소처럼 동작하는것.       

### 2. opacity 속성
요소의 투명도를 조절할 수 있다.      


# 13. position 속성
position 속성은 HTML 요소가 위치를 결정하는 방식을 설정
CSS에서 요소의 위치를 결정하는 방식에는 다음과 같이 4가지 방식이 있습니다.

 
1. 정적 위치(static position) 지정 방식
2. 상대 위치(relative position) 지정 방식
3. 고정 위치(fixed position) 지정 방식
4. 절대 위치(absolute position) 지정 방식

# 14. float 속성
요소와 요소가 자연스럽게 어울리도록 만들어주는 역할 요즘은 레이아웃 작성에 많이 쓰임      
### 1. clear속성
float속성을 사용한뒤 그뒤에 요소들이 영향을 받지않도록          
clear속성를 사용 float의 영향을 받지 않도록 해준다.         


### 2.overflow 속성
float 속성이 적용된 HTML 요소가 자신을 감싸고 있는 컨테이너 요소보다 크면, 해당 요소의 일부가 밖으로 흘러넘치게 된다.              
이때 overflow 속성값을 auto로 설정하면, 컨테이너 요소의 크기가 자동으로 내부의 요소를 감쌀 수 있을 만큼 커지게 된다.


