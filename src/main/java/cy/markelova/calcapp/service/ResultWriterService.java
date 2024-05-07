package cy.markelova.calcapp.service;

public class ResultWriterService {

    public static void printResult(int number1, int number2, int result, String operationName) {
        System.out.println(operationName + " " + number1 + " и " + number2 + " = " + result);
    }
}
