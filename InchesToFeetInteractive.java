public class InchesToFeetInteractive {
    public static void main(String[] args) {
        final int INCHES_IN_FOOT = 12;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a length in inches: ");
        int inches = scanner.nextInt();
        
        int feet = inches / INCHES_IN_FOOT;
        int remainingInches = inches % INCHES_IN_FOOT;
        
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
    }
}
