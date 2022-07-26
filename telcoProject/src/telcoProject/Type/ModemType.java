package telcoProject.Type;

public class ModemType {
	private int id;
	private String modemModel;
	public ModemType(int id, String modemModel) {
		this.id = id;
		this.modemModel = modemModel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModemModel() {
		return modemModel;
	}
	public void setModemModel(String modemModel) {
		this.modemModel = modemModel;
	}
	
	
}
