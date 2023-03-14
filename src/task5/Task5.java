package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
//1. Створити перелік рядків.
//2. Ввести рядки з клавіатури та додати їх до списку.
//3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
//4. Вивести рядки на екран, кожен з нового рядка.
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int counter = 1;
        System.out.println("Вводьте з клавіатури рядки. По закінченню введіть end");
        while (true) {
            System.out.print(counter + ": ");
            String s = reader.readLine();
            if (!s.equalsIgnoreCase("end")) {
                list.add(s);
            } else {
                break;
            }
            counter++;
        }
        System.out.println("Ваші рядки:");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println((i + 1) + ": " + s);
        }
    }
}
