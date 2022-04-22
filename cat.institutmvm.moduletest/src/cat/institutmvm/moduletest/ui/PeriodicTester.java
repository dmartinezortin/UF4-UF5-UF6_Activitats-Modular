package cat.institutmvm.moduletest.ui;


import cat.institutmvm.moduletest.entities.Periodic;

public class PeriodicTester {
    public static void main(String[] args){
        Periodic p = new Periodic("R232", "ns", "titular");
        System.out.println(p.visualitzar());
    }
}
