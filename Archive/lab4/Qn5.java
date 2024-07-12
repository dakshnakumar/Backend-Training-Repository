package lab4;

// 1) Creation of interfaces
interface Transport{
  public abstract void fourWheel();
}


//2) Creation of another interfaces
interface Vehicle extends Transport{

    public abstract void turnON();
    public abstract void turnOFF();
}


//3 & 5) creation of class by extendiong multiple interfaces
public class Qn5 implements Transport , Vehicle{


    @Override
    public void turnON(){
        System.out.println("Turned ON method is created");
    }

    @Override
    public void turnOFF(){
        System.out.println("Turned OFF method is created");
    }

    @Override
    public void fourWheel(){
        System.out.println("FourWheel is called from Qn5 class");
    }

    public static void main(String[] args) {

        //4 & 6)creation of reference variable of an interfaces
        Transport interfaceName = new SampleClass();

        // 7) call the method of the object
        interfaceName.fourWheel();
    }

}

class SampleClass extends Qn5 implements Transport{

    @Override
    public void fourWheel(){
        System.out.println("Interface Transport is called from sampleClass");
    }
}


