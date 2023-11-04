
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kwnna
 */
public class RecipeList {

    private final ArrayList<Recipe> recipes;

    public RecipeList() {
        this.recipes = new ArrayList<>();
    }

    public void add(Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> getRecipesContainingName(String name) {
        return recipes.stream()
                .filter(recipe -> recipe.nameContains(name))
                .collect(Collectors.toList());
    }

    public List<Recipe> getRecipesWithMaxCookingTime(int maxTime) {
        return recipes.stream()
                .filter(recipe -> recipe.getCookingTime() <= maxTime)
                .collect(Collectors.toList());
    }

    public List<Recipe> getRecipesContainingIngredient(String ingredient) {
        return recipes.stream()
                .filter(recipe -> recipe.containsIngredient(ingredient))
                .collect(Collectors.toList());
    }

    public void printRecipesContainingName(String name) {
        getRecipesContainingName(name)
                .forEach(recipe -> System.out.println(recipe));
    }

    public void printRecipesWithMaxCookingTime(int maxTime) {
        getRecipesWithMaxCookingTime(maxTime)
                .forEach(recipe -> System.out.println(recipe));
    }

    public void printRecipesContainingIngredient(String ingredient) {
        getRecipesContainingIngredient(ingredient)
                .forEach(recipe -> System.out.println(recipe));
    }

    public void printRecipes() {
        recipes.forEach((recipe) -> {
            System.out.println(recipe);
        });
    }
}
