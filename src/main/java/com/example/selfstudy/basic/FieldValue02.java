package com.example.selfstudy.basic;

public class FieldValue02 {
    int a; //전역변수
    String str; //전역변수
    public FieldValue02(){ //생성자
        str = "전역변수"; // 값을 할당해준 이유는 0으로 초기화 되는 것을 막기위해서이다.
    }
    public void print(){
        int b = 0; //지역변수 선언 지역변수인 이유는 메소드 내부에서만 할당하기 때문이다. 메소드가 끝나면 메모리에서 사라짐

        System.out.println(a);
        System.out.println(b); // 컴파일에러?

        String str = "지역변수"; // 지역변수 선언

        System.out.println(str); // 출력 : 지역변수
        System.out.println(this.str); // 출력 전역변수 왜 this로 접근을 했을까?

    }

    // 지역변수는 초기값을 자동으로 할당되지 않는다.
    // 메소드 내에서 전역변수와 동일한 타입 및 이름의 변수를 정의하면 지역변수가 우선순위가 높다



}
