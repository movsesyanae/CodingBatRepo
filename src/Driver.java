public class Driver {
    
    public static void main(String[] args){
        // to call a method belonging to the CodingBat class, we need to create an object of that type
        CodingBat codingBat = new CodingBat();
        System.out.println("codingBat.sleepIn(true, true) = " + codingBat.sleepIn(true, true));
        
        // However, to invoke a static method, we do not need to create an object of the class that it's defined in.
        // Instead, we can call the method as so:
        System.out.println("CodingBat.sleepInStaticVersion(true, true) = " + CodingBat.sleepInStaticVersion(true, true));
        // Notice to call the method, we write TheClassName.TheStaticMethodName()
    }
}
