# 1. 제이쿼리
제이쿼리는 자바스크립트 언어를 간편하게 사용할 수 있도록 단순화 시킨 오픈소스 자바스크립트 라이브러리 이다.           


## 1. 기초
가장 많이 사용되고 있는 자바스크립트 라이브러리는 다음과 같다.     

1. 프로토타입(Prototype)
2. 도조(Dojo)
3. GWT(Google Web Toolkit)
4. MochiKit

 
## 2. 적용
제이쿼리 파일은 .js(자바스크립트) 파일 형태로 존재한다.          
그래서 사용할려면 먼저 제이쿼리 파일을 웹페이지에 로드 해 두어야 한다.       

1. 제이쿼리 파일을 다운받아 로드하는 방법
2. CDN(Content Delivery Network)을 이용하여 로드하는 방법

위 두 방법이 있다.



## 3. 문법
제이쿼리의 기본 문법은 다음과 같다. 


   ex) $(선택자).동작함수();

### 1. $() 함수
$() 함수는 선택된 HTML태그 이름뿐 아니라 CSS선택자를 전달하여 HTML요소를 선택 가능하다.       

$() 함수를 통해 생성된 요소를 제이쿼리 객체(jQuery object)라고 한다.     

### 2. Document 객체의 ready() 메소드

웹브라우저 문서의 모든 요소가 로드되기 전에 자바스크립트 코드가 실행되면 오류가 발생할 수 있다.      
다음과 같은 경우이다.        

1. 아직 생성되지 않은 HTML 요소에 속성을 추가하려고 할 경우
2. 아직 로드되지 않은 이미지의 크기를 얻으려고 할 경우


   ex) $(document).ready(function() {
       제이쿼리 코드;
      });

위와같은 예제로 예방해준다.


## 4. 요소의 선택

### 1. CSS선택자를 통한 선택

  ex)$(function() {
      $("p").on("click", function() {        // <p>요소를 모두 선택함.
        $("span").css("fontSize", "28px"); // <span>요소를 모두 선택함.
      });
    });

위와같이 예제를 들수있다. 
p와 span태그를 선택할수있다.     
이와같이 CSS의 선택자인 id, class, 속성등을 지정해서 선택할수있다.      


### 2. 제이쿼리 선택자
비표준 선택자 또한 사용할수있다.     


#### 1. 선택 요소의 저장 
```
$(function() {
    var items = $("li"); // <li>요소를 모두 선택하여 변수 items에 저장함.
    $("button").on("click", function() {
        $("#len").text("저장된 <li>요소의 총 개수는 " + items.length + "개 입니다.");
    });
});
```
위와 같이 li의 요소를 변수에 저장하여 해당 변수를 사용할수 있다.         

필터링 또한 가능하다.      
필터링은 특정 요소중에서 다른 요소를 갖고 있는 요소만을 선택할수 있게 해준다

ex)
```
$(function() {
    $("button").on("click", function() {
        $("li:has(span)").text("<span>요소를 가지고 있는 아이템이에요!");
    });
});
```
li 요소 중에서 span요소만 갖고 있는 li요소만 지정하도록 설정 하여 줄수 있다.           

#### 2. getter와 setter 메소드

getter는 요소에 접근하여 값을 읽어오기 위한 메소드,        
setter는 요소에 접근하여 값을 설정하기 위한 메소드이다.       

getter는 읽어오기 때문에 인수를 전달할 필요 없지만        
setter의 경우 값을 설정해 주어야 되기 떄문에 설정해줄 값이 필요하다.      

**메소드 체이닝**

getter의 경우 여러 요소가 선택되면 첫 번째 요소의 값만 반환을 하게되는대        
하지만 setter 메소드는 선택된 '모든 요소'에 인수로 전달된 값을 설정하고            
모든요소에 접근할 수 있는 또 다른 제이쿼리 객체를 반환하는대          
이 객체를 이용하면 세미콜론(;)을 사용하지 않고도, 곧바로 다른 제이쿼리 메소드를 호출 할수있다.        
이런 방식으로 여러 개의 메소드가 연속으로 호출되는 것을 메소드 체이닝(method chaining)이라고 한다.          

```
$(function() {
    $("button").on("click", function() {
        // id가 "list"인 요소의 자손 요소 중에서 <li>요소를 모두 선택한 후에,
        // 그 중에서 두 번째 요소의 값을 설정함.
        $("#list").find("li").eq(1).html("두 번째 아이템을 선택했어요!!");
    });
});
```

**.width() 메소드와 .height() 메소드**
getter와 setter를 써서 높이 넓이를 구하거나 설정해줄수있다.       

```
$(function() {
    $("#getter").on("click", function() {
      var size = "너비는 " + $("#box").width() + "px이고, 높이는 "
            + $("#box").height() + "px입니다.<br>";
        $("#text").html(size);
    });

    $("#setter").on("click", function() {
      w = $("#box").width();
      h = $("#box").height();
      $("#box").width(w/2).height(h/2);
 
      var size = "너비는 " + $("#box").width() + "px이고, 높이는 "
          + $("#box").height() + "px로 변경되었습니다.<br>";
        $("#text").html(size);
    });
});
```

## 5. 요소의 추가
요소를 추가할수 있는 여러 메서드가 있다.    

### 1. 요소내부추가
1. .append()
2. .prepend()
3. .appendTo()
4. .prependTo()

#### 1. .append()
 요소의 마지막에 새로운 요소나 컨텐츠를 추가 가능하다.

```
$(function() {
    $("button").on("click", function() {
        $("#list").append("<li>새로 추가된 아이템이에요!</li>");
    });
});
```

#### 2. .prepend()
요소의 처음에 새로운 요소나 컨텐츠를 추가 가능하다.

#### 3. .appendTo() 
 선택한 요소를 '해당 요소의 마지막'에 삽입      
.append()와는 소스와 타켓의 위치가 서로 반대이다.      

```
$(function() {
    $("#firstBtn").on("click", function() {
        // id가 "list"인 요소의 맨 마지막에 id가 "firstItem"인 요소를 추가함.
        $("#firstItem").appendTo("#list");
    });
});
```
#### 4. .prependTo()
선택한 요소를 '해당 요소의 처음'에 삽입
.prepend() 메소드와 같지만, 소스(source)와 타겟(target)의 위치가 서로 반대이다.     

```
$(function() {
    $("button").on("click", function() {
        $("<b>새로 추가된 콘텐츠에요!</b>").prependTo(".item");
    });
});
```


### 2. 요소 외부 추가

1. .before()
2. .after()
3. .insertBefore()
4. .insertAfter()

#### 1. .before()
요소 바로 앞에 추가
```
$(function() {
    $("button").on("click", function() {
        // id가 "firstRow"인 요소의 바로 앞에 새로운 <tr>요소를 추가함.
        $("#firstRow").before("<tr><td>새로운 행이에요!</td></tr>");
    });
});
```

#### 2. .after()
요소 바로 뒤에 추가
```
$(function() {
    $("button").on("click", function() {
        // id가 "firstRow"인 요소의 바로 뒤에 새로운 <tr>요소를 추가함.
        $("#firstRow").after("<tr><td>새로운 행이에요!</td></tr>");
    });
});
```
#### 3. .insertBefore()
해당요소 바로 앞에 삽입한다.
```
$(function() {
    $("button").on("click", function() {
        // id가 "secondColumn"인 요소의 바로 앞에 새로운 <td>요소를 추가함.
        $("<td>새로운 셀이에요!</td>").insertBefore("#secondColumn");
    });
});
```
#### 4. .insertAfter()
해당요소 바로 뒤에 삽입한다.    
```
$(function() {
    $("button").on("click", function() {
         // id가 "secondColumn"인 요소의 바로 뒤에 새로운 <td>요소를 추가함.
        $("<td>새로운 셀이에요!</td>").insertAfter("#secondColumn");
    });
});
```


### 3. 요소 포함 추가
3가지 메서드가 있다.
1. .wrap()  : 선택한 요소를 포함
2. .wrapAll() : 선택한 모든 요소를 포함
3. .wrapInner() : 선택한 요소에 포함됨

```
$(function() {
    $("button").on("click", function() {
        // class가 "content"인 각 요소를 포함하는 새로운 요소를 추가함.
        $(".content").wrap("<div class='wrapper'></div>");
    });
});
```
각각 위예제에서 메서드 부분만 변경하면 된다.        


### 3. 요소의 복사 

요소나 콘텐츠를 복사하는 메소드는 .clone()이다.        

선택한 요소를 복사 해서 새로운 요소로 만든다.    

```
$(function() {
    $("button").on("click", function() {
        // id가 "firstItem"인 요소를 복사하여 id가 "list"인 요소에 추가함.
        $("#firstItem").clone().appendTo("#list");
    });
});
```

### 4. 요소의 대체
선택한 요소나 콘텐츠를 지정된 요소로 대체하는 메서드        

1. .replaceAll()
2. .replaceWith()

둘다 요소를 대체하는것은 맞지만 replaceWith은 삭제된 이전요소를 반환 할수있다.       


### 5. 요소의 삭제
특정 콘텐츠나 요소를 삭제하는 메서드 

1. .remove()
2. .detach()
3. .empty()
4. .unwrap()

#### 1. .remove()
remove의 경우 선택한 요소를 DOM트리에서 삭제한다.
```
$(function() {
    $("button").on("click", function() {
        // class가 "content"인 요소 중에서 class가 각각 "first", "second"인 요소를 모두 삭제함.
        $(".content").remove(".first, .second");
    });
});
```

## 6. 요소의 탐색
요소의 탐색범위는 조상요소, 형제요소, 자손요소 와 기타탐색 필터링으로 나뉜다.          

조상, 형제, 자손요소의 탐색은 트리탐색으로 DOM트리를 검색해 나아가는 과정을 가진다.      


### 1. 조상요소 탐색
특정 부모요소를 포함한 상위의 요소를 탐색하기 위한 메서드로       

1. .parent()
2. .parents()
3. .parentsUntil()
4. .closest()


위 4개가 있다.     
parent는 선택한 요소의 부모요소, parents는 선택한 요소의 모든 조상요소를 선택할수있다.        
parentsUntil은 선택한 요소의 조상 요소중에서 지정해준 선택자에 해당하는 요소 바로 이전 요소까지 모두선택(범위지정선택)        
closest은 자신을 포함한 조상요소중 지정한 선택자에 해당하는 요소의 집합에서 가장 첫번째 요소를 선택

### 2. 형제요소 탐색
크게 3가지로 메서드가 나뉜다 siblings, next, prev

#### 1. .siblings()
선택한 요소의 형제 요소중 지정한 선택자에 해당하는 모든 요소를 선택


#### 2. next
next는 선택한 요소의 바로 다음에 위치한 형제 요소를 선택한다.         
nextAll의 경우 선택한 요소 다음에 위치한 형제요소 전부를 선택한다.            
nextUntil의 경우 선택한 요소중 전달받은 선택자에 해당하는 요소 이전까지의 모든요소를 선택             


#### 3. prev
prev의 경우 각각 next,nextAll,nextUntil의 정반대로 동작한다.

## 7. 스타일 변경

### 1. 클래스 추가 
addClass와 removeClass를 사용하여 특정 클래스를 추가 및 제거를 할수 있고                
toggleClass을 사용하여 특정클래스를 넣었다 뺐다 할수있다.( ex)버튼을 한번누르면 추가 다시누르면 제거)                    
hasClass는 특정 클래스가 있는지 없는지 확인할수 있다.(있으면 true 없으면 false를 반환)

## 8. 이벤트
### 1. 이벤트핸들러 
이벤트핸들러라는 함수를 작성해서 요소와 이벤트를 연결시켜 주어야 한다.       

**이벤트 연결**
.on()메서드 를 사용해서 이벤트 연결이 가능하다.     

ex)
```
$(function() {
    // 모든 <button>요소에 mouseenter와 mouseleave 이벤트를 설정함.
    $("button").on("mouseenter mouseleave", function() {
        $("#text").append("마우스가 버튼 위로 진입하거나 빠져나갔어요!<br>");
    });
});
```
예제와 같은 경우 .on을 이용하여 버튼에 mouseenter(마우스들어옴) mouseleave(마우스나감) 이벤트가 발생할때          
text라는 id를 가진 요소에 ()안에 내용을 append를 이용하여 추가해준다.

이벤트 메서드는 마우스 키보드 입력양식과 관련된 메서드들이 있으며 가장 대표적인게 .click() .hover() .keypress()등이 있다.     

## 9. 이펙트 효과
### 1. 이펙트 효과
웹페이지에 다양한 효과를 넣을수 있는것으로 기본 이펙트를 바로 사용할수도 animate()메서드를 통해 설정을 변경해서 사용할수도 있다.         
### 2. 숨김효과
.hide()메소드로 선택 요소를 사라지게하고 .show()메소드는 숨긴 요소를 나타나게 한다.          


### 3. 페이드효과
페이드효과는 서서히 사라지고 나타나는 효과로 .fadeIn()의 경우 서서히나타나기 .fadeOut()의 경우는 반대로 사라지게         
.fadeToggle()은 나타나고 사라지게 만들어 준다.               


### 4. 슬라이드 효과
Up Down Toggle로 있으며 올라갔다 내려오는 속도조절이 가능하다.        

### 5. 이펙트 효과 제어

1. .delay()
2. .stop()
3. .finish()

위 세메서드를 사용하여 제어가 가능하다.

## 10. Ajax
웹페이지 전체가 아닌 일부만 갱신할수있게해줌            

프레임워크로는 

1. Prototype
2. script.aculo.us
3. dojo
4. jQuery

기 있다.        

제이쿼리는 Ajax기능을 손쉽게 사용할 수 있도록 여러 메소드가 있는대 이러한 메소드들로           
HTTP요청을 손쉽게 보낼 수 있다.         


### 1. HTTP요청 방식

두가지 방식이 있다.

1. GET방식
2. POST방식

#### 1. GET방식 
get방식은 주소에 데이터를 추가하여 전달하는 방식이다.           
GET 방식의 HTTP 요청은 브라우저에 의해 캐시되어(cached) 저장된다.               
또한, GET 방식은 보통 쿼리 문자열(query string)에 포함되어 전송되므로, 길이의 제한이 있다.          
따라서 보안상 취약점이 존재하므로, 중요한 데이터는 POST 방식을 사용하여 요청하는 것이 좋습니다.                 


#### 2. POST방식
POST 방식은 데이터(data)를 별도로 첨부하여 전달하는 방식이다.              
POST 방식의 HTTP 요청은 브라우저에 의해 캐시되지 않으므로, 브라우저 히스토리에도 남지 않는다.           
또한, POST 방식의 HTTP 요청에 의한 데이터는 쿼리 문자열과는 별도로 전송된다.          
따라서 데이터의 길이에 대한 제한도 없으며, GET 방식보다 보안성이 높다.           


#### 3. 메소드 


get의경우          
$.get() 메소드     

```
$.get(URL주소[,콜백함수]);
```



post의 경우           
$.post()메소드

```
$.post(URL주소[,데이터][,콜백함수]);
```


### 2. ajax메소드
$.ajax() 메소드       
메소드의 원형은 
```
$.ajax(URL주소[,옵션])
```

URL 주소는 클라이언트가 HTTP 요청을 보낼 서버의 주소            
옵션은 HTTP 요청을 구성하는 키와 값의 쌍으로 구성되는 헤더의 집합            

### 3. Ajax와 Form 요소

Ajax에서는 서버와의 비동기식 통신을 위해 form 요소를 통해 입력받은 데이터를 직렬화(serialization)하여 전송한다.       


이때 직렬화(serialization)란 입력받은 여러 데이터를 하나의 쿼리 문자열로 만드는 것을 의미한다.           
이렇게 함으로써 form 요소를 통해 입력받은 데이터를 한 번에 서버로 보낼 수 있다.             

