package OtrosTest;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		
		//String tipoFactor="EXENTO";
		String tipoFactor="TASA";

		String tasa="0.000000";
		
		
		if(tipoFactor.equals("EXENTO")) {
			System.out.println("IVA EXENTO");
		}
		BigDecimal tasaNum = new BigDecimal(tasa);
		if(tasaNum.compareTo(new BigDecimal("0"))==0) {
			System.out.println("IVA 0");
		}
		if(tasaNum.compareTo(new BigDecimal("0.16"))==0) {
			System.out.println("IVA 16");
		}
	}
}
