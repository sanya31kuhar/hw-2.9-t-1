import java.util.HashMap;
import java.util.Map;

public class ProductList {

    private final Map<Product, Float> products = new HashMap<>();

    public void addProduct(Product product, Float weight) {
        if (products.put(product, weight) != null) {
            System.out.println("Такой продукт есть в списке");
            throw new IllegalArgumentException();
        }
    }

    public void addProduct(String name, Float price, Float weight) {
        if (weight == null || weight < 0) {
            weight = 1f;
        }
        addProduct(new Product(name, price), weight);
    }

    public void setWeight(String name, Float weight) {
        for (Map.Entry<Product, Float> entry : products.entrySet()) {
            if (entry.getKey().getName().equals(name)) {
                entry.setValue(weight);
            }
        }
    }

    public void markAsBought(String name) {
        for (Product product : products.keySet()) {
            if (product.getName().equals(name)) {
                product.setBought(true);
            }
        }
    }

    public void deleteProduct(String name) {
        Product temp = new Product(name, 1f);
        products.remove(temp);
    }

    public Float getSum() {
        float sum = 0;
        for (Map.Entry<Product, Float> entry : products.entrySet()) {
            sum += entry.getKey().getPrice() * entry.getValue();
        }
        return sum;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Product, Float> entry : products.entrySet()) {
            sb.append(entry.getKey().toString()).append(", ").append(entry.getValue().toString()).append('\n');
        }
        return sb.toString();
    }
}
