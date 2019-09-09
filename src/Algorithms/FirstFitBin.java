// java program to implement Bin packing algorithm
// in Bin packing problem, items of  different volumes must be packed into a finite number of bins or vontainers, each 
// of volume V, in a way that minimises the number of used bins.
// other applications may be loading trucks, or editorial planning
// here is the implementation of best fit algorithm

package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstFitBin {

	private List<Integer> items = new ArrayList<>();
	public List<Bin> bins;
	private int binCapacity;
	private int binCounter;

	//this is the implementation of first fit algorithm
	public FirstFitBin(List<Integer> items, int capacity) {

		this.items = items;
		this.binCapacity = capacity;
		this.bins = new ArrayList<>();
	}
	
	//
	public void solveBinPack() {
		Collections.sort(items, Collections.reverseOrder());
		if (this.items.get(0) > this.binCapacity) {
			System.out.println("No feasible solution");
			return;
		}
		this.bins.add(new Bin(binCounter, binCapacity));
		for (Integer currentItem : items) {
			boolean isOk = false;
			int currentBin = 0;
			while (!isOk) {
				if (currentBin == this.bins.size()) {
					Bin newBin = new Bin(++binCounter, binCapacity);
					this.bins.add(newBin);
					isOk = false;
				} else if (this.bins.get(currentBin).put(currentItem)) {
					isOk = true;
				} else {
					currentBin++;
				}

			}
		}

	}
}

//template for bin objects
class Bin {

	private int id;
	private int capacity;
	private int currentSize;
	private List<Integer> item;

	public Bin(int id, int capacity) {

		this.id = id;
		this.capacity = capacity;
		this.item = new ArrayList<Integer>();
	}

	public boolean put(Integer item) {
		if (this.currentSize + item > this.capacity)
			return false;

		this.item.add(item);
		this.currentSize += item;

		return true;
	}

	@Override
	public String toString() {
		return "Bin [id=" + id + ", capacity=" + capacity + ", currentSize=" + currentSize + ", items=" + item + "]";
	}

}

//main class
class BinTest {

	public static void main(String[] args) {
		int binCapacity = 10;
		
		// list of items to be packed is stored in variable items 
		List<Integer> items = Arrays.asList(10, 5, 4, 3, 5, 1);

		FirstFitBin fillBin = new FirstFitBin(items, binCapacity);
		fillBin.solveBinPack();
		for (int i = 0; i < fillBin.bins.size(); i++) {
			System.out.println(fillBin.bins.get(i));

		}

	}
}