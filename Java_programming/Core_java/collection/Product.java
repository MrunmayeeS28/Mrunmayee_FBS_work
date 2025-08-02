package p1;
public class Product {
	int id;
	String name;
	
	Product() {
		this.id = 0;
		this.name = "Not given";
	}

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public  int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName (String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
}


