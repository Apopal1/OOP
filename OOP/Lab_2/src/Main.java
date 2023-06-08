public class Main {
    public static void main(String[] args) {

        String[] fruit = {"apple", "orange", "pear", "berry"};

        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);
        }
        String search="apple";
        boolean found = false;
        for (int i = 0; i < fruit.length; i++) {

            if (fruit[i].equals(search)) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Found apple in the array");
        } else
            System.out.println("Didn't found apple in the array");


    }}
