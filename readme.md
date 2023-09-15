# spring-boot-boilerplate

### 사용방법
`install.sh`로 보일러 플레이트 설치용 쉘 스크립트를 구성

```bash
 /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/ieunune/spring-boot-boilerplate/main/install.sh)" 
```

위 명령으로 github에 올라가 있는 `install.sh`를 가져와 실행할 수 있다.

```
1) spring-boot-api
2) spring-boot-react-web
3) spring-boot-batch
#?
```

실행하면 위와 같이 어떤 보일러 플레이트를 가져올 지 선택할 수 있다. 선택하면 해당 보일러 플레이트가 받아진다.

## description

- spring-boot-api

Java + Spring Boot로 만들어진 Rest API 보일러 플레이트

- spring-boot-react-web

Java + Spring Boot와 React 결과물을 spring boot 서버로 서빙하도록 구성한 보일러 플레이트.

- spring-boot-batch

Java + Spring Boot로 만들어진 Batch 어플리케이션 보일러 플레이트.

> Spring Boot로 SSR이 아닌 단순 결과물 HTML을 Spring Boot 서버로 내려줌. 때문에 React 페이지는 CSR로 동작함
