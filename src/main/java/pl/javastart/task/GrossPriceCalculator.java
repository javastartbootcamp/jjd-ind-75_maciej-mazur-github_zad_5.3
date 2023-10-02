package pl.javastart.task;

class GrossPriceCalculator {
    private static final double VAT_1 = 10.0;
    private static final double VAT_2 = 20.0;
    private static final double VAT_3 = 30.0;
    private static final double VAT_4 = 40.0;
    private static final double VAT_STANDARD = 25.0;

    double calculateGrossPrice(Product product) {
        String category = product.getCategory();

        return switch (category) {
            case Category.VEGETABLES -> (1 + VAT_1 / 100) * product.getNetPrice();
            case Category.DAIRY -> (1 + VAT_2 / 100) * product.getNetPrice();
            case Category.FURNITURE -> (1 + VAT_3 / 100) * product.getNetPrice();
            case Category.ELECTRONICS -> (1 + VAT_4 / 100) * product.getNetPrice();
            default -> (1 + VAT_STANDARD / 100) * product.getNetPrice();
        };
    }
}
