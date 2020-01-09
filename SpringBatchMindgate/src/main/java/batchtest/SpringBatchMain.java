package batchtest;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBatchMain {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String springConfig  =  "/JobReport.xml" ;  

        // Creating the application context object  
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext(springConfig);  

        // Creating the job launcher 
        //from Context1.xml
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher"); 
      System.out.println("Launch: "+jobLauncher);

      // Creating the job
      //from JobReport.xml
      Job job = (Job) context.getBean("helloWorldJob"); 
      System.out.println("Job: "+job);

      // Executing the JOB 
      JobExecution execution = jobLauncher.run(job, 
    		  new JobParameters()); 
      System.out.println("Execution: "+execution);
      System.out.println("Exit Status : " + execution.getStatus()); 

	}
}
