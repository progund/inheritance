public class CustomerDemo {
  public static void main(String[] args) {
    Customer demoCustomer = new Customer("Bob", "bob@email.com");
    String customerTextSummary = demoCustomer.toString();
    System.out.println(customerTextSummary);
    // Or even:
    System.out.println(demoCustomer);
    // because println will in the end call toString()
    // for us - and toString() is present in all objects.
  }
}
