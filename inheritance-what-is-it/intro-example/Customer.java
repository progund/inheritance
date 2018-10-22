/* This class is everything an Object is, and then some...
 * To extend a class, is to inherit everything from that
 * class, with the option of adding stuff or changing
 * stuff you "inherit".
 */
public class Customer extends Object {
  
  private String name;
  private String email;

  public Customer(String name, String email) {
    this.name = name;
    this.email = email;
  }

  /* I actually "inherited" this method from Object,
   * but I want to change how the method behaves,
   * so I "override" the method and provide my own
   * implementation of it.
   */
  @Override
  public String toString() {
    return name + " <" + email + ">";
  }
}
