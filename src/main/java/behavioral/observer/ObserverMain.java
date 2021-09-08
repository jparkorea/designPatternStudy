package behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        Observer ryan = new Observer() {
            @Override
            public void update() {
                System.out.println("subscribing");
            }
        };

        Observer muji = new Observer() {
            @Override
            public void update() {
                System.out.println("I'm muji");
            }
        };

        testClass.subscribe(ryan);
        testClass.subscribe(muji);

        testClass.release();

        testClass.email();
    }
}
