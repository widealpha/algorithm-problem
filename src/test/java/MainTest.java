import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.security.Security;

public class MainTest {
    static {
        MyClassLoader classLoader = new MyClassLoader("D:\\Project\\Java\\algorithm\\target\\test-classes\\");
        try {
            Class clazz = classLoader.findClass("ABC");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        MyClassLoader classLoader = new MyClassLoader("D:\\Project\\Java\\algorithm\\target\\test-classes\\");
        Thread.currentThread().setContextClassLoader(classLoader);
        Class clazz = classLoader.findClass("ABC");
        System.out.println((clazz.getDeclaredConstructor().newInstance()));

//        ABC a = (ABC) (clazz.getDeclaredConstructor().newInstance());
//        ABC a = null;
//        System.out.println(clazz);
        System.out.println(clazz.getDeclaredConstructor().newInstance() instanceof ABC);

//        a = new ABC();
//        System.out.println(a);
//
//        MyClassLoader1 classLoader1 = new MyClassLoader1("D:\\Project\\Java\\algorithm\\target\\");
//        Class clazz1 = classLoader1.findClass("ABC");
//        a = (ABC) clazz1.getDeclaredConstructor().newInstance();
//        System.out.println(a);
    }
}


class MyClassLoader extends ClassLoader {
    private String path;

    public MyClassLoader(String path) {
        this.path = path;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("custom loader");
        String classPath = path + name + ".class";
        InputStream inputStream = null;
        ByteArrayOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(classPath);
            outputStream = new ByteArrayOutputStream();
            int temp = 0;
            while ((temp = inputStream.read()) != -1) {
                outputStream.write(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        byte[] bytes = outputStream.toByteArray();
        return defineClass(name, bytes, 0, bytes.length);
    }
}

class MyClassLoader1 extends ClassLoader {
    private String path;

    public MyClassLoader1(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("custom loader1");
        String classPath = path + name + ".class";
        InputStream inputStream = null;
        ByteArrayOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(classPath);
            outputStream = new ByteArrayOutputStream();
            int temp = 0;
            while ((temp = inputStream.read()) != -1) {
                outputStream.write(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        byte[] bytes = outputStream.toByteArray();
        return defineClass(name, bytes, 0, bytes.length);
    }
}