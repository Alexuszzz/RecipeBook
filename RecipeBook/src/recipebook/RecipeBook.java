package recipebook;

import java.util.ArrayList;
import java.util.List;

public class RecipeBook {
	         
	private List<Recipe> recipes = new ArrayList<>();
	
	
	public void addRecipe(Recipe recipe) {
		
		recipes.add(recipe);
	}
	
	
	public List<Recipe> findRecipeUsingIngredient(Ingredients ingredient) {
		
		List<Recipe> certainIngredientRecipes = new ArrayList<>();
				
		for(Recipe recipe: recipes) {
			
			if (recipe.getIngredients().contains(ingredient)) {
				
				certainIngredientRecipes.add(recipe);
			}
		}		
		return certainIngredientRecipes;	
	}


	public List<Recipe> getRecipes() {
		return recipes;
	}


	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}
	
	@Override
    public String toString(){
		
        return recipes.toString() ;
    }
}

