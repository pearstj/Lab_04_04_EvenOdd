//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class OddOrEven {
    public static void main(String[] args) {
        // Hardcoded input value
        int numToExamine = 2;  // You can change this to test other values

        // Use modulo operator to check if the number is even or odd
        if (numToExamine % 2 == 0) {
            System.out.println(numToExamine + " is Even.");
        } else {
            System.out.println(numToExamine + " is Odd.");
        }
    }
}
