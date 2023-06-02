package Assignment3.Problem1;

    public class Main {
        public static void main(String[] args) {
            Customer custom1 = new Customer("Mr X", "Y", "25001");
            custom1.setShippingAddress(new Address("Olaya Street", "Riyadh", "RA", "635214"));
            custom1.setBillingAddress(new Address("Olaya Street", "Riyadh", "RA", "635214"));

            Customer custom2 = new Customer("Omar", "Asad", "25002");
            custom2.setShippingAddress(new Address("Oraba Street", "Riyadh", "RA", "635215"));
            custom2.setBillingAddress(new Address("Oraba Street", "Riyadh", "RA", "635215"));

            Customer custom3 = new Customer("Ahmed", "mae", "585896");
            custom3.setShippingAddress(new Address("Shifa Street", "Jeddah", "JD", "285896"));
            custom3.setBillingAddress(new Address("Shifa Street", "Jeddah", "JD", "285896"));

            Customer[] customers = {custom1, custom2, custom3};

            for (Customer customer : customers) {
                if (customer.getShippingAddress().getCity().equals("Jeddah")) {
                    System.out.println(customer.getFirstName());
                }
            }
        }
    }

