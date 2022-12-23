package com.example.SpringBootApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


	@Entity
	public class Task {

	    @Id

	    @GeneratedValue(strategy = GenerationType.AUTO)
	   private int id;
		private String taskid,taskholdername,taskdate,taskname,taskstatus;
		Task() {}

		Task(String taskid,String taskholdername,String taskdate,String taskname,String taskstatus)

		    {
		   this.setTaskid(taskid);
		   this.setTaskholdername(taskholdername);
		   this.setTaskdate(taskdate);
		   this.setTaskname(taskdate);
		   this.setTaskstatus(taskstatus);

		
		
	}

		public String getTaskname() {
			return taskname;
		}

		public void setTaskname(String taskname) {
			this.taskname = taskname;
		}

		public String getTaskid() {
			return taskid;
		}

		public void setTaskid(String taskid) {
			this.taskid = taskid;
		}

		public String getTaskholdername() {
			return taskholdername;
		}

		public void setTaskholdername(String taskholdername) {
			this.taskholdername = taskholdername;
		}

		public String getTaskstatus() {
			return taskstatus;
		}

		public void setTaskstatus(String taskstatus) {
			this.taskstatus = taskstatus;
		}

		public String getTaskdate() {
			return taskdate;
		}

		public void setTaskdate(String taskdate) {
			this.taskdate = taskdate;
		}

	}
