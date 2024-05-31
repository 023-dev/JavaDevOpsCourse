package com.kosta.exam08;

public class Consumer extends Thread{
    //생산자와 상관ㅇ벗이 계속하여 제품을 소비하도록
    //하기 위해 멀티쓰레드가 되게 한다.
    //생산자와 제품을 공유하기 위해 제품을 멤버변수로 선언
    private Product product;
    //생성 시에 초기화하고 소비자와 공유되는 자원
    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            product.useNumber();
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
