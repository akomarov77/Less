package lesson17;

import java.io.*;

public class Lesson17 {
    public static void main(String[] args) {
        System.out.println("Hello from Lesson 17..");

/*        try {
            ExceptionUtils.throwableExperiment("My throwable!!!!!!!!!");
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("Detail message: " + t.getMessage());
            throw new Exception(t);
        }*/
       /* try {
            ExceptionUtils.runtimeExceptionExperiment("My run time!!!!!!!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }*/

/*        int i = 2;

        try {
            if (i == 1) {
                ExceptionUtils.exceptionExperiment("From Exception");
            } else {
                ExceptionUtils.myExceptionExperiment();
            }
            return;
        }
        catch (MyException e) {
            e.printStackTrace();
            return;
        }
        catch (Exception e) {
            e.printStackTrace();
            return;
        }
        catch (Throwable e) {
            e.printStackTrace();
            return;
        }
        finally {
            System.out.println("Hello from finally!!!");
        }*/

        /*BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("c://t.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert email ...");
        } finally {
            try {
                if(reader!= null){
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("send alert email ...");
            }

        }*/

        try (
                Closeable myResource = () -> System.out.println("Hello from Closable!!!");
                BufferedReader reader = new BufferedReader(new FileReader("c://t.txt"));
        ) {
            String line = reader.readLine();
            System.out.println("Logic after file is read");
            System.out.println(myResource);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert email ...");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("send alert email ...");
        }

        System.out.println("Hello from Lesson ..17");
    }
}
