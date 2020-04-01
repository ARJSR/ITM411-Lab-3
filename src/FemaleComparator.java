import java.util.Comparator;

public class FemaleComparator implements Comparator<BankRecords> {

	@Override
	public int compare(BankRecords o1, BankRecords o2) {
		// compare gender
		int results = o1.getSex().compareTo(o2.getSex());
		if (results == 0) {
			results = o1.getSave_act().compareTo(o2.getSave_act());
		if (results == 0) {
			results = o1.getMortgage().compareTo(o2.getMortgage());
		}
		
		}
		return results;
	}
	
	

}
