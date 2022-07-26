package telcoProject.Type;

public class CableType {
	private int id;
	private String cableName;
	
	public CableType(int id, String cableName) {
		super();
		this.id = id;
		this.cableName = cableName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCableName() {
		return cableName;
	}
	public void setCableName(String cableName) {
		this.cableName = cableName;
	}
	
	
	
}
