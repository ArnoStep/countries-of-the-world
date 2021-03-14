import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (Country c : Country.values()) {
            System.out.println(c);
        }
        System.out.print("Введите страну для поиска: ");
        String string = scanner.nextLine();
        try {
            System.out.print(Country.valueOf(string));
            if (Country.valueOf(string).getOpen()) {
                System.out.println("открыта для посещения. " + '\n');
            } else {
                System.out.println("закрыта для посещения. " + '\n');
            }
            return;
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Наименование страны на английском введено некорректно, проверяем русское название...");
        }

        try {
            Country country = Country.getByRuName(string);
            System.out.print(country);
            if (country.getOpen()) {
                System.out.println("открыта для посещения. " + '\n');
            } else {
                System.out.println("закрыта для посещения. " + '\n');
            }
        } catch (NoSuchCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
