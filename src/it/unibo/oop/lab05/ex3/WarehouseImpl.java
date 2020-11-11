package it.unibo.oop.lab05.ex3;


import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	protected LinkedHashSet<Product> products;
	
	public WarehouseImpl() {
		 this.products = new LinkedHashSet<Product>();
	}
	
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		this.products.add(p);

	}

	@Override
	public Set<String> allNames() {
		// TODO Auto-generated method stub
		Set<String> names = new LinkedHashSet<String>();
		for(Product p : this.products) {
			names.add(p.getName());
		}
		return names;
	}

	@Override
	public Set<Product> allProducts() {
		// TODO Auto-generated method stub
		return Set.copyOf(this.products);
	}

	@Override
	public boolean containsProduct(Product p) {
		// TODO Auto-generated method stub
		return this.products.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		// TODO Auto-generated method stub
		for(Product p : this.products) {
			if (p.getName() == name) {
				return p.getQuantity();
			}
		}
		return -1;
	}

}
