package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/saveproduct")
public class save {

@Autowired TaskRepo ob;

@PostMapping()
	public <S> String savetask(@RequestBody Task log)
	{
	Task a= new Task();
	
	 String taskid = log.getTaskid();
	 String taskholdername=log.getTaskholdername();
	 String taskname=log.getTaskname();
	 String taskdate = log.getTaskstatus();
	 String taskstatus =log.getTaskstatus();
	 a.setTaskid(taskid);
	 a.setTaskholdername(taskholdername);
	 a.setTaskdate(taskdate);
	 a.setTaskname(taskname);
	 a.setTaskstatus(taskstatus);
 Task first = new Task(taskid,taskholdername,taskdate,taskname,taskstatus);
	ob.save(first);
	
return "saved successfully";
//return "saved successfully";
	
}
}
  