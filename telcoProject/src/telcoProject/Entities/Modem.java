package telcoProject.Entities;

import telcoProject.Type.ModemType;

public class Modem extends Product {
	
	private ModemType modemType;

	public Modem(int id, String serialNumber, String brand, ModemType modemType) {
		super(id, serialNumber, brand);
		this.modemType = modemType;
	}

	public ModemType getModemType() {
		return modemType;
	}

	public void setModemType(ModemType modemType) {
		this.modemType = modemType;
	}
	
	
}
