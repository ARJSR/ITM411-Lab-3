import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankRecords extends Client{

		static int SIZE = 600;
	//array for BankRecords objects
		static BankRecords robjs[] = new BankRecords[SIZE];
		
		//Arraylist will set the rows and columns
		static ArrayList<List<String>>array = new ArrayList<>();
	
	//fields
		private String id;
		private int age;
		private String sex;
		private String region;
		private double income;
		private String married;
		private int children;
		private String car;
		private String save_act;
		private String current_act;
		private String mortgage;
		private String pep;
		
		@Override
		public void readData() {
		 BufferedReader br = null; 
		
		//initialize object and set file path
		try {
			br = new BufferedReader(new FileReader (new File("bank-Detail (2).csv")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String line;
		
		//read records in file
		try {
			while((line = br.readLine())!= null)
			{
				
				//place comma into list stored in array
				array.add(Arrays.asList(line.split(",")));
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		processData();//call function to process data
	}
	 
	 @Override
	 public void processData() {
	 	
		 //create an index for array iteration
		 int index = 0;
		 
		 //For each loop that will PASS in setters
		 for(List<String> rowData: array) {
			 //initialize the array
			 robjs[index] = new BankRecords();
			 //call setters
			 robjs[index].setId(rowData.get(0));
			 robjs[index].setAge(Integer.parseInt(rowData.get(1)));
			 robjs[index].setSex(rowData.get(2));
			 robjs[index].setRegion(rowData.get(3));
			 robjs[index].setIncome(Double.parseDouble(rowData.get(4)));
			 robjs[index].setMortgage(rowData.get(5));
			 robjs[index].setChildren(Integer.parseInt(rowData.get(6)));
			 robjs[index].setCar(rowData.get(7));
			 robjs[index].setSave_act(rowData.get(8));
			 
			 //increment through loop
			 index++;
			
	 }
	 }

		 //print results
		// printData();
	 //}

	 //method to format and print processed results
	// @Override
	 //public void printData() {
	 	
		 //set heading
		// System.out.println("ID\t\tAGE\t  SEX\t  REGION\t  INCOME\tMORTGAGE");
		 //System.out.println();
	 	
		 //for loop to format and print data read and processed
		 //for(int i = 0; i<=SIZE; i++)
		 //{
			// String s=String.format("%s\t%10d\t%7s\t%10s\t%10.2f\t%5s", robjs[i].getId(), robjs[i].getAge(),
				//	 robjs[i].getSex(), robjs[i].getRegion(), robjs[i].getIncome(), robjs[i].getMortgage());
			 /////System.out.println();
			 //System.out.println(s);
		// }
	// }
	//@Override
	//public void processData()
	 //{
		 //create index for array interation
		 //int index = 0;
		 //For each loop
		 //and cycle through records 
		 
		 
	 //}
	 
	
	// public static void main(String[] args) {
			
		//	BankRecords br = new BankRecords();
			//br.readData();	

	// }
	
/**
 * @return the id
 */
public String getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}

/**
 * @return the age
 */
public int getAge() {
	return age;
}

/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}

/**
 * @return the sex
 */
public String getSex() {
	return sex;
}

/**
 * @param sex the sex to set
 */
public void setSex(String sex) {
	this.sex = sex;
}

/**
 * @return the region
 */
public String getRegion() {
	return region;
}

/**
 * @param region the region to set
 */
public void setRegion(String region) {
	this.region = region;
}

/**
 * @return the income
 */
public double getIncome() {
	return income;
}

/**
 * @param income the income to set
 */
public void setIncome(double income) {
	this.income = income;
}

/**
 * @return the married
 */
public String getMarried() {
	return married;
}

/**
 * @param married the married to set
 */
public void setMarried(String married) {
	this.married = married;
}

/**
 * @return the children
 */
public int getChildren() {
	return children;
}

/**
 * @param children the children to set
 */
public void setChildren(int children) {
	this.children = children;
}

/**
 * @return the car
 */
public String getCar() {
	return car;
}

/**
 * @param car the car to set
 */
public void setCar(String car) {
	this.car = car;
}

/**
 * @return the save_act
 */
public String getSave_act() {
	return save_act;
}

/**
 * @param save_act the save_act to set
 */
public void setSave_act(String save_act) {
	this.save_act = save_act;
}

/**
 * @return the current_act
 */
public String getCurrent_act() {
	return current_act;
}

/**
 * @param current_act the current_act to set
 */
public void setCurrent_act(String current_act) {
	this.current_act = current_act;
}

/**
 * @return the mortgage
 */
public String getMortgage() {
	return mortgage;
}

/**
 * @param mortgage the mortgage to set
 */
public void setMortgage(String mortgage) {
	this.mortgage = mortgage;
}

/**
 * @return the pep
 */
public String getPep() {
	return pep;
}

/**
 * @param pep the pep to set
 */
public void setPep(String pep) {
	this.pep = pep;
}

}