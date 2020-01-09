package batchtest;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapper implements org.springframework.jdbc.core.RowMapper<Employee> 
{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException
	{
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setEno(rs.getInt("eno1"));
		e1.setName(rs.getString("name"));
		e1.setSalary(rs.getFloat("salary"));
		return e1;
}

}
