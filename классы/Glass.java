package boom;
class Glasses {
	private double price;
	private double volume;
	private String material;
	private String colour;
	private double damage;
	private boolean saled;
	private double liquid;

	public Glasses(double price, double volume, String material, String colour, double damage, boolean saled, double liquid) {
		this.price = price;
		this.volume = volume;
		this.material = material;
		this.colour = colour;
		this.damage = damage; 
		this.saled = saled;
		this.liquid = liquid;
		
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
	public void fill(double liquid) {
		this.liquid += liquid; 
	}
	public void pour(double liquid) {
		this.liquid -= liquid; 
	}
	public void sale() {
		this.saled = true;
	}
	public String getColour() {
		return colour;
	}
	public String getMaterial() {
		return material;
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
	public double getVolume() {
		return volume;
	}
	public double getliquid() {
		return liquid;
	}
	public String getGlasses() {
		return ("Price is " + getPrice() + "rubles." + "\n" + "Volume is " + getVolume() + "." + "\n" +  
				"Material is " + getMaterial() + "." + "\n" + "Colour is " + getColour() + "." + "\n" + 
				"Damage = " + getDamage() + " percent." + "\n" + "Liquid = " + getliquid() + " milliliters.");
	}
	}


