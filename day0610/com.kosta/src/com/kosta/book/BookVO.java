package com.kosta.book;

public class BookVO {
    int bookid;
    String bookname;
    int price;
    String publisher;

    public BookVO(int bookid, String bookname, int price, String publisher) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.price = price;
        this.publisher = publisher;
    }
    public BookVO() {}

    @Override
    public String toString() {
        return "PublisherVO{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", price=" + price +
                ", book='" + publisher + '\'' +
                '}';
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
