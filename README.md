# 2022.07.31

## TODO 
 1. springdoc 라이브러리 추가 (완료)
 2. swagger 화면 나오게 하기 (완료)

## 라이브러리 추가
```html
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>1.6.9</version>
</dependency>
```

## application.yaml 수정
```yaml
server:
  port: 7890

springdoc:
  api-docs:
    path: /api-docs
  swagger-ui:
    path: /swagger-ui.html
    operationsSorter: method
```

## 참고사이트
 - [https://www.baeldung.com/spring-rest-openapi-documentation](https://www.baeldung.com/spring-rest-openapi-documentation)