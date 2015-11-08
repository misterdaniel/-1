class Parrot {
	private String name;
	private double price;
	private double weight;
	private String colour;
	private double damage;
	private boolean saled;
	private String house;
	private boolean hungry;

	public Parrot(String name, double price, double weight, String colour, double damage, boolean saled, String house, boolean hungry) {
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.damage = damage; 
		this.saled = saled;
		this.house = house;
		this.hungry = hungry;
		
	}
	public void addPrice(double price) {
		this.price += price;
	}
	public void subtractPrice(double price) {
		this.price -= price;
	}
	public void damage(double damaged) {
		this.damage += damage;
	} 
	public void repair(double damaged) {
		this.damage -= damage; 
	}
	public void sale() {
		this.saled = true;
	}
	public String getColour() {
		return colour;
	}
	public double getWeight() {
		return weight;
	}
	public String getHouse() {
		return house;
	}
	public String getName() {
		return name;
	}
	public double getDamage() {
		return damage;
	}
	public double getPrice() {
		return price;
	}
	public boolean getSaled() {
		return saled;
	}
	public boolean getHungry() {
		return hungry;
	}
	public String getGlasses() {
		return ("Price is " + getPrice() + "rubles." + "\n" + "Weight is " + getWeight() + " kg." + "\n" +  
				"Name is " + getName() + "." + "\n" + "Colour is " + getColour() + "." + "\n" + 
				"Damage = " + getDamage() + " percent." + "\n" + "House is " + getHouse() + "." + "\n" + "");
	}
	}

