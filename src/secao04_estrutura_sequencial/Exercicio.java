package secao04_estrutura_sequencial;

import java.util.Locale;

public class Exercicio {

        public static void main(String[] args) {
            String product1 = "Computador";
            String product2 = "Office desk";

            int age = 30;
            int code = 5290;
            String gender = "F";
        
            double price1 = 2100.0;
            double price2 = 650.50;
            double measure = 53.234567;

            System.out.println("Products: ");
            System.out.printf("%s, witch price is R$ %.2f\n", product1, price1);
            System.out.printf("%s, witch price is R$ %.2f\n\n", product2, price2);

            System.out.printf("Record: %d years old, code %d and gender: %s\n\n", age, code, gender);

            System.out.printf("Measue with eight decimal places: %.8f%n", measure);
            System.out.printf("Rouded (three decimal placs): %.3f%n", measure);

            Locale.setDefault(Locale.US);

            System.out.printf("US decimal point: %.3f%n", measure);
        }
}
