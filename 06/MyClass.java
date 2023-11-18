public class MyClass {
    int value;

    public MyClass(int value) {
        this.value = value;
    }

    public MyClass() {
        this.value = 0;
    }

    public void swapValues(MyClass obj) {
        int temp = this.value;
        this.value = obj.value;
        obj.value = temp;
    }

    public int getValue() {
        return this.value;
    }
}
