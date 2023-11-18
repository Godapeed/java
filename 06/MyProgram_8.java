import java.lang.reflect.*;

public class MyProgram_8 {
    public static void printClassInfo(Class<?> cl) {
        // Имя класса
        System.out.println("Имя класса: " + cl.getName());

        // Публичные поля
        System.out.println("Публичные поля:");
        Field[] fields = cl.getFields();
        for (Field field : fields) {
            System.out.println("- " + field.getName() + " (" + field.getType().getName() + ")");
        }

        // Все поля
        System.out.println("Все поля:");
        Field[] declaredFields = cl.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("- " + field.getName() + " (" + field.getType().getName() + ")");
        }

        // Публичные методы
        System.out.println("Публичные методы:");
        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.print("- " + method.getName() + "(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                System.out.print(parameterTypes[i].getName());
                if (i < parameterTypes.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }

        // Конструкторы
        System.out.println("Конструкторы:");
        Constructor<?>[] constructors = cl.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.print("- " + constructor.getName() + "(");
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                System.out.print(parameterTypes[i].getName());
                if (i < parameterTypes.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
    }

    public static void main(String[] args) {
        // Пример использования
        printClassInfo(String.class);
        System.out.println("------------------------");
        printClassInfo(Integer.class);
    }
}
