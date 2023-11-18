public class MyProgram_7 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);

        System.out.println("До обмена:");
        System.out.println("obj1.value = " + obj1.getValue()); // Выводит 10
        System.out.println("obj2.value = " + obj2.getValue()); // Выводит 20

        obj1.swapValues(obj2);

        System.out.println("После обмена:");
        System.out.println("obj1.value = " + obj1.getValue()); // Выводит 20
        System.out.println("obj2.value = " + obj2.getValue()); // Выводит 10
    }
}
