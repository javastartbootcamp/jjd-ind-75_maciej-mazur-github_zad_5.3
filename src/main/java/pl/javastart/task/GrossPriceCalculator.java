package pl.javastart.task;

class GrossPriceCalculator {
    double calculateGrossPrice(Product product) {
        String category = product.getCategory();

        return switch (category) {
            case "warzywa" -> 1.1 * product.getNetPrice();
            case "nabiał" -> 1.2 * product.getNetPrice();
            case "meble" -> 1.3 * product.getNetPrice();
            case "elektronika" -> 1.4 * product.getNetPrice();
            default -> 1.2 * product.getNetPrice();
        };
    }
}
