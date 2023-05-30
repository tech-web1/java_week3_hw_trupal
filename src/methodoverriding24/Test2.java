package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {


        ChildClass.SBI s= new ChildClass.SBI();
        ChildClass.ICICI i =new ChildClass.ICICI();
        ChildClass.Axis a = new ChildClass.Axis();
        System.out.println("SBI Rate of Intertest:"+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest:"+i.getRateOfInterest());
        System.out.println("Axis Rate of Interest:"+a.getRateOfInterest());
    }
}
