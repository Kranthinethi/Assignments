import java.util.*;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Product> set=new HashSet<Product>();
	    set.add(new Product(101,"product1",32.0019));
	    set.add(new Product(102,"product2",23.0019));
	    set.add(new Product(102,"product2",23.0019));
	    set.add(new Product(103,"product3",65.03));
	    set.add(new Product(103,"product3",65.03));
	    set.add(new Product(104,"product4",45.0));
	    set.add(new Product(105,"product5",49.1));
	    set.add(new Product(106,"product6",67.091));
	    set.add(new Product(107,"product7",78.8));
	    set.add(new Product(108,"product8",72.9));
	    set.add(new Product(109,"product6",39.0));
	    set.add(new Product(110,"product6",101.91));
	   
	    System.out.println("Size of a set :"+set.size());

     for (Product product : set) {
		System.out.println(product);
	}
	    
		

	}

}
class Product{
	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	
	
	
	
	
	
	
}