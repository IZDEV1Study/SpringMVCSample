package AddOneImplementsClasses;

import AddOneAbstractClasses.AddOneStaticTestBase;
import Data.NumberTableClass;

public class StaticSynchronizedMethodClass extends AddOneStaticTestBase {
    public static synchronized void Do(NumberTableClass numberTable){
        AddOne(numberTable);
    }
}
