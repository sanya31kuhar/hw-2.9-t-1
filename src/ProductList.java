
import java.util.HashSet;
import java.util.Set;

public class ProductList {

    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) {
        if (!products.add(product)) {
            System.out.println("Такой продукт есть в списке");
            throw new IllegalArgumentException();
        }
    }

    public void addProduct(String name, Float price, Float weight) {
        Product temp = new Product(name, price, weight);
        addProduct(temp);
    }

    public void markAsBought(String name) {
        for (Product product : products) {
            if (name.equals(product.getName())) {
                product.setBought(true);
            }
        }
    }

    public void deleteProduct(String name) {
        products.removeIf(product -> name.equals(product.getName()));
    }

    public Float getSum() {
        float sum = 0;
        for (Product product : products) {
            sum += (product.getPrice() * product.getWeight());
        }
        return sum;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products) {
            sb.append(product.toString());
        }
        return sb.toString();
    }
}
