package solid;


interface Cricket{
	public void batting(String y);
}
interface Football{
	public void attack(String y);
}
public class Student implements Cricket {

	@Override
	public void batting(String y) {
		System.out.println(y+" plays cricket");
	}

}

 class Student2 implements Football {

	@Override
	public void attack(String y) {
		System.out.println(y+" plays football");
	}

}
 class student3 extends Student2
 {
	 public void attack(String y)
	 {
		 System.out.println(y+" plays football");
	 }
	 public void defend(String y)
	 {
		 System.out.println(y+" can defend");
	 }
 }
 