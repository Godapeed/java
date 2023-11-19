public class MyProhram_10 {
    public static void main(String[] args) {
        Triple<Integer> triple = new Triple<>(5, 10, 3);
        System.out.println("First: " + triple.getFirst());
        System.out.println("Second: " + triple.getSecond());
        System.out.println("Third: " + triple.getThird());
        System.out.println("Min: " + triple.min());
        System.out.println("Max: " + triple.max());
        System.out.println("Mean: " + triple.mean());
        System.out.println(triple.toString());
        Triple<String> triple1 = new Triple<>("9","3","4");
        System.out.println("First: " + triple1.getFirst());
        System.out.println("Second: " + triple1.getSecond());
        System.out.println("Third: " + triple1.getThird());
        System.out.println("Min: " + triple1.min());
        System.out.println("Max: " + triple1.max());
        System.out.println("Mean: " + triple1.mean());
    }
}
