public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of quarts needed for the job: ");
        int quartsNeeded = scanner.nextInt(); 
        
        int gallons = quartsNeeded / QUARTS_IN_GALLON; 
        int remainingQuarts = quartsNeeded % QUARTS_IN_GALLON; 
        
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}
