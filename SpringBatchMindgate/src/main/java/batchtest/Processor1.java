package batchtest;

import org.springframework.batch.item.ItemProcessor;

public class Processor1 implements ItemProcessor<Employee, Employee>
{
//read==>process=>write
	@Override
	public Employee process(Employee item) throws Exception
	{
		System.out.println("Processing..." + item); 
    return item; 
	}

}
