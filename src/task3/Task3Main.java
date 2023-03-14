package task3;

import java.util.LinkedList;
import java.util.Scanner;

public class Task3Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть кількість чисел у вашому списку");
        int n = in.nextInt();
        LinkedList<Integer> list = getIntegerList(n);
        System.out.println(getMinimum(list)  + " - мінімальне число серед елементів списку");

    }

    public static LinkedList<Integer> getIntegerList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Введіть числа через Enter");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            linkedList.add(in.nextInt());
        }
        return linkedList;
    }

    /**
     * Get min number.
     * @param linkedList input list
     * @return min number from a list.
     * @throws IllegalStateException if input list is empty
     */
    public static int getMinimum(LinkedList<Integer> linkedList) {
        if (linkedList.isEmpty()) {
            throw new IllegalStateException("List cannot be empty");
        }
        /*return linkedList.stream()
                .min(Integer::compare)
                .orElseThrow(() -> new IllegalStateException("List cannot be empty"));*/
        int min = linkedList.get(0);
        for (Integer o : linkedList) {
            if (o <= min) {
                min = o;
            }
        }
        return min;
    }
}
