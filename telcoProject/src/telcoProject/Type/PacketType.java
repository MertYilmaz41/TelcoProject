package telcoProject.Type;

public class PacketType {
	private int id;
	private String packetName;
	
	public PacketType(int id, String packetName) {
		this.id = id;
		this.packetName = packetName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPacketName() {
		return packetName;
	}

	public void setPacketName(String packetName) {
		this.packetName = packetName;
	}
	
	
}
