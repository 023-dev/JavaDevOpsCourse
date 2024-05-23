package com.kosta.exam04;

public class Student {
    private String name;
    private String addr;
    private String nmbr;

    public Student(String name, String addr, String nmbr) {
        this.name = name;
        this.addr = addr;
        this.nmbr = nmbr;
    }

    public Student(){}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", nmbr='" + nmbr + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getNmbr() {
        return nmbr;
    }

    public void setNmbr(String nmbr) {
        this.nmbr = nmbr;
    }
}
