package task_1;
class Android 
{
    String os,ram,Launchdate;
    Android(){}
    public Android(String os ,String ram, String Launchdate){
        this.os=os;
        this.ram=ram;
        this.Launchdate=Launchdate;
    }
    void display() 
    {
        System.out.println("The Operating System Is: " + os);
        System.out.println("The Amount of Ram Is: " + ram);
        System.out.println("Launch Date: " + Launchdate);
        System.out.println("----------------------------------");
        System.out.println("");
        
    }
}

public class Task_1 {
    public static void main(String[] args) {
        Android phone1 = new Android();
        phone1.display();
        Android phone2 = new Android("Nougat (7.0)","4GB","2017");
        phone2.display();
        Android phone3 = new Android("Oreo (8.0)","6GB","2018");
        phone3.display();
    }
}

