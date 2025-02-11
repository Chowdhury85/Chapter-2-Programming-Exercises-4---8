public class Eggs {
    public static void main(String[] args) {
        final double DOZEN_PRICE = 3.25;
        final double EGG_PRICE = 0.45;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of eggs in the order: ");
        int eggsOrdered = scanner.nextInt();
        
        int dozenCount = eggsOrdered / 12; 
        int looseEggs = eggsOrdered % 12; 
        
        double totalCost = (dozenCount * DOZEN_PRICE) + (looseEggs * EGG_PRICE);
        
        System.out.println("You ordered " + eggsOrdered + " eggs.");
        System.out.println("That’s " + dozenCount + " dozen at $" + DOZEN_PRICE + " per dozen and " + looseEggs + " loose eggs at $" + EGG_PRICE + " each.");
        System.out.println("Total cost: $" + totalCost);
    }
}
