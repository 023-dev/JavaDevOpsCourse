package com.kosta.exam03;

import java.util.ArrayList;

class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println("hello, " + name);
    }
}
/*
    ArrayList list = new ArrayList()
    와 같이 리스트를 생서하면 리스트에 온갖 자료형을 담을 수 있어요.
    처음에는 이것이 좋은 줄로만 알았는데 컬렉션을 경험해보니 결코 좋은 것이 아니다
    라는 것을 느끼게 됩니다. 만약 리스트에 Person 도 담고 Shape 도 담고
    또, Employee 도 담고.. 등등
    이렇게 되었을 때 리스트에 담긴 데이터의 수만큼 반복하여 결국엔
    그 요소에 따라 일처리를 시켜야 하는데 각각 자료형이 다르면 일일이 instanceof 연산자로
    물어보고 type casting 한 후에 해당 클래스에 메소드를 호출해야 하는 것은
    상당히 번거로운 작업이다.
    가능하면 Object 보다는 내가 만든 클래스의 상속관계에 범위를 제한하도록 권장합니다.
    즉, 리스트에 담긴 자료형을 제한 하도록 합니다.
    이것을 "제네릭"이라고 합니다.
    ArrayList<Person> list = new ArrayList<Person>();
    이것을 하여 Person 만 담는 List 로 만들 수 있습니다.

    만약 Person의 후손이 있다면 담을 수 있어요.
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("홍길동", 20));
        list.add(new Person("이순신", 30));
        list.add(new Person("강감찬", 40));
        for (Person person : list){
            person.sayHello();
        }
    }
}
