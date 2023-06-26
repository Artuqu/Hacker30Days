package package2;

import package1.FirstPackage;

public class SecondTest extends FirstPackage{

    public static void main(String[] args) {
        SecondTest st = new SecondTest();
        FirstPackage firstPackage = new FirstPackage();
        
        int publicInt = firstPackage.publicInt;
        System.out.println(publicInt);

    }
}
