package telcoProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import telcoProject.Entities.Address;
import telcoProject.Entities.Cable;
import telcoProject.Entities.CorporateCustomer;
import telcoProject.Entities.Customer;
import telcoProject.Entities.IndividualCustomer;
import telcoProject.Entities.Modem;
import telcoProject.Entities.Packet;
import telcoProject.Entities.Payment;
import telcoProject.Entities.Product;
import telcoProject.Entities.Service;
import telcoProject.Entities.Subscription;
import telcoProject.Entities.SubscriptionAddress;
import telcoProject.Type.CableType;
import telcoProject.Type.ModemType;
import telcoProject.Type.PacketType;
import telcoProject.Type.PaymentType;
import telcoProject.Type.ProductType;
import telcoProject.Type.ServiceType;

public class Main {

	public static void main(String[] args) {
		
		Address address = new Address();
		address.setAddressDetail("asdasd");
		address.setId(1);
		System.out.println(address + " " + address.getAddressDetail());
		
		CableType cableType = new CableType(1, "hdmi");
		ModemType modemType = new ModemType(1, "adsl");		
		PacketType packetType = new PacketType(1, "Öğrenci paketi");
		PaymentType paymentType = new PaymentType(1, "Kredi Kartı");
		ProductType productType1 = new ProductType(1, "Modem");
		ProductType productType2 = new ProductType(2, "Tivibu");
		ServiceType serviceType = new ServiceType(1, "Internet");
		
		
		List<ProductType> productTypes = new ArrayList<>();
		productTypes.add(productType1);
		productTypes.add(productType2);
		
		SubscriptionAddress subscriptionAddress = new SubscriptionAddress(null);
		
		Product product = new Product(1, "123", "Ferrari");
		Customer customer1 = new IndividualCustomer(1, "1234", "Ali", "Veli", "123456789");
		Customer customer2 = new CorporateCustomer(1, "1212", "111222", "Kodlama.io");
		Packet packet = new Packet(1, 12.50, packetType);
		Cable cable = new Cable(1, "50", cableType);
		Payment payment = new Payment(1, paymentType);
		Modem modem = new Modem(1, "111", "Huwaei", modemType);
		//Product -ProductType Fixlenecek
		Service service = new Service(1, serviceType, product);
		Subscription subscription= new Subscription(1,LocalDate.of(2022, 2, 2), null, packet, null, payment, service);
		
		
	}

}
