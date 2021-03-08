enum CoffeeSize{
	
  	BIG(8),HUGE(11),OVERWHELMING(16);
  	
	CoffeeSize(int size){
  		this.ounces=size;
  	}
	
	private int ounces;
  	public int getOunces(){return this.ounces;}
};

//enumerators are a special kind of class can have methods and constructors as like any other normal class

class Coffee{
	CoffeeSize size;

	public static void main(String[] args){

		Coffee coffeeCup1 = new Coffee();
		coffeeCup1.size = CoffeeSize.BIG;

		System.out.println("  "+coffeeCup1.size.getOunces());

		Coffee coffeeCup2 = new Coffee();
		coffeeCup2.size = CoffeeSize.OVERWHELMING;

		Coffee coffeeCup3 = new Coffee();
		coffeeCup2.size = CoffeeSize.HUGE;

		for(CoffeeSize cf:CoffeeSize.values()){
                        System.out.println(cf.getOunces());
                }
	}
}
