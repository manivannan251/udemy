package guru.springframework.sfgpetclinic.fauxspring;

import java.util.HashMap;
import java.util.Map;

public class ModelMapImpl implements Model {
	
	private Map<String,Object> modelMap = new HashMap<>();

	@Override
	public void addAttribute(String key, Object o) {
		modelMap.put(key, o);
		
	}

	@Override
	public void addAttribute(Object o) {
		// TODO Auto-generated method stub
		
	}

	public Map<String, Object> getModelMap() {
		return modelMap;
	}
	
	

}
