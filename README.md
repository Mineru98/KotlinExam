# Android 공부 순서 with Kotlin

- Android LifeCycle
- Activity
- ListView
- RecyclerView
- Fragment
- Dialog
- Design Pattern



[Realm-Java-MVVM](https://academy.realm.io/kr/posts/android-architecture-components-and-realm/)

[AndroidKotlinBlog](https://blog.yena.io/studynote/2017/12/06/Android-Kotlin-RecyclerView1.html)



## 용어 정리

DAO(Data Access Object) : DB에 직접 접근하는 객체를 의미한다. 효율적인 커넥션 관리와 보안성 때문에 사용한다. DAO는 저수준의 로직과 고급 비지니스 로직을 분리하고, **도메인 로직으로부터 지속성 메커니즘을 숨기기 위해 사용한다.** 

DTO(Data Transfer Object) : VO(Value Object)로 바꿔 말할 수 있는데 계층간 데이터 교환을 위한 자바 컴포넌트를 말한다. 계층간의 Controller, View, Business Layer, Persistence는 각 계층간 데이터 교환을 위한 객체를 DTO 또는 VO라고 부른다.

