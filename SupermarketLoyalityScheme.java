// A supermarket has loyality scheme that is offered to all customers. Loyality card holders enjoy the benefits of either additional discounts
// on all purchases or the acquisition of loyality points, which can be converted into vouchers for the supermarket or to equivalent points in
// schemes run by partners. Customers without loyality card receive an additional discount only if they spend more than $100 on any one visit
// to the store.

public class SupermarketLoyalityScheme {

    public static void main(String[] args) {

    }

    public static boolean isExtraDiscount(boolean isLoyalityCard, boolean isExtraDiscountSelected, int amountofSpent) {

        if (isLoyalityCard == false && (amountofSpent >=0 && amountofSpent <= 100) && (isExtraDiscountSelected == true ||
            isExtraDiscountSelected == false)) {
            return false;
        } else if (isLoyalityCard == false && amountofSpent > 100 && (isExtraDiscountSelected == true || isExtraDiscountSelected == false)) {
            return true;
        } else if (isLoyalityCard == true && isExtraDiscountSelected == true) {
            return true;
        } else {
            return false;
        }
    }

    


}