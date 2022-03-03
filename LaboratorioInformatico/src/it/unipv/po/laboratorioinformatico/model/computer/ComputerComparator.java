package it.unipv.po.laboratorioinformatico.model.computer;

import java.util.Comparator;

public class ComputerComparator implements Comparator<Computer>{		//posso creare piu classi che comparano cose diverse!!!

	@Override
	public int compare(Computer o1, Computer o2) {
		if (o1.ram < o2.ram) {
			return -1; 
		} else if (o1.ram > o2.ram) {
			return +1;
		} else {
			return 0;
																	
		}
	}
		
//	public int compareHardDisk(Computer o1, Computer o2) {
//		if (o1.hardDisk < o2.hardDisk) {
//			return -1;
//		} else if(o1.hardDisk > o2.hardDisk) {
//			return +1;
//		} else {
//			return 0;
//		}
//	}
	
	
}


