
import java.util.HashSet;
import java.util.Set;

public class RecipesList {

    private final Set<Recipes> recipes = new HashSet<>();

    public void addRecipes(Recipes recipe) {
        if (!recipes.add(recipe)) {
            System.out.println("Такой рецепт есть в списке");
            throw new IllegalArgumentException();
        }
    }

    public void addRecipes(String name, ProductList pl) {
        Recipes temp = new Recipes(name, pl);
        addRecipes(temp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Recipes recipes : recipes) {
            sb.append(recipes.toString());
        }
        return sb.toString();
    }
}
