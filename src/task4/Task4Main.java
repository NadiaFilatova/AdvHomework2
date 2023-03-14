package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

////Програма визначає, яка сім'я (прізвище) живе у місті:
// Приклад введення: //· Москва · Іванови //· Київ  Петрови //· Лондон · Абрамовичі
// Приклад введення: //· Лондон
//// Приклад виведення://· Абрамовичі
public class Task4Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();

        while (true) {
            System.out.print("Місто: ");
            String city = reader.readLine();
            if (shouldExit(city)) {
                break;
            }

            System.out.print("Прiзвище: ");
            String surname = reader.readLine();
            if (shouldExit(surname)) {
                break;
            }

            map.put(city, surname);
            System.out.println("Для закінчення операції введіть Exit, або продовжуйте заповнювати далі");
        }

        System.out.print("Введіть місто по якому потрібно дізнатися прізвище:");
        String cityKeyboard = reader.readLine();

        String result = map.get(cityKeyboard);
        if (result == null) {
            System.out.println("not found");
        } else {
            System.out.println(result + " -  сім'я (носій прізвища) живе у місті");
        }
    }

    private static boolean shouldExit(String input) {
        return input == null || input.trim().length() == 0 || input.equalsIgnoreCase("exit");
    }
}