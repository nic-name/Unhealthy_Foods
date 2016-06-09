//ENUM containing all the unhealthy foods
public enum UnhealthyFoods {
	CHIPS, 
	FRIES, 
	BURGERS, 
	BURGER, 
	PIZZAS, 
	PIZZA, 
	SAUSAGES, 
	PIES, 
	PIE, 
	CRISPS;
	//String declaring the unhealthy food name
	private String unhealthyFoodName;

	//Constructor
	private UnhealthyFoods() {
		this.unhealthyFoodName = this.name();
	}
	
	//Getters and Setters
	public String getUnhealthyFoodName() {
		return unhealthyFoodName;
	}

	public void setUnhealthyFoodName(String unhealthyFoodName) {
		this.unhealthyFoodName = unhealthyFoodName;
	}
	
	//This returns the name of the enum while ignoring case
	public static UnhealthyFoods getUnhealthyFoodsEnum(String s){
		for(UnhealthyFoods unhealthyFoodName : UnhealthyFoods.values()){
			if(unhealthyFoodName.getUnhealthyFoodName().equalsIgnoreCase(s)){
			return unhealthyFoodName;
			}
		}
		return null;
	}

}
