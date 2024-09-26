public class PrimeCheck {

    static boolean Prime(int number){
        // prime number checker
        while (number % 2 == 0 || number <= 1){
            return false;
        }
    return true;
    }

    public static void main(String[] args) {
        int number = 14;
        if (Prime(number)){
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
        }