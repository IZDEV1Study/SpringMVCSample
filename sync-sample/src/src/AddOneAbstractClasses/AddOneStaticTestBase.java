package AddOneAbstractClasses;

import Data.NumberTableClass;

public abstract class AddOneStaticTestBase {
    public static void AddOne(NumberTableClass numberTable){
        int currentNumber = numberTable.getNumber();

        WaitOneSec();

        numberTable.setNumber(currentNumber + 1);
    }

    private static void WaitOneSec() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
