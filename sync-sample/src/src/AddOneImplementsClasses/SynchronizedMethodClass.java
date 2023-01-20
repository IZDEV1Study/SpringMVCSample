package AddOneImplementsClasses;

import AddOneAbstractClasses.AddOneTestBase;
import Data.NumberTableClass;

public class SynchronizedMethodClass extends AddOneTestBase {
    public synchronized void Do(NumberTableClass numberTable){
        AddOne(numberTable);
    }
}
