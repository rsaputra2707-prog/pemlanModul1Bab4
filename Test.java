package encapsulation1;
public class Test {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.setName("Enkapsulasi");
        // s1.getName("Enkapsulasi");
        // s1.setMark("90");
        s1.setMark(90);
        System.out.println("s1Name is " + s1.getName());
        System.out.println("s1Mark is " + s1.getMark());
        // System.out.println("s1Mark is " + s1.setName());
        // System.out.println("s1Mark is " + s1.setMark());
        // System.out.println("Name  dan Mark " + name +" " +  mark );
    }
}
