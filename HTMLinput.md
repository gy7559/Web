# 1. form요소

사용자에게 데이터를 입력받아야 될 경우 사용한다.

form action="처리할페이지주소" method="get|post"
다음과 같은 문법으로 사용하며 종료태그 또한 넣어주어야 한다.    

method 속성을 통해 명시할 수 있는 form 요소의 전달 방식은 GET 방식과 POST 방식으로 나눠진다.     

input요소로는 다음과 같다.    
1. 텍스트 입력(text)
2. 비밀번호 입력(password)
3. 라디오 버튼(radio)
4. 체크박스(checkbox)
5. 파일 선택(file)
6. 선택 입력(select)
7. 문장 입력(textarea)
8. 버튼 입력(button)
9. 전송 버튼(submit)
10. 필드셋(fieldset)

## 1. text
input태그의 type속성값을 text로 설정해 주면 된다.


## 2. 비밀번호 입력
input태그의 type속성값을 password로 설정해 주면 된다.

## 3. 라디오 버튼
input태그의 type 속성값을 radio로 설정해주면 여러 선택지중 하나의 옵션을 선택 하여      
입력 받을 수 있다.

## 4. 체크박스
input태그의 type 속성값을 checkbox로 설정해주면 여러 선택지중 다수의 옵션을 선택 하여      
입력 받을 수 있다.

## 5. 파일 
input태그의 type 속성값을 file로 설정해주면 파일을 전송받을수 있다.       
accept를 사용하여 파일의 확장자 및 종류를 지정할수 있다.     
## 6. 선택 입력(select)
slect요소를 사용하여 옵션이 여러게 중에서 하나를 선택하여       
받을수있는 드롭다운 리스트가 된다. 

## 7. 문장 입력(textarea)
textarea는 여러줄의 택스트를 입력받을수 있다.      

## 8. 버튼 입력(button)
button 요소는 버튼을 만들어 준다.    

## 9. 전송 버튼(submit)
input태그의 type 속성값을 submit으로 설정하면 작성된 내용의 데이터를 서버에 제출하는 버튼을 만들수 있다.

      ex) input type="submit" value="전송

## 10. 필드셋(fieldset)
form과 관련된 요소들을 하나로 묶어 준다.      


# 2. input의 요소 

## 1. value속성
필드의 기본값을 지정해준다.      

## 2. readonly 속성
말그대로 필드를 읽을수만 있고 사용자가 수정하지 못하도록 설정할수있다.

## 3. disabled 속성
사용자가 입력필드를 사용할수 없도록 한다.     


## 4. maxlength 속성
입력 필드에 입력할수있는 최대길이를 설정하여 준다.     


## 5. size 속성
input요소가 보이는 크기를 지정하여 준다.    

