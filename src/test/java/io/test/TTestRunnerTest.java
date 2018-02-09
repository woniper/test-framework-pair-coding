package io.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * @author woniper
 */
public class TTestRunnerTest {

    TTestRunner runner;
    @Before
    public void setUp() throws Exception {
        runner = new TTestRunner();
    }

    @Test
    public void 테스트_대상_class_type을_입력() {

        // when
        boolean isTestClass = runner.isTestClass(TTestDummy.class);

        // then
        assertEquals(isTestClass, true);
    }

    @Test
    public void 테스트_대상이_아닌_class_type을_입력() {

        // when
        boolean isTestClass = runner.isTestClass(NotTestClass.class);

        // then
        assertEquals(isTestClass, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void class_type이_null이다() {

        // when
        boolean isTestClass = runner.isTestClass(null);

        // then
        fail();
    }

    @Test
    public void 테스트_대상_클래스에_TBefore가_있는지_확인() {

        // when
        boolean hasTBefore = runner.hasTBefore(TTestDummy.class);

        // then
        assertEquals(hasTBefore, true);
    }

    @Test
    public void 테스트_대상_클래스에_TAfter가_있는지_확인() {

        // when
        boolean hasTAfter = runner.hasTAfter(TTestDummy.class);

        // then
        assertEquals(hasTAfter, true);
    }
}
