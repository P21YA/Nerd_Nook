package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndiaConstants {
	
	public final static String US = "INDIA";
	
	public final static Map<String, String> mapOfUSStates = new HashMap<String, String>() {
		{
			            put("AN", "Andaman and Nicobar Islands");
			            put("AP", "Andhra Pradesh");
			            put("AR", "Arunachal Pradesh");
			            put("AS", "Assam");
			            put("BR", "Bihar");
			            put("CH", "Chandigarh");
			            put("CT", "Chhattisgarh");
			            put("DN", "Dadra and Nagar Haveli");
			            put("DD", "Daman and Diu");
			            put("DL", "Delhi");
			            put("GA", "Goa");
			            put("GJ", "Gujarat");
			            put("HR", "Haryana");
			            put("HP", "Himachal Pradesh");
			            put("JK", "Jammu and Kashmir");
			            put("JH", "Jharkhand");
			            put("KA", "Karnataka");
			            put("KL", "Kerala");
			            put("LD", "Lakshadweep");
			            put("MP", "Madhya Pradesh");
			            put("MH", "Maharashtra");
			            put("MN", "Manipur");
			            put("ML", "Meghalaya");
			            put("MZ", "Mizoram");
			            put("NL", "Nagaland");
			            put("OR", "Odisha");
			            put("PY", "Puducherry");
			            put("PB", "Punjab");
			            put("RJ", "Rajasthan");
			            put("SK", "Sikkim");
			            put("TN", "Tamil Nadu");
			            put("TG", "Telangana");
			            put("TR", "Tripura");
			            put("UP", "Uttar Pradesh");
			            put("UT", "Uttarakhand");
			            put("WB", "West Bengal");
			
            
		}
	};
	
	public final static List<String> listOfUSStatesCode = new ArrayList<>(mapOfUSStates.keySet());
	public final static List<String> listOfUSStatesName = new ArrayList<>(mapOfUSStates.values());

}
