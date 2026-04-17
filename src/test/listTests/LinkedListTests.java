package listTests;

//java imports


//project imports
import structs.list.LinkedList;

public class LinkedListTests{

    private LinkedListTests(){
    }
    
    /**
     * TODO add javadoc
     */
    public static boolean addLastTest(){
        return false;
    }//TODO implement the addLastTest() method
    
    /**
     *TODO add javadoc
     */
    public static boolean addAtIndexTest(){
        return false;
    }//TODO implement the addAtIndexTest() method
    
    /**
     *TODO add javadoc
     */
    public static boolean addFirstTest(){
        //Arrange
        boolean test1;
        boolean test2;
        boolean test3;
        LinkedList<String> myList = new LinkedList<String>();
        
        //Act + assert
        myList.addFirst("D");
        test1 = myList.get(0).equals("D");
        
        myList.addFirst("C");
        myList.addFirst("B");
        myList.addFirst("A");

        test2 = myList.get(0).equals("D") != true;
        test3 = myList.get(1).equals("B");

        return test1 && test2 && test3;
    }
    
    /**
     *TODO add javadoc
     */
    public static boolean clearTest(){
        return false;
    }//TODO implement the clearTest() method

    /**
     *TODO add javadoc
     */
    public static boolean containsTest(){
        return false;
    }//TODO implement the containsTest() method
    
    /**
     *TODO add javadoc
     */
    public static boolean getTest(){
        return false;
    }//TODO implement the getTest() method

    /**
     *TODO add javadoc
     */
    public static boolean indexOfTest(){
        return false;
    }//TODO implement the indexOfTest() method
    
    /**
     *TODO add javadoc
     */
    public static boolean isEmptyTest(){
        return false;
    }//TODO implement the isEmptyTest() method

    /**
     *TODO add javadoc
     */
    public static boolean lastIndexOfTest(){
        return false;
    }//TODO implement the lastIndexOfTest() method

    /**
     *TODO add javadoc
     */
    public static boolean removeByIndexTest(){
        return false;
    }//TODO implement the removeByIndexTest() method

    /**
     *TODO add javadoc
     */
    public static boolean removeByElementTest(){
        return false;
    }//TODO implement the removeByElementTest() method

    /**
     *TODO add javadoc
     */
    public static boolean sizeTest(){
        return false;
    }//TODO implement the sizeTest() method

    /**
     *TODO add javadoc
     */
    public static boolean subListTest(){
        return false;
    }//TODO implement the subListTest() method

    /**
     *TODO add javadoc
     */
    public static boolean toStringTest(){
        return false;
    }//TODO implement the toStringTest() method


}


