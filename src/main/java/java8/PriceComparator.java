package java8;

import java.util.*;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }

    static void main() {
        List<Product> products = new ArrayList();
                products.add(new Product("Milk", 6.4));
        products.add(new Product("Bread", 2.2));
        products.add(new Product("Eggs", 3.1));
        products.forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));
        System.out.println("After sorting by price:");
        Collections.sort(products, new PriceComparator());
        products.forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));
        products.sort(Comparator.comparing(Product::getName).reversed());
        products.forEach(product -> System.out.println(product.getName() + ": " + product.getPrice()));
    }
}