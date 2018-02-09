package io.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author woniper
 */
public class TTestRunner {

    void run(Class<?> clazz) {

    }

    public boolean isTestClass(Class<?> testClass) {
        if(testClass == null) {
            throw new IllegalArgumentException();
        }

        return hasAnnotation(testClass, TTest.class);
    }

    public boolean hasTBefore(Class<?> testClass) {

        return hasAnnotation(testClass, TBefore.class);
    }

    public boolean hasTAfter(Class<?> testClass) {
        return hasAnnotation(testClass, TAfter.class);
    }

    private boolean hasAnnotation(Class<?> testClass, Class<? extends Annotation> annotationClass) {
        for (Method method : testClass.getMethods()) {
            if(method.getAnnotation(annotationClass) != null)
                return true;
        }
        return false;
    }

}
