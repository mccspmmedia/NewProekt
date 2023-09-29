package Lesson14;
public class Homework2 {
    public static void main(String[] args) {
        int[] sourceArray = {0, 1, 2, 3, 4, 5, 6};
        int newLength = 3;

        int[] newArray = copyOfArray(sourceArray, newLength);

        System.out.print("{");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] copyOfArray(int[] sourceArray, int newLength) {
        int[] newArray = new int[newLength];

        for (int i = 0; i < newLength; i++) {
            if (i < sourceArray.length) {
                newArray[i] = sourceArray[i];
            } else {
                newArray[i] = 0;
            }
        }

        return newArray;
    }
}

