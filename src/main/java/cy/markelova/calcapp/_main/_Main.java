package cy.markelova.calcapp._main;

import static cy.markelova.calcapp.service.ResultWriterService.printResult;
import static cy.markelova.calcapp.util.Calculator.*;

public class _Main {

    public static void main(String[] args) {
        int num1 = 28;
        int num2 = 689;
        int result = addNumbers(num1, num2);
        printResult(num1, num2, result, "Addition");
        result = subtractNumbers(num1, num2);
        printResult(num1, num2, result, "Subtraction");
        result = multiplyNumbers(num1, num2);
        printResult(num1, num2, result, "Multiplication");
    }
}