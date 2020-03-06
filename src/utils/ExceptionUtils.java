package utils;

import lesson17.MyException;

public class ExceptionUtils {
    public static void throwableExperiment(String message) throws Throwable {
        Throwable throwable = new Throwable(message);
        throw throwable;
    }

    public static void errorExperiment(String message) {
        Error error = new Error(message);
        throw error;
    }

    public static void exceptionExperiment(String message) throws Exception {
        Exception exception = new Exception(message);
        throw exception;
    }
    public static void myExceptionExperiment() throws MyException {
        MyException exception = new MyException();
        throw exception;
    }

    public static void runtimeExceptionExperiment(String message) {
        RuntimeException runtimeException = new RuntimeException(message);
        throw runtimeException;
    }
}
