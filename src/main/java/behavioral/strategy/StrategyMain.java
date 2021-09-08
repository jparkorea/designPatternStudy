package behavioral.strategy;

/**
 * 전략 패턴이란
 * 여러 알고리즘을 하나의 추상적인 접근점(Interface)을 만들어
 * 접근점에서 서로 교환 가능하도록 하는 패턴
 */
public class StrategyMain {
    public static void main(String[] args) {
        /*TestInterface testInterface = new TestClass();
        testInterface.testMethod();*/

        TestObj testObj = new TestObj();
        testObj.testFunc();
    }
}
