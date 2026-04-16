import structs.list.List;
import static testUtils.Results.test;

public class TestMain{


    public static boolean testUtilTests(){
        boolean allTests = true;

        System.out.println("\n" + 
                "testUtilTests:\n" + 
                "\t" + test(true, "test()"));
        
        System.out.println("\t" + test(allTests, "all-testUtilTests"));
        return allTests;
        }



    public static void main(String args[]){

        boolean allTestsGlobal = testUtilTests();



        System.out.println("\n\n\n" + test(allTestsGlobal, "allTests") + "\n\n\n");

    }
    

}



