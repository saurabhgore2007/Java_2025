package com.saurabh.Ass3Ex4;

public class Contracts {

	protected int contract_id;
	protected String contract_person_name;
	protected Labor labor_obj;
	protected Lorry lorry_obj;
	
	public Contracts() 
	{
		this.contract_id = 0;
		this.contract_person_name = "Unknown Name";
		this.labor_obj = new Labor();
		this.lorry_obj = new Lorry();

	}
	
	public Contracts(int contract_id,String contract_person_name,Labor labor_obj,Lorry lorry_obj) 
	{
		this.contract_id = contract_id;
		this.contract_person_name = contract_person_name;
		this.labor_obj = labor_obj;
		this.lorry_obj = lorry_obj;
	}
	
	@Override
	public String toString() {
		return String.format("%5d %20s %20s %20s %20d", contract_id, contract_person_name, labor_obj.getLabor(), lorry_obj.getLorry(),lorry_obj.lorryNumber()); 
	}
}

