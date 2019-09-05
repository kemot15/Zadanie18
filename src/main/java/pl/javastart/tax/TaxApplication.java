package pl.javastart.tax;

import pl.javastart.tax.service.TaxService;

import java.util.Scanner;

public class TaxApplication {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        System.out.println(taxService.taxCalculator(getUserIncome()));
    }

    private static double getUserIncome (){
        double value = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dochod brutto");
        value = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        return value;
    }
}
