package demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

interface MenuItem{
	String getName();
	double getPrice();
	
}

class Sandwich implements MenuItem{
	
	String name;
	double price;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
}

class Salad implements MenuItem{
	String name;
	double price;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
}

class Drink implements MenuItem{
	String name;
	double price;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
}

class Trio implements MenuItem{
	Sandwich s = new Sandwich();
	Salad sl = new Salad();
	Drink d = new Drink();
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return (s.getName() + " ---> " + s.getPrice()+"\n"+sl.getName() + " ---> " + sl.getPrice()+"\n"+ d.getName() + " ---> " + d.getPrice());
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		double[] a = new double[3];
		a[0] = s.getPrice();
		a[1] = sl.getPrice();
		a[2] = d.getPrice();
		Arrays.sort(a);
		
		return (a[1]+a[2]);
	}
	
	
}

public class Question08082303 {

	public static void main(String[] args) {
		double[] sandwichesPrice = {1.1,3.5,2.15,1.85};
		double[] saladsPrice = {0.75,1.0,1.85};
		double[] drinksPrice = {1.25,2.5,3.15};
		System.out.println("Create your trio...");
		System.out.println("Sandwiches			Salads				Drinks\n=======================================================================\nveg sandwich			mini Salad			 small Drink \nchicken sandwich		masala Salad			 medium Drink \negg sandwich 			leafy Salad			 large Drink \npanner sandwich");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ss =s.split("/");
		for(String e:ss) {
			System.out.println(e);
		}
		Trio obj = new Trio();
//		sandwiches
		Sandwich objs = new Sandwich();
		switch(ss[0]) {
		case "veg sandwich":
			objs.name = "veg sandwich";
			objs.price = sandwichesPrice[0];
			break;
		case "chicken sandwich":
			objs.name = "chicken sandwich";
			objs.price = sandwichesPrice[1];
			break;
		case "egg sandwich":
			objs.name = "egg sandwich";
			objs.price = sandwichesPrice[2];
			break;
		case "panner sandwich":
			objs.name = "panner sandwich";
			objs.price = sandwichesPrice[3];
			break;
		}
//		salads
		Salad objsal = new Salad();
		switch(ss[1]) {
		case "mini Salad":
			objsal.name = "mini Salad";
			objsal.price = saladsPrice[0];
			break;
		case "masala Salad":
			objsal.name = "masala Salad";
			objsal.price = saladsPrice[1];
			break;
		case "leafy Salad":
			objsal.name = "leafy Salad";
			objsal.price = saladsPrice[2];
			break;
		}
//		drinks
		Drink objd = new Drink();
		switch(ss[2]) {
		case "small Drink":
			objd.name = "small Drink";
			objd.price = drinksPrice[0];
			break;
		case "medium Drink":
			objd.name = "medium Drink";
			objd.price = drinksPrice[1];
			break;
		case "large Drink":
			objd.name = "large Drink";
			objd.price = drinksPrice[2];
			break;
		}
		
		obj.s = objs;
		obj.sl = objsal;
		obj.d = objd;
		
		obj.getName();
		System.out.println(obj.getPrice());
		
	}

}
