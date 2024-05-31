package com.kosta.exam08;

public class Producer extends Thread{
    private Product product;
    //생성 시에 초기화하고 소비자와 공유되는 자원
    public Producer(Product product) {
        this.product = product;
    }
    //생산자 쓰레드가 해야 할 일을 run을 오버라이딩 하여 써 줍니다.
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                product.makeNumber();
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
