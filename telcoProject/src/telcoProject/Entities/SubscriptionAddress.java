package telcoProject.Entities;

public class SubscriptionAddress extends Address {
	private Subscription subscription;

	public SubscriptionAddress(Subscription subscription) {
		this.subscription = subscription;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
	
	
}
