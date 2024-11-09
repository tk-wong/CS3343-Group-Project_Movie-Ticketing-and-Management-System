package Payment;

import ExternalAPI.ExternalAPI;

/**
 * OctopusPaymentFactory class
 * It is used to create OctopusPayment object
 */
public class OctopusPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPaymentMethod() {
        return new OctopusPayment();
    }

    /**
     * @param externalAPI ExternalAPI object to be used for payment 
     * @return Payment object
     */
    @Override
    public Payment createPaymentMethod(ExternalAPI externalAPI) {
        if (externalAPI == null) {
            return new OctopusPayment();
        }
        return new OctopusPayment(externalAPI);
    }

}
