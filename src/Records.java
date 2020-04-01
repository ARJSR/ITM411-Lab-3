import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Records extends BankRecords {
	static FileWriter fw = null;
	
	public Records() {
				
		try {
		
	    	fw = new FileWriter("bankrecords.txt");
	    	
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
//method get data, get average and display and record results	
	private static void AvgComp() {
		
		Arrays.sort(robjs, new SexComparator());
		
		int maleCt = 0, femCt = 0;
		double maleInc = 0.00, femInc = 0.00;
		
		for (int i = 0; i < SIZE; i++)
			if (robjs[i].getSex().equals("FEMALE")) {
				++femCt;
				femInc += robjs[i].getIncome();
			}
			else {
			 if	(robjs[i].getSex().equals("MALE")) {
				++maleCt;
				maleInc += robjs[i].getIncome();
				}
			}
		System.out.println("Data Analytics Results:");
		System.out.println("");
		System.out.printf("Avg income for Females: $%.2f", (femInc/femCt));
		System.out.println("");
		System.out.printf("Avg income for Males: $%.2f", (maleInc/maleCt));
		System.out.println("");
			
		try {
			fw.write("Data Analytics Results:\n");
			fw.write("\n");
			fw.write("Avg inc. for Females: $%.2f" + (femInc/femCt));
			fw.write("\n");
			fw.write("Avg income for Males: $%.2f" + (maleInc/maleCt));
			fw.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
			}
	
	//method to get data for analysis and display and record results
	private static void femsComp() {
		
		Arrays.sort(robjs, new FemaleComparator());
		 
		int femCt = 0; int femMort = 0;
		
		for(int i = 0; i < SIZE; i++) {
		  if (robjs[i].getSex().equals("FEMALE"))
		    if (robjs[i].getMortgage().equals("YES")) 
		     if (robjs[i].getSave_act().equals("YES"))
		
			++femMort;
		}
		
		System.out.println("");
		System.out.printf("Number of females with mortgages " + (femMort));
		System.out.println("");
		System.out.println("");
		
		try {
			fw.write("\n");
			fw.write("Number of females with mortgages " + (femMort));
			fw.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//method to get data for analysis and display and record results
	private static void menComp() {
	
		Arrays.parallelSort(robjs, new MaleComparator());
		
		int maleLoc = 0, maleLoc1 = 0, maleLoc2 = 0, maleLoc3 = 0;
		int oneChild = 1;
				
		//run comparable data for processing
		for(int i = 0; i < SIZE; i++) {
			if (robjs[i].getSex().equals("MALE"))
				if (robjs[i].getRegion().equals("INNER_CITY"))
				  if (robjs[i].getChildren() == (1))
					if (robjs[i].getCar().equals("YES"))
					 
			++maleLoc;
				  if (robjs[i].getSex().equals("MALE"))
						if (robjs[i].getRegion().equals("TOWN"))
							if (robjs[i].getChildren() == (1))
							  if (robjs[i].getCar().equals("YES"))
			++maleLoc1;
				  if (robjs[i].getSex().equals("MALE"))
						if (robjs[i].getRegion().equals("RURAL"))
							if (robjs[i].getChildren() == (1))
							  if (robjs[i].getCar().equals("YES"))
			++maleLoc2;
				  if (robjs[i].getSex().equals("MALE"))
						if (robjs[i].getRegion().equals("SUBURBAN"))
							if (robjs[i].getChildren() == (1))
							  if (robjs[i].getCar().equals("YES"))
			++maleLoc3;
	}
	
		//Display compared results and display analysis
		  System.out.printf("Number of males living in INNER CITY with cars " + (maleLoc)); 
		  System.out.println("");
		  System.out.printf("Number of males living in TOWN with cars " + (maleLoc1));
		  System.out.println("");
		  System.out.printf("Number of males living in RURAL with cars " + (maleLoc2));
		  System.out.println("");
		  System.out.printf("Number of males living in SUBURBAN with cars " + (maleLoc3));
	
	
	
	try {
		
		fw.write("\n");
		fw.write("Number of males living in INNER CITY with cars " + (maleLoc));
		fw.write("\n");
		fw.write("Number of males living in TOWN with cars " + (maleLoc1));
		fw.write("\n");
		fw.write("Number of males living in RURAL with cars " + (maleLoc2));
		fw.write("\n");
		fw.write("Number of males living in SUBURBAN with cars " + (maleLoc3));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
		
			
	public static void main(String[] args) {
		//bring in data for processing
			
	  		Records br = new Records();
	  		br.readData();
	  		
	  		//perform analytics on data in file and print to file and console
	  		AvgComp();
	  		femsComp();
	  		menComp();
	  		
		try {
			
			fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}
	

}
