package work;

public class Company {
 int n;	
 synchronized public void produce_item(int n) {
  this.n = n;
  System.out.println("Item produced " + this.n);
 }
 synchronized public int consume_item() {
  System.out.println("Item consumed " + this.n);
  return this.n;
 }
}
