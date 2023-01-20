
public class testSync {
    public static final int START_NUMBER = 1;
    public static final int EXPECTED_RESULT = 3;

    NumberTableClass numberTable;

    public void setUp() throws Exception {
        super.setUp();
        numberTable = new NumberTableClass(START_NUMBER);
    }

    @Test
    public void testNormalClass() {
        ClassTester classTester = getClassTester(ETestClassType.ENORMAL);

        classTester.startMultiThread(numberTable);

        assertEquals(EXPECTED_RESULT, numberTable.getNumber());
    }

    public void testStaticSynchronizedBlockClass() {
        ClassTester classTester = getClassTester(ETestClassType.ESTATIC_SYNCHRONIZED_BLOCK);

        classTester.startMultiThread(numberTable);

        assertEquals(EXPECTED_RESULT, numberTable.getNumber());
    }

    public void testStaticSynchronizedMethodClass() {
        ClassTester classTester = getClassTester(ETestClassType.ESTATIC_SYNCHRONIZED_METHOD);

        classTester.startMultiThread(numberTable);

        assertEquals(EXPECTED_RESULT, numberTable.getNumber());
    }

    public void testSynchronizedBlockClass() {
        ClassTester classTester = getClassTester(ETestClassType.ESYNCHRONIZED_BLOCK);

        classTester.startMultiThread(numberTable);

        assertEquals(EXPECTED_RESULT, numberTable.getNumber());
    }

    public void testSynchronizedMethodClass() {
        ClassTester classTester = getClassTester(ETestClassType.ESYNCHRONIZED_METHOD);

        classTester.startMultiThread(numberTable);

        assertEquals(EXPECTED_RESULT, numberTable.getNumber());
    }


    public void tearDown() throws Exception {
    }

    private static ClassTester getClassTester(ETestClassType eTestClassType) {
        switch (eTestClassType) {
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
    ackage TestManager;

        import AddOneImplementsClasses.*;
                import Data.NumberTableClass;
                import Enums.ETestClassType;
                import junit.framework.TestCase;

                import javax.accessibility.AccessibleStateSet;

public class ClassTesterTest {

    public static final int START_NUMBER = 1;
    public static final int EXPECTED_RESULT = 3;

    NumberTableClass numberTable;

    public void setUp() throws Exception {
        super.setUp();
        numberTable = new NumberTableClass(START_NUMBER);
    }

    @Test
    public void testNormalClass() {
        ClassTester classTester = getClassTester(ETestClassType.ENORMAL);

        classTester.startMultiThread(numberTable);

        assertEquals(EXPECTED_RESULT, numberTable.getNumber());
    }

    public void testStaticSynchronizedBlockClass() {
        ClassTester classTester = getClassTester(ETestClassType.ESTATIC_SYNCHRONIZED_BLOCK);

        classTester.startMultiThread(numberTable);

        assertEquals(EXPECTED_RESULT, numberTable.getNumber());
    }

    public void testStaticSynchronizedMethodClass() {
        ClassTester classTester = getClassTester(ETestClassType.ESTATIC_SYNCHRONIZED_METHOD);

        classTester.startMultiThread(numberTable);

        assertEquals(EXPECTED_RESULT, numberTable.getNumber());
    }

    public void testSynchronizedBlockClass() {
        ClassTester classTester = getClassTester(ETestClassType.ESYNCHRONIZED_BLOCK);

        classTester.startMultiThread(numberTable);

        assertEquals(EXPECTED_RESULT, numberTable.getNumber());
    }

    public void testSynchronizedMethodClass() {
        ClassTester classTester = getClassTester(ETestClassType.ESYNCHRONIZED_METHOD);

        classTester.startMultiThread(numberTable);

        assertEquals(EXPECTED_RESULT, numberTable.getNumber());
    }


    public void tearDown() throws Exception {
    }

    private static ClassTester getClassTester(ETestClassType eTestClassType) {
        switch (eTestClassType) {
            case ENORMAL:
                return new ClassTester(new NormalClass());
            case ESTATIC_SYNCHRONIZED_BLOCK:
                return new ClassTester(new StaticSynchronizedBlockClass());
            case ESTATIC_SYNCHRONIZED_METHOD:
                return new ClassTester(new StaticSynchronizedMethodClass());
            case ESYNCHRONIZED_METHOD:
                return new ClassTester(new SynchronizedMethodClass(package TestManager;

import AddOneImplementsClasses. *;
import Data.NumberTableClass;
import Enums.ETestClassType;
import junit.framework.TestCase;

import javax.accessibility.AccessibleStateSet;

            public class ClassTesterTest {

                public static final int START_NUMBER = 1;
                public static final int EXPECTED_RESULT = 3;

                NumberTableClass numberTable;

                public void setUp() throws Exception {
                    super.setUp();
                    numberTable = new NumberTableClass(START_NUMBER);
                }

                @Test
                public void testNormalClass() {
                    ClassTester classTester = getClassTester(ETestClassType.ENORMAL);

                    classTester.startMultiThread(numberTable);

                    assertEquals(EXPECTED_RESULT, numberTable.getNumber());
                }

                public void testStaticSynchronizedBlockClass() {
                    ClassTester classTester = getClassTester(ETestClassType.ESTATIC_SYNCHRONIZED_BLOCK);

                    classTester.startMultiThread(numberTable);

                    assertEquals(EXPECTED_RESULT, numberTable.getNumber());
                }

                public void testStaticSynchronizedMethodClass() {
                    ClassTester classTester = getClassTester(ETestClassType.ESTATIC_SYNCHRONIZED_METHOD);

                    classTester.startMultiThread(numberTable);

                    assertEquals(EXPECTED_RESULT, numberTable.getNumber());
                }

                public void testSynchronizedBlockClass() {
                    ClassTester classTester = getClassTester(ETestClassType.ESYNCHRONIZED_BLOCK);

                    classTester.startMultiThread(numberTable);

                    assertEquals(EXPECTED_RESULT, numberTable.getNumber());
                }

                public void testSynchronizedMethodClass() {
                    ClassTester classTester = getClassTester(ETestClassType.ESYNCHRONIZED_METHOD);

                    classTester.startMultiThread(numberTable);

                    assertEquals(EXPECTED_RESULT, numberTable.getNumber());
                }


                public void tearDown() throws Exception {
                }

                private static ClassTester getClassTester(ETestClassType eTestClassType) {
                    switch (eTestClassType) {
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
            }));
            case ESYNCHRONIZED_BLOCK:
                return new ClassTester(new SynchronizedBlockClass());
            default:
                return new ClassTester(new NormalClass());
        }
    }
}
