public class Triple<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public T min() {
        if (first.compareTo(second) <= 0 && first.compareTo(third) <= 0) {
            return first;
        } else if (second.compareTo(first) <= 0 && second.compareTo(third) <= 0) {
            return second;
        } else {
            return third;
        }
    }

    public T max() {
        if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
            return first;
        } else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
            return second;
        } else {
            return third;
        }
    }

    public Double mean() {
        // Предполагая, что тип T поддерживает арифметические операции
        try {
            return ((Double) ((toDouble(first) + toDouble(second) + toDouble(third)) / 3));
        } catch (UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Неподдерживаемый тип " + first.getClass().getSimpleName());
        }
    }

    private double toDouble(T value) {
        return Double.parseDouble(value.toString());
    }

    public String toString() {
        return "{" + this.getFirst().toString() + ", " + this.getSecond().toString() + ", " + this.getThird().toString() + "}";
    }
}