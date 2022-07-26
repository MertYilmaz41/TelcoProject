package telcoProject.Entities;

import telcoProject.Type.CableType;

public class Cable extends Product {
	private int id;
	private String cableMeter;
	private CableType cableType;
	
	public Cable(int id, String cableMeter, CableType cableType) {
		super();
		this.id = id;
		this.cableMeter = cableMeter;
		this.cableType = cableType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCableMeter() {
		return cableMeter;
	}

	public void setCableMeter(String cableMeter) {
		this.cableMeter = cableMeter;
	}

	public CableType getCableType() {
		return cableType;
	}

	public void setCableType(CableType cableType) {
		this.cableType = cableType;
	}
	
	
	
}
