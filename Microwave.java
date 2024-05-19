package com.java.microwave;

public class Microwave {
    //메뉴: 예열, 해동, 조리 등 다양한 미리 설정된 조리 프로그램h
    //버튼: 문 열기/닫기, 시작, 중지, 취소 등의 버튼 상태
    //현재 상태: 대기, 조리, 중지 등 현재 전자레인지의 작동 상태
    private int capacity;
    private int output;
    private int timer;

    public Microwave(int capacity, int output, int timer) {
        this.capacity = capacity;
        this.output = output;
        this.timer = timer;
    }

    public Microwave() {
        this(32,1000,0);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public static void push() {
        timmer += 30;
    }

    public static 
}
