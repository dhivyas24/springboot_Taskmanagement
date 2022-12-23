package com.example.SpringBootApp;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
 

public interface TaskRepo extends JpaRepository<Task,Integer> {

	
	    List<Task> findAll();
	    
	    @Query(value = "SELECT * FROM task u where u.taskid= ?1", nativeQuery = true)
	    List<Task> findbystatus(String id);
	    

@Transactional
@Modifying
@Query(value = "Update task u set u.taskid = ?1 , u.taskholdername =?2 , u.taskdate = ?3  ,u.taskname=?4 ,u.taskstatus =?5 where u.taskid = ?6 ", nativeQuery = true)
void update(String tasksid,String taskholdername,String taskdate,String taskname,String taskstatus,String taskid);

@Modifying
@Transactional 
@Query(value = "DELETE FROM tasks t WHERE t.taskid= ?1 ", nativeQuery = true)
void deleteAllByIdInBatch(String id);

}