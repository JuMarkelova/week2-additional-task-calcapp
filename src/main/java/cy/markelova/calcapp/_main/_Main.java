package cy.markelova.calcapp._main;

import static cy.markelova.calcapp.service.ResultWriterService.printResult;
import static cy.markelova.calcapp.util.Calculator.*;

public class _Main {

    public static void main(String[] args) {

        int num1 = 28;
        int num2 = 689;

        int resultSum = addNumbers(num1, num2);
        printResult(num1, num2, resultSum, "Сумма");

        int resultSubtract = subtractNumbers(num1, num2);
        printResult(num1, num2, resultSubtract, "Разность");

        int resultProduct = multiplyNumbers(num1, num2);
        printResult(num1, num2, resultProduct, "Прозведение");
    }
}
