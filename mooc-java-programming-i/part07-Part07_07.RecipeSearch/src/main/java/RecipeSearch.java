
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        RecipeList recipeList = getRecipeList(fileName);

        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.print("Enter command: ");
        String command = scanner.nextLine();

        switch (command) {
            case "list":
                recipeList.printRecipes();
                break;
            case "stop":
                return;
            case "find name":
                System.out.print("Searched word: ");
                String search = scanner.nextLine();
                recipeList.printRecipesContainingName(search);
                break;
            case "find cooking time":
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                recipeList.printRecipesWithMaxCookingTime(maxTime);
                break;
            case "find ingredient":
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipeList.printRecipesContainingIngredient(ingredient);
                break;
            default:
                break;
        }
    }

    private static RecipeList getRecipeList(String fileName) {
        try ( Scanner fileScan = new Scanner(Paths.get(fileName))) {
            RecipeList recipeList = new RecipeList();
            while (fileScan.hasNextLine()) {
                String name = fileScan.nextLine();
                int cookingTime = Integer.valueOf(fileScan.nextLine());
                ArrayList<String> ingredientList = new ArrayList<>();

                String ingredient = fileScan.nextLine();
                while (fileScan.hasNextLine()) {
                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredientList.add(ingredient);
                    ingredient = fileScan.nextLine();
                }

                Recipe recipe = new Recipe(name, cookingTime, ingredientList);
                recipeList.add(recipe);
            }

            return recipeList;
        } catch (Exception e) {
            System.out.println("Failed to read file");
            throw new RuntimeException(e);
        }
    }
}
