package com.kosta.exam04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        int choice;
        while (true) {
            menu();
            choice = sc.nextInt();
            if (choice > 3 || choice < 1) {
                break;
            }
            switch (choice) {
                case 1:
                    insert(students);
                    break;
                case 2:
                    search(students);
                    break;
                case 3:
                    delete(students);
                    break;
            }
            System.out.println(choice);
        }
        System.out.println("프로그램 종료");
    }
    public static void menu(){
        System.out.println("1.추가\t2.검색\t3.삭제\t0.종료");
        System.out.print("메뉴를 선택하세요. : ");
    }
    public static void insert(ArrayList<Student> students){
        Student student = new Student();
        System.out.println("***\t학생 정보 추가\t***");
        System.out.print("추가할 학생의 이름을 입력하세요. : ");
        student.setName(sc.next());
        System.out.print("추가할 학생의 주소를 입력하세요. : ");
        student.setAddr(sc.next());
        System.out.print("추가할 학생의 전화번호를 입력하세요. : ");
        student.setNmbr(sc.next());
        students.add(student);
        System.out.println("***\t학생의 정보를 추가했습니다.\t***");
        System.out.println("============================================");
  }
    public static void search(ArrayList<Student> students){
        System.out.println("***\t학생 정보 검색\t***");
        System.out.print("검색할 학생의 전화번호를 입력하세요. : ");
        String nmbr = sc.next();
        boolean flag = false;
        for (Student student : students){
            if (student.getNmbr().equals(nmbr)){
                System.out.println(student);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("해당 정보의 학생이 없습니다.");
        }
    }
    public static void delete(ArrayList<Student> students){
        System.out.println("***\t학생 정보 삭제\t***");
        System.out.print("검색할 학생의 전화번호를 입력하세요. : ");
        String nmbr = sc.next();
        int i, cnt = students.size();
        for (i = 0; i < cnt; i++){
            if(students.get(i).equals(nmbr)){
                students.remove(i);
                System.out.println("해당 학생의 정보를 삭제했습니다.");
                break;
            }
        }
        if(i==cnt){
            System.out.println("해당 정보의 학생이 없습니다.");
        }
    }

}
