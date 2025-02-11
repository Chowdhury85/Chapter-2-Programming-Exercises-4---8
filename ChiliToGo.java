public class ChiliToGo {
    public static void main(String[] args) {
        final int ADULT_MEAL_PRICE = 7;
        final int CHILD_MEAL_PRICE = 4;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of adult meals: ");
        int adultMeals = scanner.nextInt();
        
        System.out.print("Enter the number of children's meals: ");
        int childMeals = scanner.nextInt();
        
        int adultTotal = adultMeals * ADULT_MEAL_PRICE;
        int childTotal = childMeals * CHILD_MEAL_PRICE;
        int total = adultTotal + childTotal;
        
        System.out.println("Total money collected for adult meals: $" + adultTotal);
        System.out.println("Total money collected for children's meals: $" + childTotal);
        System.out.println("Total money collected for all meals: $" + total);
    }
}
