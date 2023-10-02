package pl.javastart.task;

class Product {
    private final String name;
    private final String description;
    private final double netPrice;
    private final String category;

    Product(String name, String description, double netPrice, String category) {
        this.name = name;
        this.description = description;
        this.netPrice = netPrice;
        this.category = category;
    }

    String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    double getNetPrice() {
        return netPrice;
    }

    String getCategory() {
        return category;
    }

    void printInfo() {
        System.out.printf("%s\n\t%s\n\tKategoria: %s\n\tCena netto: %.2fzł%n",
                name, description, category, netPrice);
    }
}
