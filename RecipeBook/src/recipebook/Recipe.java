package recipebook;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	
	private int preparationTime;
	private String name; 
	
    private List<Ingredients> ingredients;
    
 //New constructor with arguments, so all the number variables in the constructors should also be assigned. 
    
    public Recipe(String name) {
    	this.name = name;
    	this.preparationTime = 0;
    	this.ingredients = new ArrayList<Ingredients>();
    }
    
  //Default constructor  
    public Recipe() {
    	this.name = "";
    	this.preparationTime = 0;
    	this.ingredients = new ArrayList<Ingredients>();
    }
  
    public void add(Ingredients ingredient) {
    	ingredients.add(ingredient);
    }

	public List<Ingredients> getIngredients() {
		return ingredients;
	}

	public int getNoIngredients() {
		return ingredients.size();
		
	}

	public int getPreparationTime() {
		return preparationTime;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	@Override
    public String toString(){
		
        return name; /*+ " "+ ingredients.toString();*/
    }


	


	
	
}


