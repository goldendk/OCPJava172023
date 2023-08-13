package app1;

import module1package1.ExportedClassFromModule1;

import module1package1.SomeServiceInModule1;
import module2package1.PublicClassInModule2;
public class App1 {

    public static void main(String... args) {
        ExportedClassFromModule1 obj = new ExportedClassFromModule1();

        //Does ont fail in IntelliJ but fails during compilation.
        //PublicNonExportedClassInModule1 obj2 = new PublicNonExportedClassInModule1();
        PublicClassInModule2 publicClassInModule2 = new PublicClassInModule2();


        SomeServiceInModule1 service = new SomeServiceInModule1();
    }

}
