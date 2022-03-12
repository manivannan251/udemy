package guru.springframework.sfgpetclinic.controllers;

public class IndexController {

    public String index(){

        return "index";
    }

    public String oupsHandler(){
        return "notimplemented";
    }
    
    public String getValue(int index) {
    	if(index==0)
    		throw new ValueNotFoundException();
    	
    	return "found value";
    }
    
}
