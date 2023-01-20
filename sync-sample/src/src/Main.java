import AddOneImplementsClasses.*;
import Data.NumberTableClass;
import Enums.ETestClassType;
import TestManager.ClassTester;

public class Main {

    public static final int START_NUMBER = 1;

    public static void main(String[] args) {
        startTest();
    }

    public static void startTest() {
        NumberTableClass numberTable = new NumberTableClass(START_NUMBER);
        ClassTester classTester = getClassTester(ETestClassType.ENORMAL);

        classTester.startMultiThread(numberTable);

        System.out.println(numberTable.getNumber());
    }

    private static ClassTester getClassTester(ETestClassType eTestClassType){
        switch (eTestClassType){
            case ENORMAL:
                return new ClassTester(new NormalClass());
            case ESTATIC_SYNCHRONIZED_BLOCK:
                return new ClassTester(new StaticSynchronizedBlockClass());
            case ESTATIC_SYNCHRONIZED_METHOD:
                return new ClassTester(new StaticSynchronizedMethodClass());
            case ESYNCHRONIZED_METHOD:
                return new ClassTester(new SynchronizedMethodClass());
            case ESYNCHRONIZED_BLOCK:
                return new ClassTester(new SynchronizedBlockClass());
            default:
                return new ClassTester(new NormalClass());
        }
    }

}