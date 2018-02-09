package io.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * @author woniper
 */
public class InputClassTypeTest {

    @Test
    public void 테스트_대상_class_type을_입력() {
        // given
        TTestRunner runner = new TTestRunner();

        // when
        boolean isTestClass = runner.isTestClass(TTestDummy.class);

        // then
        assertEquals(isTestClass, true);
    }

    @Test
    public void 테스트_대상이_아닌_class_type을_입력() {
        // given
        TTestRunner runner = new TTestRunner();

        // when
        boolean isTestClass = runner.isTestClass(NotTestClass.class);

        // then
        assertEquals(isTestClass, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void class_type이_null이다() {
        // given
        TTestRunner runner = new TTestRunner();

        // when
        boolean isTestClass = runner.isTestClass(null);

        // then
        fail();
    }
}
