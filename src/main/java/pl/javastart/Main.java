package pl.javastart;

import pl.javastart.service.TaxService;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        System.out.println(taxService.taxCalculator(taxService.income()));
    }
}
