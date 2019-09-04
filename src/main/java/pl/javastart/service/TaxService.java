package pl.javastart.service;

import java.util.Scanner;

public class TaxService  {
    public static final double LOW_TAX = 0.18;
    public static final double HIGH_TAX = 0.32;
    public static final double TAX_TRESHOLD = 85528;
    public static final double FREE_TAX = 3091;

    public static double income (){
        double value = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dochod brutto");
        value = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        return value;
    }

    private static boolean checkValue (double value){
        return value <= TAX_TRESHOLD;
    }

    private static double getLowTax (double value){
        return Math.round(value*LOW_TAX-556.02);
    }
    private static double getHighTax (double value){
        return Math.round(((value-TAX_TRESHOLD)*HIGH_TAX) + getLowTax(TAX_TRESHOLD));
    }

    public static double taxCalculator (double value){
        double result = value;
        if (result <= FREE_TAX)
            return 0;
        else if (checkValue(result)){
            return getLowTax(result);
        }else
            return getHighTax(result);
    }
}
