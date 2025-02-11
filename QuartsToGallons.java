public class QuartsToGallons {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4; // Constant for number of quarts in a gallon
        int quartsNeeded = 18; // Number of quarts needed for the job
        int gallons = quartsNeeded / QUARTS_IN_GALLON; // Whole gallons
        int remainingQuarts = quartsNeeded % QUARTS_IN_GALLON; // Remaining quarts

        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}
