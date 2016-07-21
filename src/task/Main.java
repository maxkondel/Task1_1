package task;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main (String[] args) throws InvocationTargetException, IllegalAccessException {

        Class<?> cls = SomeClaas.class;

        Method[] methods = cls.getDeclaredMethods();

        for (Method meth:methods){
            if (meth.isAnnotationPresent(SomeAnotation.class)){
                SomeAnotation someAnotation = meth.getAnnotation(SomeAnotation.class);
                int res = (Integer) meth.invoke(null,someAnotation.a(),someAnotation.b());
                System.out.println(res);
            }
        }


    }
}
