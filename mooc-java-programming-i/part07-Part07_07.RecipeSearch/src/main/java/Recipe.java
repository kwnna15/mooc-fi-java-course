
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kwnna
 */
public class Recipe {

    private final String name;
    private final int cookingTime;
    private final ArrayList<String> ingredientList;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredientList) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredientList = ingredientList;
    }

    public boolean nameContains(String name) {
        return this.name.contains(name);
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public boolean containsIngredient(String ingredient) {
        return ingredientList.contains(ingredient);
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
}
