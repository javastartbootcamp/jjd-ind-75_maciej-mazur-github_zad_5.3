package pl.javastart.task;

public class Main {
    private static GrossPriceCalculator grossPriceCalculator = new GrossPriceCalculator();

    public static void main(String[] args) {
        Product product1 = new Product("Papryka", "Świeża papryka czerwona", 2.30, Category.VEGETABLES);
        Product product2 = new Product("Mleko", "Mleko UHT 2.0%", 3.50, Category.DAIRY);
        Product product3 = new Product("Komoda", "Komoda dębowa z szufladami", 435.0, Category.FURNITURE);
        Product product4 = new Product("Smartphone", "Huawei p20 pro", 2600.0, Category.ELECTRONICS);
        Product product5 = new Product("Hamburger", "Hamburger z podwójnym serem", 19.50, Category.FAST_FOOD);

        printProductInfoWithGrossPrice(product1);
        printProductInfoWithGrossPrice(product2);
        printProductInfoWithGrossPrice(product3);
        printProductInfoWithGrossPrice(product4);
        printProductInfoWithGrossPrice(product5);
    }

    private static void printProductInfoWithGrossPrice(Product product) {
        product.printInfo();
        System.out.printf("\tCena brutto: %.2fzł%n", grossPriceCalculator.calculateGrossPrice(product));
        System.out.println("*********************************************");
    }
}
