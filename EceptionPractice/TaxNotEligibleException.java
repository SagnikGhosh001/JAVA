package EceptionPractice;

public class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(String msg) {
		super(msg);
	}
}