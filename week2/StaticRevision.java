
public class StaticRevision {
      public static void main(String[] args) {
		Bottle bluebottle = new Bottle(new Color("blue"));
		Bottle violetbottle = new Bottle(new Color("violet"));
		
		System.out.println(bluebottle.color.color);
		System.out.println(violetbottle.color.color);
		
	}
}

class Bottle{
	Color color;
	public Bottle(Color color) {
		this.color = color;
	}
	
}

class Color{
	String color;
	public Color (String color) {
		this.color = color;
	}
}