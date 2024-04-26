package EceptionPractice;
class TaxCalculator{
	public double calculateTax(String empname, boolean isIndian,double empSal)throws EmployeeNameInvalidException,CountryNotValidException,TaxNotEligibleException {
		double taxAmount=0;
		if(isIndian==false) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
			
		}
		else if(empname.equals(null)) {
			throw new EmployeeNameInvalidException("Name must not be null");
		}
		else if(empSal<10000) {
			throw new TaxNotEligibleException("Tax not eligible");
		}
		else if(empSal>=100000) {
			taxAmount=empSal*8/100;
		}
		else if(empSal>=50000) {
			taxAmount=empSal*6/100;
		}
		else if(empSal>=30000) {
			taxAmount=empSal*5/100;
		}
		else if(empSal>=10000) {
			taxAmount=empSal*4/100;
		}
		
		return taxAmount;
	}
}
public class CalculatorSimulator {
	
	public static void main(String[] args) {
		TaxCalculator tc=new TaxCalculator();
		try {
			System.out.println(tc.calculateTax("sagnik", true, 50000));
		}catch (CountryNotValidException e) {
			System.out.println(e.getMessage());
		}catch (EmployeeNameInvalidException e) {
			System.out.println(e.getMessage());
		}catch (TaxNotEligibleException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
