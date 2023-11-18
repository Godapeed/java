import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyProhram_9 {
    public static void main(String[] args) {
        try {
            // Получение класса по имени
            Class<?> clazz = Class.forName("MyClass");

            // Получение конструктора с аргументами
            Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);

            // Создание экземпляра класса
            Object instance = constructor.newInstance(3);

            // Получение метода по имени
            Method method = clazz.getMethod("getValue");

            // Вызов метода на экземпляре объекта
            System.out.println(method.invoke(instance));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
