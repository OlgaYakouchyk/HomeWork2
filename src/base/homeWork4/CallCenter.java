package base.homeWork4;

import java.util.concurrent.Semaphore;

public class CallCenter {

    private static final boolean[] OPERATORS_NUMBERS = new boolean[2];

    private static final Semaphore SEMAPHORE = new Semaphore(2, true);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Call center start work");
        for (int i = 1; i <=3; i++) {
            new Thread(new Users(i)).start();
            Thread.sleep(400);
        }
    }

    public static class Users implements Runnable {
        private int users ;

        public Users(int users) {
            this.users =users;
        }

        @Override
        public void run() {

            try {
                SEMAPHORE.acquire();

                int operatorNumber = 1;

                synchronized (OPERATORS_NUMBERS){
                    for (int i = 0; i <2; i++)
                        if (!OPERATORS_NUMBERS[i]) {
                            OPERATORS_NUMBERS[i] = true;
                            operatorNumber = i;
                            System.out.printf("Operator %d start working \n", operatorNumber+1);
                            break;
                        }
                }

                Thread.sleep(3000);

                synchronized (OPERATORS_NUMBERS) {
                    OPERATORS_NUMBERS[operatorNumber] = false;
                    System.out.println("Operator" +(operatorNumber +1) + " talked  with user"+ users++);

                    if (users==3);
                }


                SEMAPHORE.release();
               System.out.printf("Operator %d  finish talking \n", operatorNumber+1);
            } catch (InterruptedException e) {
            }

        }
    }
}
