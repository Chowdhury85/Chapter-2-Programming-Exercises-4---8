import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        final int ADULT_MEAL_PRICE = 7;
        final int CHILD_MEAL_PRICE = 4;
        final double ADULT_MEAL_COST = 4.35;
        final double CHILD_MEAL_COST = 3.10;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of adult meals: ");
        int adultMeals = scanner.nextInt();
        
        System.out.print("Enter the number of children's meals: ");
        int childMeals = scanner.nextInt();
        
        int adultTotal = adultMeals * ADULT_MEAL_PRICE;
        int childTotal = childMeals * CHILD_MEAL_PRICE;
        int total = adultTotal + childTotal;
        
        double adultProfit = adultMeals * (ADULT_MEAL_PRICE - ADULT_MEAL_COST);
        double childProfit = childMeals * (CHILD_MEAL_PRICE - CHILD_MEAL_COST);
        double totalProfit = adultProfit + childProfit;
        
        System.out.println("Total money collected for adult meals: $" + adultTotal);
        System.out.println("Total money collected for children's meals: $" + childTotal);
        System.out.println("Total money collected for all meals: $" + total);
        
        System.out.println("Total profit from adult meals: $" + adultProfit);
        System.out.println("Total profit from children's meals: $" + childProfit);
        System.out.println("Total profit: $" + totalProfit);
    }
}
