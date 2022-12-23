package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





	@RestController
	@RequestMapping(path="/changestatus/{taskid}")
	public class update {	
		@Autowired TaskRepo ob;
		@PutMapping()
		    public String updatecar(@RequestBody Task log,@PathVariable("taskid") String taskid)
		    {
			
			

			String tasksid=log.getTaskid();
			String taskholdername=log.getTaskholdername();
			String taskdate=log.getTaskname();
			String taskname=log.getTaskname();
		    String taskstatus =log.getTaskstatus();
			ob.update( tasksid,taskholdername,taskdate,taskname,taskstatus,taskid);
			 
					 //ob.save(log);
			// return"success";
			return "successfully updated";
	}
		
	}


		