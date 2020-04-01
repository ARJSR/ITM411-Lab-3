import java.util.Comparator;

public class SexComparator implements Comparator<BankRecords>{

	@Override
	public int compare(BankRecords o1, BankRecords o2) {
		// compare objects
		int result = o1.getSex().compareTo(o2.getSex());
		if (result == 0) {
			result = (int) (o1.getIncome() - o2.getIncome());
		}
		return result;
		

	}
	
}
