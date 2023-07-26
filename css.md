# 1. 문법
![img_css_syntax](https://github.com/gy7559/Web/assets/62734041/65419530-2635-47fb-9ec0-1fb3badce051)

css의 문법이다.
선택자와 속성명 속성값을 입력해준다.

선택자에 적용되는 속성명과 값을 명:값; 과같이 넣어주어 
명 뒤에 :(콜론) 을붙이고 값 뒤에 ;(세미콜론)을 붙어 끝마쳐야 한다.     


## 1. 주석
작성 방법은 /*(별표) (별표)*/로 작성 가능하다.(자바의 주석처리와 같다.)

# 2. 기본설정

## 1. 배경설정
css에서 background 속성은 다음과 같다.        
1. background-color :  배경색
2. background-image : 배경에 넣어두는 이미지
3. background-repeat : 배경 이미지를 수평 혹은 수직 방향으로 반복하여 나타내도록 설정
4. background-position : 배경 이미지의 상대적 위치 설정
5. background-attachment : 배경 이미지의 위치 고정


### background-position
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




## 2. 텍스트
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


## 3. font
font속성으로는 

1. font-family : 글씨체 지정(글꼴을 여러게 지정하여 처음 글꼴이 표시되지 않으면 두번째 세번째 순으로 글씨체가 표시됨)
2. font-style : 텍스트에 이탤리체를 적용하거나 하지않거나 텍스트를 기울이는것을 설정할수 있다.
3. font-variant : 텍스트내에 소문자를 작은 대문자로 바꾼다 대문자는 변함없다.
4. font-weight : 텍스트의 두깨 설정
5. font-size : 텍스트의 크기 설정 (상대적 크기와 절대적 크기로 나뉨)

크기의 단위로는 %, em,px 가 있다.



## 4. 링크

a태그 안에 같이 사용해야되며 target을 사용하여 링크에 들어가는 방법의 설정 가능      
상태를 지정하여 각각의 스타일을 적용 가능      


## 5. 리스트와 테이블
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


## 6. 이미지 스프라이트

여러 이미지를 하나의 이미지에 넣어서 관리하는것으로 이미지 처리가 빨라진다. 

![img_css_image_sprites](https://github.com/gy7559/Web/assets/62734041/b56944ed-90b8-444c-b1cc-40a2232b168f)
위 와같이 하나의 이미지에 4개의 아이콘을 넣어 이미지를 불러올때 위치를 지정 하나의 아이콘을 쓰는 방식


# 3. 박스모델
## 1. 크기지정
1. height  요소의 높이 지정
2. width  요소의 넓이지정 
3. max-width   요소의 최대넓이 지정으로 화면크기가 작아지면 맞춰서 작아진다.
4. min-width    요소의 최소넓이 지정으로 화면크기가 커지면 맞춰서 커진다.
5. max-height  요소의 최대높이 지정으로 화면크기가 작아지면 맞춰서 작아진다.
6. min-height  요소의 최소높이 지정으로 화면크기가 커지면 맞춰서 커진다.




## 2. 박스모델
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

## 3. 아웃라인
outline 속성은 HTML 요소의 가장 바깥 부분을 둘러싸고 있는 아웃라인 부분의 스타일을 설정    
border와 같은속성들을 가진다. 하지만 요소의 전체크기에 포함되지 않아 높이 넓이 두께는 영향을 받지 않는다.     

축약표현또한 가능  

      ex) outline: 3px solid teal;
            outline: 5px teal;

px은 두께지정, soild는 실선 설정, teal은 색설정이다.


# 4. 위치속성
## 1. 디스플레이 속성
블록 요소와 인라인 요소를 지정하는 말이다.(보여주기 위한 요소들)


### 1. 인라인-블록
인라인 요소처럼 동작하지만 요소안에서 블록요소처럼 동작하는것.       

### 2. opacity 속성
요소의 투명도를 조절할 수 있다.      


## 2. position 속성
position 속성은 HTML 요소가 위치를 결정하는 방식을 설정
CSS에서 요소의 위치를 결정하는 방식에는 다음과 같이 4가지 방식이 있습니다.

 
1. 정적 위치(static position) 지정 방식
2. 상대 위치(relative position) 지정 방식
3. 고정 위치(fixed position) 지정 방식
4. 절대 위치(absolute position) 지정 방식

## 3. float 속성
요소와 요소가 자연스럽게 어울리도록 만들어주는 역할 요즘은 레이아웃 작성에 많이 쓰임      
### 1. clear속성
float속성을 사용한뒤 그뒤에 요소들이 영향을 받지않도록          
clear속성를 사용 float의 영향을 받지 않도록 해준다.         


### 2.overflow 속성
float 속성이 적용된 HTML 요소가 자신을 감싸고 있는 컨테이너 요소보다 크면, 해당 요소의 일부가 밖으로 흘러넘치게 된다.              
이때 overflow 속성값을 auto로 설정하면, 컨테이너 요소의 크기가 자동으로 내부의 요소를 감쌀 수 있을 만큼 커지게 된다.


## 4. 정렬
margin, position, float을 이용하여 정렬을 할수있다.
margin은 가운대 정렬 position, float은 좌우 정렬이다.     



# 5. 선택자

## 1. 선택자 
1. 전체 선택자
2. HTML 요소 선택자
3. 아이디(id) 선택자
4. 클래스(class) 선택자
5. 그룹(group) 선택자


요소 선택자 : h2등 직접 요소로 지정한다.           
아이디 선택자 : 특정요소에 아이디를 부여해 선택한다(자바스크립트의 오류가 발생할수있어 한아이디는 하나의 요소만 부여한다.) ex) #id{}       
클래스 선택자 : 특정 클래스를 부여받은 요소를 지정ex) .class      
그룹 선택자 : 여러선택자를 같이 사용 ,로 연결함    
전체선택자 : * 모든요소로 지정한다.           

### 1. 자손선택자 
특정요소의 하위 요소들을 선택할수있다. 

            ex) div p {스타일;}

### 2. 자식선택자 
특정요소의 하위 요소중 하로밑에 존재하는 특정타입의 요소를 지정        

      ex)div > p{스타일;}

### 3. 동위 선택자

일반 동위 선택자는 해당 요소와 동위 관계에 있으며, 해당 요소보다 뒤에 존재하는 특정 타입의 요소를 모두 선택


      ex)div ~ p{스타일;}


인접동위 선택자는 바로 뒤에존재하는것만 적용 


      ex)div + p{스타일;}



## 2. 의사 클래스 

요소의 상태를 명시할때 사용하는 클래스     


### 1. 동적의사 클래스

link, visited, hover, active, focus 가있다.    

### 2. 상태 의사 클래스
checked, enabled, disabled 가있다.     

### 3. 구조 의사 클래스
first-child,last-child,nth-child,nth-last-child,              
first-of-type,last-of-type,nth-of-type,nth-last-of-type
으로 되어있으며         
자식요소나 타입 을 지정하여 맨앞 맨뒤등 여러 지정이 가능하다.         
empty는 자식과 타입이 없는요소지정 root는 html요소를 지정하게 된다.       

## 3. 의사요소
요소의 특정부부만 지정할때 사용 

    ex) 선택자::의사요소이름 {속성: 속성값;}


## 4. 속성선택자

특정 속성이나 특정 속성값을 가진 요소를 선택 가능      
[속성이름]으로 작성한다.      

속성값의 경우 [속성이름="속성값"] 와 같이 작성       


## 5. 기타의사 클래스    
### 1. :not 
모든 선택자와 함께 사용할 수 있으며, 해당 선택자를 반대로 적용하여 선택

      input:not([type="password"]) { background-color: #CD853F; }

 위와같이 작성시 password 타입을 제와한 나머지 input의 컬러를 적용하게 된다. 

### 2. :lang
특정 HTML 요소를 사용자 컴퓨터의 언어 설정에 따라 다르게 표현할 때 사용        



# 6. 고급 CSS
## 1. 네비게이션 바 
웹사이트의 메뉴 부분       
수평 혹은 수직 네비게이션 바가 있으며 링크등을 사용하여 리스트로 만든다.      


## 2. 드롭다운 효과

마우스를 올렸을때 나타나는 효과를 만들수 있다.     
마우스를 몰리면 하위메뉴가 나오거나 다른 요소가 나오게 할수있다.    

## 3. 툴팁

마우스를 올렸을경우 추가적인 정보를 보여주는 효과

## 4. form요소
css를 이요하여 input요소에도 스타일을 적용가능하다.

## 5. @규칙

### 1. @inport
@import 규칙은 다른 스타일 시트에서 스타일 규칙을 가져올 수 있는 규칙           
CSS파일의 개수가 늘어나면 서버의 부하가 커지기떄문에 부하를 낮추기 위해 사용


### 2. @font-face
폰트를 정의할때 사용하는 규칙           

### 3. @media
다른 미디어 타입을 위한 맞춤식 스타일 시트를 지원         



# 7. css3
css와 완전히 호환 css의 최신 표준 권고안 이다.      

## 1. 변경사항

1. 선택자 Level3
2. 미디어 쿼리 Level3
3. 색 Level3
4. 네임스페이스

## 2. 벤더 프리픽스
벤더 프리픽스(vendor prefix)란 이러한 주요 웹 브라우저 공급자가 새로운 실험적인 기능을        
제공할 때 이전 버전의 웹 브라우저에 그 사실을 알려주기 위해 사용하는 접두사(prefix)

## 3. 색
RGBA 색상값으로 표현 가능(R,G,B,A(투명도))      
HSL 색상값으로 표현가능(색상(0~360),채도,명도)         
HSLA  색상값으로 표현 HSL에서 A(투명도가 추가됨)


### 1. opacity 속성
색상의 투명도 설정 0.0~1.0        
opacity 속성은 투명도를 설정했을 때 설정한 요소의 모든 자식(child) 요소까지 전부 같은 투명도로 설정          
알파 채널은 투명도를 설정한 요소에만 투명도를 설정           

## 4. 그래디언트

색사이의 표현을 부드럽게 전환해주는 효과      

선형과 원형 그래디언트가 있다.      

### 1. 선형 그래디언트 

  ex) background: linear-gradient(진행방향, 색상지정점1, 색상지정점2, ...);

각도지정 등을 통해서 대각선 진행 혹은 수직 수평 지정이 가능하다.              
RBGA값을 통하여 투명도또한 설정 가능하다.(점점사라지는것이 가능)        

### 2. 원형 그래디언트

   ex) background: radial-gradient(모양 크기 at 중심점, 색상지정점1, 색상지정점2, ...);       

중심점부터 시작되는 원형 그래디언트       


   
## 5. 그림자 효과
shadow속성으로 text-shadow와 box-shadow가 있다.      

### 1. text-shadow

    ex)text-shadow: 그림자의x축값 그림자의y축값 blur값 색상값;

그림자의 흐림정도를 나타내는 blur값을 명시해야 한다.



### 2. box-shadow 


     ex) box-shadow: 그림자의x축값 그림자의y축값 blur값 색상값;

## 6. 배경
새로추가된 속성은 

1. background-size
2. background-origin
3. background-clip


위 3가지가 있다.         

### 1. size
배경 이미지의 크기를 설정하여 준다.      

  ex) background-size: 너비 높이 contain|cover ;


크기단위로 표시해주면 됨

### 2. origin
배경 이미지의 위치를 결정할 기준을 설정한다.       

속성값으로는 아래와 같다.       

1. border-box : 배경 이미지를 테두리(border) 영역의 왼쪽 위에 맞춥니다.
2. padding-box : 기본 설정이며, 배경 이미지를 패딩(padding) 영역의 왼쪽 위에 맞춥니다.
3. content-box : 배경 이미지를 내용(content) 영역의 왼쪽 위에 맞춥니다.


### 3. clip
요소의 배경의 영역을 설정하여 준다.
속성값은 아래 3가지다.

1. border-box : 기본 설정이며, 배경을 테두리(border) 영역의 끝부분까지 설정합니다.
2. padding-box : 배경을 패딩(padding) 영역의 끝부분까지 설정합니다.
3. content-box : 배경을 내용(content) 영역까지만 설정합니다.       


## 7. 태두리
추가된 속성

1. border-radius
2. border-top-left-radius
3. border-top-right-radius
4. border-bottom-right-radius
5. border-bottom-left-radius
6. border-image
7. border-image-source 
8. border-image-slice
9. border-image-width
10. border-image-outset
11. border-image-repeat

radius의 경우 모서리를 둥글게 만드는것이고 image는 태두리에 이미지를 사용할수있다.      
source는 이미지설정 slice는 자르는방법의 설정 outset는 태두리이미지가 넘어갈정도설정    
repeat는 반복처리할지 늘리지 설정       


## 8. 텍스트
추가된 속성

1. text-overflow
2. word-wrap
3. word-break


overflow는 콘텐츠 영역을 벗어난 텍스트의 표현방법 설정       
wrap은 길이가 긴 단어를 다음 줄에 나누어 표현할 수 있도록 해준다    
break는 길이가 긴 단어를 나누어 표현할때 나누는 기준 설정


## 9.글꼴
 @font-face 규칙이 추가되었다.      
 웹글꼴을 써서 사용자의 컴퓨터에 글꼴이 없어도 사용이 가능하다.      

 # 8. 변형

## 1. Transform

### 1. 2D Transform
HTML 요소의 모양, 크기, 위치 등을 자유롭게 바꿀 수 있다.        

움직이거나 회전시키거나 크기를 변형시키는것이 가능하다.      

1. translate() : 움직임
2. rotate() :  회전시킴
3. scale() : 크기변경
4. skew() : 기울임
5. matrix() : 위의 모든 메소드를 한줄에 작성가능

   ex) matrix(scaleX(), skewY(), skewX(), scaleY(), translateX(), translateY());


### 2. 3D Transform

1. rotate() : XYZ 축으로 각각 회전이 가능 ex)  rotateX() rotateY() rotateZ()
2. translate() : XYZ축 을 방향으로 이동 
3. scale() : 
4. matrix()
5. perspective() : 원근감의 기준


## 2. 애니메이션

### 1. @keyframes 규칙
CSS3에서 애니메이션 효과를 사용하기 위해서는 우선 애니메이션에 대한 키 프레임(keyframe)을 정의해야된다.        


animation-name 속성을 이용하여 요소와 키 프레임을 연결해 주어야 한다.      


# 9. 변형

## 1. 버튼 
a태그와 input태그로도 버튼이 작성 가능하다.   

## 2. 사용자 인터페이스
사용자가 요소나 아웃라인 등을 변경할수 있게 해준다.   
아래와 같은 속성이 있다. 
1. resize
2. outline-offset
3. box-sizing
4. nav-index
5. nav-left
6. nav-right
7. nav-up
8. nav-down

## 3. 다중칼럼 레이아웃
여러게의 칼럼으로 구성되는 구조를 column속성으로 손쉽게 만들수 있다.       
아래와 같은 속성이 있다.      

1. columns
2. column-count
3. column-gap
4. column-width
5. column-span
6. column-fill
7. column-rule
8. column-rule-style
9. column-rule-width
10. column-rule-color

## 4. 플렉서블 박스 레이아웃
서로 다른 크기의 화면과 기기에서도 HTML 요소들이 자동으로 재정렬되어, 웹 페이지의 레이아웃을 언제나 똑같이 유지할 수 있게 해준다.    
속성은 아래와 같다      

1. display
2. flex-direction
3. justify-content
4. align-items
5. flex-wrap
6. flex-flow
7. align-content


플렉스 요소를 위한 속성 
1. order
2. align-self
3. flex


## 5. 미디어 쿼리
CSS3에서는 @media 규칙을 더욱 발전시켜 매체 유형(media type)과 하나 이상의 
표현식(expression)으로 구성된 미디어 쿼리(media query)를 사용할 수 있습니다.      


 
