package lang.print.gaps.finalModuleTask;

public class NumberReverter {
//    Revert 3-digit number that will be passed (e.g.: given -> 489, expected -> 984) and print it. Code snippet:
    public void revert(int number) {
        int thirdDigit = number % 10;
        int secondDigit = (number % 100 - thirdDigit);
        int firstDigit = number / 100;
        System.out.println(thirdDigit*100+secondDigit+firstDigit);
    }
}
