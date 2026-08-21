# Backend Roadmap

컴퓨터공학 전공 복학생의 백엔드 개발자 취업 준비 기록

## 목표

- Java 기초 및 객체지향 이해
- Spring Boot 기반 백엔드 개발
- MySQL / JPA 학습
- REST API 설계 및 구현
- 테스트 코드 작성
- Docker / AWS를 활용한 배포
- 백엔드 포트폴리오 프로젝트 2개 완성
- 코딩 테스트 및 CS 면접 준비

## Tech Stack

### 현재 학습 중
- Java 21
- Git / GitHub

### 학습 예정
- MySQL
- Spring Boot
- Spring Data JPA
- Spring Security
- Docker
- AWS
- GitHub Actions

## Learning Progress

- [x] Day 01 - Java 기본 문법
- [x] Day 02 - Java Collection
- [x] Day 03 - Java 객체지향
- [x] Day 04 - Java 예외 처리 / 기타
- [ ] Java 기초 복습
- [ ] SQL
- [ ] Spring Boot
- [ ] JPA
- [ ] Spring Security
- [ ] 테스트
- [ ] Docker
- [ ] AWS
- [ ] 프로젝트 1
- [ ] 프로젝트 2

## Directory

```text
src/
├── day01/
│   ├── Problem01.java
│   ├── Problem02.java
│   ├── Problem03.java
│   ├── Problem04.java
│   ├── Problem05.java
│   └── Student.java
└── ...

### Day 02
- ArrayList 학습
- ArrayList의 add / get / set / remove / size
- HashSet과 중복 제거
- HashMap의 Key-Value 구조
- 향상된 for문
- 객체를 ArrayList에 저장
- 객체를 HashMap에 저장
- Collection에서 객체를 꺼내 메서드 호출

### Day 03
- 인터페이스(interface)
- implements
- @Override
- 다형성
- 인터페이스 타입으로 구현체 다루기
- List 인터페이스와 ArrayList 구현체
- 서로 다른 구현체를 하나의 List로 관리

### Day 04
- 예외(Exception)의 개념
- try-catch
- ArithmeticException
- ArrayIndexOutOfBoundsException
- 여러 catch 사용
- finally
- 예외 발생 후 흐름 이해

### Day 05
- 클래스 책임 분리
- User / UserRepository / UserService 구조
- Repository의 역할
- Service의 역할
- 생성자를 통한 의존성 전달
- 비즈니스 로직과 검증
- throw
- IllegalArgumentException
- try-catch를 이용한 예외 처리

### Day 06 - CRUD

#### 학습 내용
- CRUD 개념
  - Create
  - Read
  - Update
  - Delete
- User 조회 기능 구현
- ID를 이용한 사용자 조회
- 사용자 정보 수정
- 사용자 삭제
- Iterator를 이용한 안전한 삭제
- Service / Repository 역할 분리
- CRUD 과정에서의 예외 처리

#### 구현 구조

```text
Problem06
    ↓
UserService
    ↓
UserRepository
    ↓
List<User>

### Day 07 - HTTP / REST API 기초

#### 학습 내용
- HTTP Method 이해
  - GET: 조회
  - POST: 생성
  - PUT: 수정
  - DELETE: 삭제
- REST API의 기본적인 URL 구조 이해
  - `GET /users`
  - `GET /users/{id}`
  - `POST /users`
  - `PUT /users/{id}`
  - `DELETE /users/{id}`
- HTTP 상태 코드 이해
  - `200 OK`: 요청 성공
  - `201 Created`: 리소스 생성 성공
  - `400 Bad Request`: 잘못된 요청
  - `404 Not Found`: 리소스를 찾을 수 없음
  - `500 Internal Server Error`: 서버 내부 오류
- HTTP Request / Response 개념
- JSON을 이용한 데이터 전달
- Request Body와 Response Body 이해
- 사용자 ID는 서버/DB에서 관리하는 개념 이해

#### CRUD와 HTTP의 연결

| CRUD | HTTP Method | URL |
|---|---|---|
| Create | POST | `/users` |
| Read | GET | `/users`, `/users/{id}` |
| Update | PUT | `/users/{id}` |
| Delete | DELETE | `/users/{id}` |

#### 예시

회원가입 요청:

```json
{
  "name": "홍길동",
  "email": "hong@example.com"
}