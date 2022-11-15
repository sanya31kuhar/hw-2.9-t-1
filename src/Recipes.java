
import java.util.Objects;

public class Recipes {

    private final String recipeName;
    private final ProductList products;
    private final Float foodPrice;

    public Recipes(String recipeName, ProductList products) {
        if (recipeName == null || recipeName.isBlank()) {
            System.out.println("Не указано название");
            throw new IllegalArgumentException();
        } else {
            this.recipeName = recipeName;
        }
        if (products == null) {
            System.out.println("Пустой список продуктов");
            throw new IllegalArgumentException();
        } else {
            this.products = products;
        }
        foodPrice = products.getSum();
    }

    public String getRecipeName() {
        return recipeName;
    }

    public ProductList getProducts() {
        return products;
    }

    public Float getFoodCost() {
        return foodPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipe = (Recipes) o;
        return recipeName.equals(recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    @Override
    public String toString() {
        return recipeName + '\n' + products + String.format("Стоимость продуктов %.2f\n", foodPrice);
    }
}
