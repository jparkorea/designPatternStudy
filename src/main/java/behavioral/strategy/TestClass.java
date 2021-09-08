package behavioral.strategy;

public class TestClass implements TestInterface {

    private static final String test = "test";

    @Override
    public void testMethod() {
        System.out.println(test);
    }
}
