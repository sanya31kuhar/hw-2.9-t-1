import java.util.Objects;

public class Product {

    private final String name;
    private Float price;
    private Float weight;
    private boolean isBought = false;

    public Product(String name, Float price, Float weight) {
        if ((name == null) || name.isBlank()) {
            System.out.println("Заполните карточку товара полностью");
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
        setPrice(price);
        setWeight(weight);
    }

    String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    Float getWeight() {
        return weight;
    }

    public void setPrice(Float price) {
        if (price == null || price <= 0) {
            System.out.println("Заполните карточку товара полностью");
            throw new IllegalArgumentException();
        } else {
            this.price = price;
        }
    }

    public void setWeight(Float weight) {
        if (weight == null || weight <= 0) {
            System.out.println("Заполните карточку товара полностью");
            throw new IllegalArgumentException();
        } else {
            this.weight = weight;
        }
    }

    public void setBought(boolean bought) {
        isBought = bought;
    }

    @Override
    public String toString() {
        char c = '-';
        if (isBought) {
            c = '+';
        }
        return String.format("%s, %.2f руб., %.3f кг, %c\n", name, price, weight, c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
