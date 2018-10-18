package Validations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Cart;
import model.Category;
import model.User;

public class CartValidation {

	private Cart k = null;
	private Map<String, List<String>> errorMap = new HashMap<String, List<String>>();

	public CartValidation(Cart k) {
		super();
		this.k = k;
	}

	private void addEntryToMap(String key, String errorMsg) {

		if (this.errorMap.get(key) == null) {
			List<String> list = new ArrayList<String>();

			list.add(errorMsg);

			this.errorMap.put(key, list);
		} else {

			List<String> list = this.errorMap.get(key);

			list.add(errorMsg);

			this.errorMap.put(key, list);
		}

	}

	
	private void checkCartEmail() {

		Pattern p = Pattern.compile("^.+$");

		Matcher m = p.matcher(k.getEmail());

		if (!m.matches()) {

			this.addEntryToMap("email", "Email Cannot be Empty");
			}
		
			
		}
	
				
		 
	public Map<String, List<String>> getErrorMap() {
		
		
		checkCartEmail();

		return this.errorMap;
	}

	

}

