package recipebook;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class RecipeTest {

	@Test
	public void addIngredients() {
		Recipe recipe  = new Recipe();
		
		Ingredients tomato = new Ingredients("tomato");		
		Ingredients onion = new Ingredients("onion");		
		Ingredients garlic = new Ingredients("garlic");		
		
		recipe.add(tomato);
		recipe.add(onion);
		recipe.add(garlic);
		
		
		List<Ingredients> ingredient = recipe.getIngredients();
				
		assertTrue(ingredient.size() == 3);
	}
	
	@Test
	public void addRecipes() {
		RecipeBook recipebook  = new RecipeBook();
		
		Recipe pasta = new Recipe();
		Recipe ribs = new Recipe();
		Recipe ratatouille = new Recipe();
		
		recipebook.addRecipe(pasta);
		recipebook.addRecipe(ribs);
		recipebook.addRecipe(ratatouille);
		
		List<Recipe> recipes = recipebook.getRecipes();
		
		assertTrue(recipes.size() == 3);
	}
	
	@Test
	public void test() {
		
		Recipe pasta = new Recipe("pasta");
		Recipe ratatouille = new Recipe("ratatouille");
		
		RecipeBook recipes = new RecipeBook();
		
		Ingredients tomato = new Ingredients("tomato");
		Ingredients onion = new Ingredients("onion");
		Ingredients spaghetti = new Ingredients("spaghetti");
		
		Ingredients aubergine = new Ingredients("aubergine");
		Ingredients zucchi  = new Ingredients("zucchi");
	
		 pasta.add(tomato);
		 pasta.add(onion);
		 pasta.add(spaghetti);
		 
		 ratatouille.add(tomato);
		 ratatouille.add(aubergine);
		 ratatouille.add(zucchi);
		 
		 
		 recipes.addRecipe(pasta);
		 
		 recipes.addRecipe(ratatouille);
		 
		 List<Ingredients> pastaIngredients = pasta.getIngredients();
		 List<Recipe> recipebook = recipes.getRecipes();
						 
		 assertTrue(recipes.findRecipeUsingIngredient(tomato).size() == 2);
		 
		 //Ingredients tomato2 = new Ingredients("tomato");	
		 
		 System.out.println(recipes.findRecipeUsingIngredient(onion));
		 
		 System.out.println(recipebook);
		 
			
	}
	

}
