package it.unibo.oop.lab05.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

public class OrderedWarehouse extends WarehouseImpl {

	public OrderedWarehouse(){
		
	}
	@Override
	public Set<Product> allProducts() {
		// TODO Auto-generated method stub
		return new TreeSet<>(super.allProducts());
	}
	
}
