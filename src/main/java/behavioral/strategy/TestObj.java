package behavioral.strategy;

public class TestObj {

    private TestInterface testInterface = new TestClass();
    public void testFunc(){
        testInterface.testMethod();
        testInterface.testMethod();
    }
}
