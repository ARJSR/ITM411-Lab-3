import java.util.Comparator;

public class MaleComparator implements Comparator<BankRecords>{

	@Override
	public int compare(BankRecords o1, BankRecords o2) {
		// compare objects
		int results = o1.getSex().compareTo(o2.getSex());
		if (results == 0) 
			results = o1.getRegion().compareTo(o2.getRegion());
		
		if (results == 0) {
			results = o1.getCar().compareTo(o2.getCar());
		}
		if (results == 0) {
			results = o1.getChildren() - (o2.getChildren());
		}
				
		return results;
	}

}
