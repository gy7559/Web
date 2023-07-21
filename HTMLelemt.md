# 1. 스타일
태그에 style속성을 이용하여 위치 크기 등을 지정하여 줄수있다. 


    ex) 배경색 변경 : style="background-color:white" 를 태그에 넣어주면 배경색이 변경된다.
        글자색 변경 : style="color:maroon"
        글자크기 변경 : style="font-size:250%
        문단 정렬 변경 : style="text-align:center
        
등이 있다.

 style="background-color:white; color:maroon; font-size:150%; text-align:center"         
 위와 같이 한태그에 여러 css스타일을 한번에 적용가능하다.
   
# 2. 색상

HTML4의 표준 색상은 16가지로 
다음과 같다.
|||
|---|---|
|aqua|black|
|blue|fuchsia|
|gray|green|
|lime|maroon|
|navy|olive|
|purple|red|
|silver|teal|
|white|yellow|

또한 RBG값과 16진수로 색을 표현할수 있다.


# 3. 링크
하이퍼 링크로 a태그에서 href 속성을 사용하여       
링크주소를 넣어서 택스트를 클릭하면 링크로 들어갈수 있도록 한다.



또한 target속성을 사용하여 링크를 여는 방식을 지정 가능하다.      

|target 속성값|	설명|
|---|---|
|_blank	|링크로 연결된 문서를 새 창이나 새 탭에서 오픈.|
|_self	|링크로 연결된 문서를 현재 프레임(frame)에서 오픈. (기본설정)|
|_parent	|링크로 연결된 문서를 부모 프레임(frame)에서 오픈.|
|_top	|링크로 연결된 문서를 현재 창의 가장 상위 프레임(frame)에서 오픈.|
|프레임(frame) 이름	|링크로 연결된 문서를 지정된 프레임(frame)에서 오픈.|

hover와 visited와 같이 링크의 상태가 나뉜다.

# 4. 이미지
이미지의 종류로는 JPEG,GIF,PNG가있으며      
img태그를 사용 종료태그가 없다
img src="이미지주소" alt="대체문자열" 과 같이 태그를 작성         
그뒤 style을 사용하여 이미지가 표시될 크기와 위치등을 지정 가능하다.       
또한 boder를 통한 경계선 지정과 link를 사용하여 링크지정도 가능하다.        

# 5. 리스트

ol,ul,li,dl,dt,dd가 있다.

ol은 순서가 있는 리스트, ul은 순서가 없는 리스트이며      
li는 리스트의 요소

dl,dt,dd는 정의 리스트로 dt는 용어의 이름 dd는 용어의 설명이 들어간다.      

# 6. 태이블
여러 데이터를 정리할수있는 표로서

tr은 열을 구분 th는 태그의 제목을 작성하고
td는 각 태이블의 셀을 나누어준다.


```html
<table style="width:100%">

    <tr style="background-color:lightgrey">

        <th>참치</th>

        <th>고래</th>      

    </tr>
    <tr>

        <td>상어</td>

        <td>문어</td>

    </tr>

    <tr>

        <td>오징어</td>

        <td>고등어</td>

    </tr>

</table>
```
위와 같이 작성할 경우

|참지|고래|
|---|---|
|상어|문어|
|오징어|고등어|

와 같이 작성된다.

boder를 통하여 테두리에 대한 값을 변경가능하며           
column을 이용하여 열을 합치거나       
rowspan을 사용하여 행을 합칠수 있다.         
함께사용하는것도 가능하다.       
caption을 사용하여 표에대한 설명을 붙일수 있다.     

# 7. 블록과 인라인
### 1. 블록
display 속성값이 블록(block)인 요소는 언제나 새로운 라인(line)에서 시작, 해당 라인의 모든 너비를 차지한다.          
**간단하게 블록 속성인 요소를 주면 한줄을 꽉 체우는 요소로서 지정 된다.**
ex) p,div,h,ul,ol,form이 블록인 요소 이다.

div는 다른 요소를 하나로 묶어 하나의 블록으로 적용시킬수 있다.    


### 2. 인라인 
인라인 요소는 새로운 라인에서 시작하지 않으며 요소에 작성된 내용만큼의 공간만 차지한다.        
예로는 span,a,img등이 있다.      

span은 텍스트의 일부분을 특정 하기위해 사용하는 요소 이다.        
ex) 특정부분의 색을 바꿈    

# 8. iframe
웹사이트안에 다른 웹페이지를 삽입할수있는것으로       
삽입되는 창의 크기는 고정되며 종료태그가 존재한다.

cols를 사용하여 수직프레임 셋을 rows를 사용하여 수평 프레임셋을 지정할수있다.      

# 9. 레이아웃
레이아웃은 요소를 공간에 배치하여 좀더 가시성이 좋게 사용성이 좋게 만드는 작업 이다.      

div,table등을 이용하여 할수있다.


div의 경우 각 div에 id를 지정 stlye에서 각 id별로 크기 위치선정 등을 지정해줄수 있다.      


HTML5에서 제공하는 레이아웃을 위한 요소는 다음과 같다.


|의미 요소|	설명|
|---|---|
|header|	|HTML 문서나 섹션(section) 부분에 대한 헤더(header)를 정의함.|
|nav	|HTML 문서의 탐색 링크를 정의함.|
|section	|HTML 문서에서 섹션(section) 부분을 정의함.|
|article	|HTML 문서에서 독립적인 하나의 글(article) 부분을 정의함.|
|aside	|HTML 문서에서 페이지 부분 이외의 콘텐츠(content)를 정의함. |
|footer	|HTML 문서나 섹션(section) 부분에 대한 푸터(footer)를 정의함.|

table을 이용한 레이아웃의 경우 수정이 힘들어 요즘에는 잘 사용하지 않는다.





