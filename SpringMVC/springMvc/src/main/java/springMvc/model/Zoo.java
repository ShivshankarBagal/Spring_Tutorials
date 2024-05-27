package springMvc.model;

public class Zoo {
	final int e=1;

	public static void main(String[] args) {
		
		Animal a=new Animal();
		
		a.sleep();
		Cat c=(Cat) a;
		c.sleep();
		c.walk();
		 Tiger t=(Tiger) c;
		 t.sleep();
		 t.walk();
		 t.talk();
	}
}
