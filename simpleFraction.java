public class simpleFraction {
    private int num; //числитель
    private int denom; //знаменатель

    // Конструктор
    public simpleFraction(int n, int d) {
        this.num = n;
        this.denom = d;
    }

    //Вспомогательная функция
    private static String correctPositionOfMinus(int numLocal, int denomLocal) {
        if ((numLocal >= 0) && (denomLocal < 0)) {
            return (-numLocal + "/" + -denomLocal);
        } else if ((numLocal < 0) && (denomLocal < 0)) {
            return (-numLocal + "/" + -denomLocal);
        } else {
            return (numLocal + "/" + denomLocal);
        }
    }

    //Создание простой дроби по умолчанию
    public static String defaultCreationOfSimpleFraction(simpleFraction sFrDcr) {
        simpleFraction s1 = new simpleFraction(sFrDcr.num, sFrDcr.denom);
        return (sFrDcr.num + "/" + sFrDcr.denom);
    }

    //Создание простой дроби
    public static String creationOfSimpleFraction(simpleFraction sFrCr) {
        int numLocal = sFrCr.num;
        int denomLocal = sFrCr.denom;
        return (correctPositionOfMinus(numLocal, denomLocal));
    }

    //Операция сложения с помощью функции с двумя аргументами
    public static String additionOfSimpleFractions(simpleFraction sFr1, simpleFraction sFr2) {
        int numLocal = sFr1.num * sFr2.denom + sFr2.num * sFr1.denom;
        int denomLocal = sFr1.denom * sFr2.denom;
        return (correctPositionOfMinus(numLocal, denomLocal));
    }

    //Операция сложения с помощью функции с одним аргументом
    public String additionOfSimpleFractions(simpleFraction sFr2) {
        int numLocal = this.num * sFr2.denom + sFr2.num * this.denom;
        int denomLocal = this.denom * sFr2.denom;
        return (correctPositionOfMinus(numLocal, denomLocal));
    }

    //Операция вычитания с помощью функции с двумя аргументами
    public static String subtractionOfSimpleFractions(simpleFraction sFr1, simpleFraction sFr2) {
        int numLocal = sFr1.num * sFr2.denom - sFr2.num * sFr1.denom;
        int denomLocal = sFr1.denom * sFr2.denom;
        return (correctPositionOfMinus(numLocal, denomLocal));
    }

    //Операция вычитания с помощью функции с одним аргументом
    public String subtractionOfSimpleFractions(simpleFraction sFr2) {
        int numLocal = this.num * sFr2.denom - sFr2.num * this.denom;
        int denomLocal = this.denom * sFr2.denom;
        return (correctPositionOfMinus(numLocal, denomLocal));
    }

    //Операция умножения с помощью функции с двумя аргументами
    public static String multiplicationOfSimpleFractions(simpleFraction sFr1, simpleFraction sFr2) {
        int numLocal = sFr1.num * sFr2.num;
        int denomLocal = sFr1.denom * sFr2.denom;
        return (correctPositionOfMinus(numLocal, denomLocal));
    }

    //Операция умножения с помощью функции с одним аргументом
    public String multiplicationOfSimpleFractions(simpleFraction sFr2) {
        int numLocal = this.num * sFr2.num;
        int denomLocal = this.denom * sFr2.denom;
        return (correctPositionOfMinus(numLocal, denomLocal));
    }

    //Операция деления с помощью функции с двумя аргументами
    public static String divisionOfSimpleFractions(simpleFraction sFr1, simpleFraction sFr2) {
        int numLocal = sFr1.num * sFr2.denom;
        int denomLocal = sFr2.num * sFr1.denom;
        return (correctPositionOfMinus(numLocal, denomLocal));
    }

    //Операция деления с помощью функции с одним аргументом
    public String divisionOfSimpleFractions(simpleFraction sFr2) {
        int numLocal = this.num * sFr2.denom;
        int denomLocal = sFr2.num * this.denom;
        return (correctPositionOfMinus(numLocal, denomLocal));
    }
}