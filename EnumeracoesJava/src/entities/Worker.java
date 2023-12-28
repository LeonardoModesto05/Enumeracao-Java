package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private static  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private String name;
	private WorkerLevel level;
	private Double salary;
	
	private Department department;
	private List <HourContract> Contracts = new ArrayList<>( );
	public Worker () {
		
	}
	
	public Worker (String name, WorkerLevel level, Double salary, Department department )
	{
		this.name = name;
		this.level = level;
		this.salary = salary;
		this.department = department;	
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public List<HourContract> getContracts()
	{
		return Contracts;
	}
	public void addContract(HourContract contract)
	{
		Contracts.add(contract);
	}
	public void removeContract(HourContract contract)
	{
		Contracts.remove(contract);
	}
	public double income (int year, int month)
	{
		Calendar cal = Calendar.getInstance();
		double sum = salary;
		for (HourContract c : Contracts)
		{
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month)
			{
				sum += c.totalValue();
			}
		}
			return sum;
	}

}
