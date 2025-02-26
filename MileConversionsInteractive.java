public class MileConversionsInteractive {
    public static void main(String[] args) {
        final int INCHES_IN_MILE = 63360;
        final int FEET_IN_MILE = 5280;
        final int YARDS_IN_MILE = 1760;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of miles: ");
        int miles = scanner.nextInt(); 
        int inches = miles * INCHES_IN_MILE;
        int feet = miles * FEET_IN_MILE;
        int yards = miles * YARDS_IN_MILE;
        
        System.out.println(miles + " miles is equal to:");
        System.out.println(inches + " inches");
        System.out.println(feet + " feet");
        System.out.println(yards + " yards");
    }
}
