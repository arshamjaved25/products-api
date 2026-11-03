// A Physical Product IS-A Product because it needs to be shipped.
// A Shopping cart HAS-A set of products.
package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    private double discountedPrice;

    @Override
    public String getSummary() {
        return "Physical: " + getName() +
                "| Weight: " + getWeightKg();
    }

    @Override
    public double applyDiscount(double rate) {

        double capped = Math.min(rate, 0.20);
      this.discountedPrice = getPrice() * (1-capped);
        return rate;
    }

    @Override
    public double getDiscountedPrice() {
        return this.discountedPrice;
    }
}
