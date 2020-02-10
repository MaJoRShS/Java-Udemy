package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;

	/*
	 * Aqui tem uma parada interessante como é uma lista eu não posso colocar ele
	 * como parametro do construtor ai eu preciso mesmo iniciar a lista antes e
	 * depois eu uso ela onde eu quiser ou precisar
	 */
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
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

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	// só tem o GET porque eu não posso substituir a lista e se eu deixar o SET ia
	// ser uma nova lista
	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	/*
	 * Aqui ele setou o CALENDAR, ai pegou a data do contrato e setou como a data do
	 * calendario ai ele pega separadamente o ANO e o MÊS valida se o ano que veio
	 * de parâmetro e o ano do contrato são iguais faz o mesmo com o mês e só ai
	 * soma.
	 * 
	 * O Bizu é que se tem um método para ser utilizado na composição eu devo
	 * utilizar
	 */
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}

		return sum;

	}

}
