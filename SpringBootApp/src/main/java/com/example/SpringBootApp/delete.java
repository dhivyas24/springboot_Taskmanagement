package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/task/{id}")

public class delete {

		@Autowired TaskRepo ob;
		@DeleteMapping()
		    public String deletebyid(@RequestBody String id)
		    {
			 
			
			 
						ob.deleteAllByIdInBatch(id);
						
					 
				
			return "deleted updated";
	}
		
	}

