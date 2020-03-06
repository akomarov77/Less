package lesson18;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyLogProcessor {
    public static void process(Object target) {
        Method[] declaredMethods = target.getClass().getDeclaredMethods();
        for (Method m: declaredMethods) {
            m.setAccessible(true);
            process(m, target);
        }

/*        Arrays.asList(declaredMethods).stream()
                .peek(dm -> dm.setAccessible(true))
                .forEach(dm -> process(dm, target));*/
    }

    public static void process(Method method, Object target) {
        try {
            if (method.isAnnotationPresent(MyLog.class)) {
                System.out.println(method.getName() + " stared ...");
                method.invoke(target);
                System.out.println(method.getName() + " ... completed!");
                return;
            }
            method.invoke(target);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
