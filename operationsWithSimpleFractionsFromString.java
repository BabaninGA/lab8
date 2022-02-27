import java.util.Scanner;
import java.util.regex.*;

public class operationsWithSimpleFractionsFromString {
    public static void main(String[] args) throws ExceptionForNull {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите две простые дроби и арифметическую операцию между ними по формату \n " +
                "<1/1 + 1/1> (пробел между арифметической операцией и дробью обязателен)");
        String arithmeticExpression = in.nextLine();
        in.close();
        String pattern = "^(-?\\d{1,10})/(-?\\d{1,10})( )[-+*:]( )(-?\\d{1,10})/(-?\\d{1,10})$";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher1 = pattern1.matcher(arithmeticExpression);
        if (matcher1.matches() == true) {
            String[] partsOfArithmeticExpression = arithmeticExpression.split("[/( )]+");
            String arithmeticOperation = partsOfArithmeticExpression[2];
            int num1 = Integer.parseInt(partsOfArithmeticExpression[0]);
            int denom1 = Integer.parseInt(partsOfArithmeticExpression[1]);
            int num2 = Integer.parseInt(partsOfArithmeticExpression[3]);
            int denom2 = Integer.parseInt(partsOfArithmeticExpression[4]);
            if ((denom1 == 0) | (denom2 == 0)) throw new ExceptionForNull();
            simpleFraction sFr1 = new simpleFraction(num1, denom1);//создание объекта класса
            simpleFraction sFr2 = new simpleFraction(num2, denom2);//создание объекта класса
            if (arithmeticOperation.equals("+")) {
                System.out.println("Результат сложения двух простых дробей");
                System.out.println(simpleFraction.additionOfSimpleFractions(sFr1, sFr2));
            } else if (arithmeticOperation.equals("-")) {
                System.out.println("Результат вычитания из первой простой дроби второй");
                System.out.println(sFr1.subtractionOfSimpleFractions(sFr2));
            } else if (arithmeticOperation.equals("*")) {
                System.out.println("Результат умножения двух простых дробей");
                System.out.println(simpleFraction.multiplicationOfSimpleFractions(sFr1, sFr2));
            } else if (arithmeticOperation.equals(":")) {
                if (num2 != 0) {
                    System.out.println("Результат деления первой простой дроби на вторую");
                    System.out.println(sFr1.divisionOfSimpleFractions(sFr2));
                } else {
                    System.out.println(" В случае с делением первой простой дроби на вторую числитель второй простой дроби не может быть равен нулю");
                }
            }
        } else {
            System.out.println("Вы ввели выражение НЕ в указанном формате");
        }
    }
}