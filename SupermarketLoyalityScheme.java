// A supermarket has loyality scheme that is offered to all customers. Loyality card holders enjoy the benefits of either additional discounts
// on all purchases or the acquisition of loyality points (1% of the amount of spent, count just whole numbers; e.g. 1234 HUF spent means 12 points), which can be converted into vouchers for the supermarket or to equivalent points in
// schemes run by partners. Customers without loyality card receive an additional discount only if they spend more than $100 on any one visit
// to the store.

public class SupermarketLoyalityScheme {

    public static void main(String[] args) {

        
    }

        public static void shopping (boolean isLoyalityCard, boolean isExtraDiscountSelected, int amountOfSpent) {

        double loyality = amountOfSpent * 0.01;
        int loyalityp = (int) loyality;

        if (amountOfSpent < 0) {
            System.out.println("Invalid value for amount of spent");
        } else if (isLoyalityCard == false && amountOfSpent <= 100) {
            System.out.println("Thank you for your purchase!");
        } else if (isLoyalityCard == false && amountOfSpent > 100) {
            System.out.println("Thank you for your purchase! 10% extra discount was added to your bill. Is you were interested in out loyality program, please visit www.loyalityp.com!");
        } else if (isLoyalityCard == true && isExtraDiscountSelected == true) {
            System.out.println("Thank you for your purchase! 10% extra discount was added to your bill.");
        } else if (isLoyalityCard == true && isExtraDiscountSelected == false) {
            System.out.println("Thank you for your purchase!" + loyalityp + "loyality point were added to your account.");
        } else {
            System.out.println("Invalid value");
        }

    }

    
}