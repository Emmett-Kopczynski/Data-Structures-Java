//project imports
import static testUtils.Results.test;
import static listTests.LinkedListTests.*;

public class TestMain{
    


    /**
     *This method tests all methodds and classes in the testUtil directory
     */
    public static boolean testUtilTests(){
        boolean allTests = true;

        System.out.println("\n" + 
                "testUtilTests:\n" + 
                "\t" + test(true, "test()") + "\n" + 
                "\t\t" + test(allTests, "all-testUtilTests"));
        return allTests;
    }

    /**
     * the unit tests for LinkedLists
     */
    public static boolean TestLinkedList(){
        //The booleans
        boolean allTests = addLastTest();
        allTests &= addAtIndexTest();
        allTests &= addFirstTest();
        allTests &= clearTest();
        allTests &= containsTest();
        allTests &= getTest();
        allTests &= indexOfTest();
        allTests &= isEmptyTest();
        allTests &= lastIndexOfTest();
        allTests &= removeByIndexTest();
        allTests &= removeByElementTest();
        allTests &= sizeTest();
        allTests &= subListTest();
        allTests &= toStringTest();

        //The text display
        System.out.println("\n" + 
                "TestLinkedList:\n" +
                "\t" + test(addLastTest(),"addLastTest()") + 
                "\n\t" + test(addAtIndexTest(),"addAtIndexTest()") + 
                "\n\t" + test(addFirstTest(), "addFirstTest()") +
                "\n\t" + test(clearTest(),"clearTest()") + 
                "\n\t" + test(containsTest(),"containsTest()") +
                "\n\t" + test(getTest(), "getTest()") +
                "\n\t" + test(indexOfTest(),"indexOfTest()") + 
                "\n\t" + test(isEmptyTest(),"isEmptyTest()") + 
                "\n\t" + test(lastIndexOfTest(),"lastIndexOfTest()") + 
                "\n\t" + test(removeByIndexTest(), "removeByIndexTest()") + 
                "\n\t" + test(removeByElementTest(), "removeByElementTest()" ) + 
                "\n\t" + test(sizeTest(), "sizeTest()") + 
                "\n\t" + test(subListTest(), "subListTest()") +
                "\n\t" + test(toStringTest(), "toStringTest()") + 
                "\n\t\t" + test(allTests, "all-LinkedListTest"));


        return allTests;
    }



    public static void main(String args[]){

        boolean allTestsGlobal = testUtilTests();
        allTestsGlobal &= TestLinkedList();


        System.out.println("\n\n\n" + test(allTestsGlobal, "allTests") + "\n");

    }
    

}



