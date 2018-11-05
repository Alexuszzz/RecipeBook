package recipebook;

public class Ingredients {
	
        private String ingredient;
        
    public Ingredients(String ingredient) {
    	
    	this.ingredient = ingredient;
    }

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}    
    
	
	@Override
    public String toString(){
		
        return ingredient;
    }
}
