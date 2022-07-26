package telcoProject.Entities;

import java.util.List;

import telcoProject.Type.PacketType;

public class Packet {
	private int id;
	private double price;
	private PacketType packetType;
	private List<Subscription> subscriptions;
	
	public Packet(int id, double price, PacketType packetType) {
		super();
		this.id = id;
		this.price = price;
		this.packetType = packetType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PacketType getPacketType() {
		return packetType;
	}

	public void setPacketType(PacketType packetType) {
		this.packetType = packetType;
	}

	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	

}
