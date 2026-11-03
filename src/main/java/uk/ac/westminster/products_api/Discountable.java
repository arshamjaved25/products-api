package uk.ac.westminster.products_api;

public interface Discountable {
    double applyDiscount(double rate);
    double getDiscountedPrice();
}
