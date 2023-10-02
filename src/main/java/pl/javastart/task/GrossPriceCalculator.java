package pl.javastart.task;

class GrossPriceCalculator {
    private static final double VAT_1 = 10.0;
    private static final double VAT_2 = 20.0;
    private static final double VAT_3 = 30.0;
    private static final double VAT_4 = 40.0;
    private static final double VAT_STANDARD = 25.0;

    double calculateGrossPrice(Product product) {
        String category = product.getCategory();

        double vat = switch (category) {
            case Category.VEGETABLES -> VAT_1;
            case Category.DAIRY -> VAT_2;
            case Category.FURNITURE -> VAT_3;
            case Category.ELECTRONICS -> VAT_4;
            default -> VAT_STANDARD;
        };

        return (1 + vat / 100) * product.getNetPrice();
    }
}
