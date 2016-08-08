package com.baobaotao.basic;

/**
 * Created by Du on 16/7/2.
 */
public class SequenceNumber {

    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
        public Integer initialValue() {
            return 0;
        }
    };

    public int getNextNum() {
        seqNum.set(seqNum.get() + 1);
        return seqNum.get();
    }

    public static void main(String[] args) {
        SequenceNumber sn = new SequenceNumber();

        TestClient t1 = new TestClient(sn);

        TestClient t2 = new TestClient(sn);

        TestClient t3 = new TestClient(sn);

        t1.start();
        t2.start();
        t3.start();
    }
    private static class TestClient extends Thread {
        private SequenceNumber sn;

        public TestClient(SequenceNumber sn) {
            this.sn = sn;
        }
    }
}
