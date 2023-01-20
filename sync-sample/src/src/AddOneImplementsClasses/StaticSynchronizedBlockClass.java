package AddOneImplementsClasses;

import AddOneAbstractClasses.AddOneStaticTestBase;
import Data.NumberTableClass;

public class StaticSynchronizedBlockClass extends AddOneStaticTestBase {
    public static void Do(NumberTableClass numberTable){
        synchronized (StaticSynchronizedBlockClass.class){
            AddOne(numberTable);
        }
    }
}
