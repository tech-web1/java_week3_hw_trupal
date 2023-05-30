package methodoverriding24;

public class ChildClass {
    static class SBI extends ParentClass.Bank{
        public int getRateOfInterest(){return 8;}
    }
    static class ICICI extends ParentClass.Bank{
        public int getRateOfInterest(){return 7;}
    }
    static class Axis extends ParentClass.Bank{
        public int getRateOfInterest(){return 9;}
    }
}
