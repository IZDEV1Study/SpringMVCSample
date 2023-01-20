package AddOneImplementsClasses;

import AddOneAbstractClasses.AddOneTestBase;
import Data.NumberTableClass;

public class SynchronizedBlockClass extends AddOneTestBase {
    public void Do(NumberTableClass numberTable){
        synchronized (this){
            AddOne(numberTable);
        }
    }
}
