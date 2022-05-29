package br.com.marco.tarefaebac;

import java.lang.reflect.Method;

public class Prints {

    public static void main(String args[]) {

    executeLeitutaAnotacao();
}

    private static void executeLeitutaAnotacao() {

        Method[] methods = TestClass.class.getMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(TestAnnotation.class)) {
                TestAnnotation ta = m.getAnnotation(TestAnnotation.class);
                System.out.println(ta.testText());
            }
        }
    }
    }
