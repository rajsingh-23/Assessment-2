package demo1;

import java.util.ArrayList;

interface DigitalTree{
	int absorbSunlight(int hours);
	void getTreeDetails();
}

class BinaryTree implements DigitalTree{
	
	String name;
	int produced;
	
	public int absorbSunlight(int hours) {
		produced =  hours*2;
		return produced;
	}
	
	public void getTreeDetails() {
		System.out.println(this.getName() + " : "+ this.produced);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

class QuantumTree implements DigitalTree{
	
	String name;
	int produced;
	
	public int absorbSunlight(int hours) {
		produced =  (3*((int)Math.pow(hours, 2)));
		return produced;
	}
	
	public void getTreeDetails() {
		System.out.println(this.getName() + " : "+ this.produced);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

class NeuralTree implements DigitalTree{
	
	String name;
	int produced;
	
	public int absorbSunlight(int hours) {
		produced =  (int)Math.pow(hours, 3);
		return produced;
	}
	
	public void getTreeDetails() {
		System.out.println(this.getName() + " : "+ this.produced);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}

class ForestManager{
	ArrayList<DigitalTree> a= new ArrayList<DigitalTree>();
	
	void addTree(DigitalTree obj) {
		a.add(obj);
	}
	
	int produceEnergyForForest(int hours) {
		int sum = 0;
		for(int i=0;i<a.size();i++) {
			sum = sum + a.get(i).absorbSunlight(hours);
		}
		
		return sum;
	}
	
	void getForestReport() {
		for(int i=0;i<a.size();i++) {
			a.get(i).getTreeDetails();
		}
	}
}

public class Question08082304 {

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.name = "Binary Oak";
		QuantumTree q = new QuantumTree();
		q.name = "Quantum Pine";
		QuantumTree q1 = new QuantumTree();
		q1.name = "Quantum Maple";
		
		
		ForestManager f = new ForestManager();
		f.addTree(b);
		f.addTree(q);
		f.addTree(q1);
		
		System.out.println(f.produceEnergyForForest(2));
		f.getForestReport();
	}

}
