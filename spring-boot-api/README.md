# Spring restapi template
> **Note** <br/>
> 백엔드 스프링 Rest API template 입니다. <br/>
> java + spring + gradle

# 디렉토리 구조

```
├── 📂main
│   ├── 📂java
│   │   └── 📂com
│   │       └── 📂boilerplate
│   │           └── 📂api
│   │               ├── 📄DemoApplication.java
│   │               ├── 📂domain
│   │               │   ├── 👔product
│   │               │   │   ├── 📁api        📢 컨트롤러 클래스 구성
│   │               │   │   ├── 📁entity     📢 도메인 Entity 클래스 구성
│   │               │   │   ├── 📁dto        📢 requestDto, responseDto 구성
│   │               │   │   ├── 📁exception  📢 해당 도메인 Exception 구성
│   │               │   │   ├── 📁repository 📢 Entity <-> DB 처리하는 클래스 구성
│   │               │   │   └── 📁service    📢 서비스 클래스 구성
│   │               │   ├── 🛒purchase
│   │               │   │   ├── 📁api
│   │               │   │   ├── 📁entity
│   │               │   │   ├── 📁dto
│   │               │   │   ├── 📁exception
│   │               │   │   ├── 📁repository
│   │               │   │   └── 📁service
│   │               │   └── 👩‍👩‍👧‍👦user
│   │               │       ├── 📁api
│   │               │       ├── 📁entity
│   │               │       ├── 📁dto
│   │               │       ├── 📁exception
│   │               │       ├── 📁repository
│   │               │       └── 📁service
│   │               ├── 🌏global
│   │               │   ├── 📂common        📢 공통으로 사용되는 클래스로 구성
│   │               │   │   ├── 📁request
│   │               │   │   └── 📁response
│   │               │   ├── 📂config        📢 스프링 설정 정보 클래스로 구성
│   │               │   │   ├── 📄SwaggerConfig.java
│   │               │   │   └── 📁security
│   │               │   ├── 📂error         📢 예외 핸들링 담당 클래스로 구성
│   │               │   │   ├── 📄ErrorResponse.java
│   │               │   │   ├── 📄ExceptionHandler.java
│   │               │   │   └── 📁exception
│   │               │   └── 📁util          📢 유틸성 클래스, 지원 클래스들로 구성
│   │               └── 📂infra             📢 인프라 구성 설정 (Slack, Mail ...)
│   │                   └── 📂slack
│   │                       ├── 📄SlackClient.java
│   │                       └── 📁dto
│   └── 📂resources
│       ├── 📄application-dev.yml 
│       ├── 📄application-local.yml 
│       ├── 📄application-prod.yml 
│       ├── 📄application-stg.yml 
│       └── 📄application.yml
```

# URI 디자인 규칙 7가지

### 1. URI 마지막에 슬래시(/)를 포함하지 않는다.

URI 경로 마지막은 반드시 문자여야 한다. 슬래시(/) 다음에 의미 있는 값을 추가하지 않으면 혼동이 올 수 있다.

X : `http://api.canvas.com/shapes`  
O : `http://api.canvas.com/shapes`

### 2. 슬래시(/)를 사용하여 계층적 관계를 나타낸다.

슬래시 문자는 리소스 간의 계층적 관계를 나타내기 위해 URI 경로에 사용된다.

ex) `http://api.canvas.com/shapes/polygons/quadrilaterals/squares`

### 3. URI 가독성을 높이려면 하이픈(-)을 사용해야 한다.

URI를 사람들이 쉽게 스캔하고 해석할 수 있더로 하이픈(-) 문자를 사용하여 가독성을 높인다. 영어로 공백이나 하이픈을 사용하면 URI에서는 모두 하이픈을 사용해야 한다.

spinal-case 사용한다.
 ex) `http://api.example.com/rest/api/this-is-uri-design`

### 4. 밑줄(_)은 URI에 사용해서 안된다.

URI에 하이퍼링크가 걸려있을 경우 종종 URI에 밑줄을 쳐서 클릭할 수 있게 시각화한다. 글꼴에 밑줄(_)문자가 밑줄로 인해 부분적으로 가려지거나 완전히 숨겨질 수 있다.  

![images2Fgga46382Fpost2F50c76cff-0844-4b44-993e-60facf01e4ac2Fimage](https://user-images.githubusercontent.com/50124623/210239308-8b4a0786-c0d1-4626-af84-a819788e162c.png)  

이러한 혼동을 방지하기 위해서 밑줄대신 **하이픈(-)을 사용**한다.

### 5. URI는 소문자로 작성하고, 명사를 사용해야 한다.

리소스를 설명할 때 동사가 아닌 구체적인 명사 사용한다.

### 6. 파일 확장자는 URI에 포함하지 않는다.

마침표(.) 문자는 일반적으로 이름과 확장자 부분을 구분하는데 사용된다.
 REST API는 메세지의 entity body 형식을 나타내기 위해 URI는 파일 확장자를 포함해서는 안 된다.

ex)
 X : `http://restapi.example.com/members/soccer/345/photo.jpg`
 O : `http://restapi.example.com/members/soccer/345/photo`

대신 헤더를 사용하여 본문의 컨텐츠를 처리해야 한다.

```
GET /members/soccer/345/photo HTTP/1.1
Host: restapi.example.com
Accept: image/jpg
```

Accept로 원하는 형식을 보내면, 서버가 그에 맞춰 보내준다.

### 7. 복수형을 사용한다.

ex) `http://api.college.com/students/3248234/courseshttp://api.college.com/students/3248234/courses/physics`
