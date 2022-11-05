public class Main {

    public static void main(String[] args) {

        ProductList forBliny = new ProductList();
        forBliny.addProduct("Молоко", 50f, 0.5f);
        forBliny.addProduct("Мука", 82.50f, 0.2f);
        forBliny.addProduct("Яйца", 75.90f, 0.2f);
        forBliny.addProduct("Масло сливочное ", 120f, 0.03f);
        forBliny.addProduct("Сахар", 46f, 0.03f);
        forBliny.addProduct("Соль", 20f, 0.004f);
        Recipes bliny = new Recipes("Блины", forBliny);

        ProductList forAppleCharlotte = new ProductList();
        forAppleCharlotte.addProduct("Мука", 82.50f, 0.3f);
        forAppleCharlotte.addProduct("Яйца", 75.90f, 0.265f);
        forAppleCharlotte.addProduct("Сахар", 46f, 0.3f);
        forAppleCharlotte.addProduct("Яблоки", 120.50f, 0.4f);
        forAppleCharlotte.addProduct("Масло сливочное", 120f, 0.03f);
        forAppleCharlotte.addProduct("Соль", 20f, 0.004f);
        Recipes appleCharlotte = new Recipes("Шарлотка", forAppleCharlotte);
        Recipes pie = new Recipes("Пирог", forAppleCharlotte);
        Recipes pie1 = new Recipes("Пирог", forBliny);

        RecipesList recipesList = new RecipesList();
        recipesList.addRecipes(bliny);
        recipesList.addRecipes(appleCharlotte);
        recipesList.addRecipes(pie);
        System.out.println(recipesList);
    }
}
