# 코딩으로 학습하는 GoF의 디자인 패턴

이 저장소는 **Gradle** 기반 Java 환경으로 구성되어 있습니다.

## 빌드 환경 · 의존성

`s03_java` 패키지 예제가 Spring Web, JDBC, Security, AOP 등을 사용합니다. `build.gradle`에 JUnit만 있으면 `package org.springframework.stereotype does not exist` 같은 컴파일 에러가 납니다.

강의 코드가 `javax.servlet`, `javax.mail`, `WebSecurityConfigurerAdapter`를 쓰므로 **Spring Boot 2.7.18** BOM을 사용합니다. Boot 3은 `jakarta.*`로 바뀌고 `WebSecurityConfigurerAdapter`가 제거되어 기존 예제와 맞지 않습니다. Gradle 9와 Boot 2.7 플러그인 호환 이슈를 피하려고 플러그인 대신 BOM만 넣었습니다.

주요 의존성 (`build.gradle`):

- Spring Boot 2.7.18 BOM
- `spring-boot-starter-web`, `jdbc`, `security`, `aop`, `mail`, `cache`, `webflux`
- ModelMapper 3.1.1
- Lombok 1.18.38 (Java 21)

```bash
./gradlew compileJava
```

IntelliJ에서는 Gradle 창에서 새로고침(Reload Gradle Project)을 한 뒤 에디터 에러가 사라지는지 확인하세요.

`WebSecurityConfigurerAdapter` 등 **deprecated API 경고**는 강의 코드가 예전 Spring Security API를 쓰기 때문에 나오며, 컴파일 실패는 아닙니다.

[인프런 강의](https://www.inflearn.com/course/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4/dashboard?cid=327819) (백기선 / whiteship)를 기반으로 구성한 Java 예제 저장소입니다.

GoF(Gang of Four)가 정리한 디자인 패턴 23개를 생성 / 구조 / 행동의 세 분류로 나누고, 각 패턴이 풀려는 문제, 적용 방법, 장단점, Java·Spring에서의 쓰임을 코드로 따라갑니다.

## 선수 지식

- Java 기본 문법
- 객체지향에 대한 기본 이해

## 패키지 구조

```text
src/main/java
├── d01_creational_patterns     # 생성 패턴
├── d02_structural_patterns     # 구조 패턴
└── d03_behavioral_patterns     # 행동 패턴
```

접두사 의미는 다음과 같습니다.

| 접두사 | 위치 | 의미 | 예 |
| --- | --- | --- | --- |
| `d` | 최상위 | design 분류 | `d01_creational_patterns` |
| `p` | 서브 | pattern | `p01_singleton` |
| `s` | 서브의 서브 | step | `s01_before` |

각 패턴 패키지는 강의의 before / after / Java·Spring 예제 흐름을 그대로 둡니다.

| 패키지 | 강의 단계 |
| --- | --- |
| `s01_before` | 패턴 적용 전 |
| `s02_after` | 패턴 적용 후 |
| `s03_java` | Java와 Spring에서 찾아보는 패턴 |

패키지 예:

```text
d03_behavioral_patterns.p21_strategy.s02_after
```

## 커리큘럼

강의는 소개 + 패턴 3개 섹션, 총 98강(약 11시간 37분)입니다.

### 1. 강의 소개

1. 강의 소개
2. 강사 소개
3. 강의 슬라이드
4. 강의 소스 코드

### 2. 객체 생성 관련 패턴

생성과 관련된 패턴입니다. 패키지: `d01_creational_patterns`

| 패턴 | 패키지 | 강의 |
| --- | --- | --- |
| Singleton | `p01_singleton` | 가장 단순한 구현, 멀티스레드 안전성, 깨뜨리는 방법, 안전하고 단순한 구현, Java·Spring |
| Factory Method | `p02_factory_method` | 소개, 적용, 인터페이스 적용, 장단점, Java·Spring |
| Abstract Factory | `p03_abstract_factory` | 소개, 적용, 장단점, Java·Spring |
| Builder | `p04_builder` | 소개, 적용, 장단점, Java·Spring |
| Prototype | `p05_prototype` | 소개, 적용, 장단점, Java·Spring |

### 3. 구조 관련 패턴

구조와 관련된 패턴입니다. 패키지: `d02_structural_patterns`

| 패턴 | 패키지 | 강의 |
| --- | --- | --- |
| Adapter | `p06_adapter` | 소개, 적용, 장단점, Java·Spring |
| Bridge | `p07_bridge` | 소개, 적용, 장단점, Java·Spring |
| Composite | `p08_composite` | 소개, 적용, 장단점, Java·Spring |
| Decorator | `p09_decorator` | 소개, 적용, 장단점, Java·Spring |
| Facade | `p10_facade` | 소개, 적용, 장단점, Java·Spring |
| Flyweight | `p11_flyweight` | 소개, 적용, 장단점, Java·Spring |
| Proxy | `p12_proxy` | 소개, 적용, 장단점, Java·Spring |

### 4. 행동 관련 패턴

행동과 관련된 패턴입니다. 패키지: `d03_behavioral_patterns`

| 패턴 | 패키지 |
| --- | --- |
| Chain of Responsibility | `p13_chain_of_responsibilities` |
| Command | `p14_command` |
| Interpreter | `p15_interpreter` |
| Iterator | `p16_iterator` |
| Mediator | `p17_mediator` |
| Memento | `p18_memento` |
| Observer | `p19_observer` |
| State | `p20_state` |
| Strategy | `p21_strategy` |
| Template Method | `p22_template` |
| Visitor | `p23_visitor` |

각 패턴은 소개 → 적용 → 장단점 → Java·Spring 예제 순으로 진행합니다.

## 실행

Gradle Java 프로젝트입니다.

```bash
./gradlew compileJava
```

패턴별 예제는 각 패키지의 `main` 메서드에서 실행할 수 있습니다.
