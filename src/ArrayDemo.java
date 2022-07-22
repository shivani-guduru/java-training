public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Julia"};

        System.out.printf("%s names in array\n", names.length);

        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%s] = %s\n", i, names[i]);
        }
    }
}
