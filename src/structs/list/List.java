package  structs.list;


//Java Library Imports
import java.lang.IndexOutOfBoundsException;

/**
 * This is the List interface <br>
 * Abstract Methods (See javadoc for more info on each one): <br>
 * <br>
 * void add(I toAdd) <br>
 * void add(I toAdd, int index) <br>
 * void clear() <br>
 * boolean contains(I element) <br>
 * <br>
 * @author Emmett James Kopczynski (emmettkopo@gmail.com)
 */
public interface List<I> {


    /**
     * the add(I toAdd) method adds the given element to the end of the list
     * @param toAdd - element to be added at the end of the list
     */
    public abstract void add(I toAdd);

    /**
     * the add(I toAdd, int index) method adds the given element at the given index
     * @throws IndexOutOfBoundsException -- if the given index is not in the bounds of the list
     */
    public abstract void add(I toAdd, int index) throws IndexOutOfBoundsException;

    /**
     * the clear() method removes all elements in the list 
     */
    public abstract void clear();


    /**
     * the contains(I element) method returns true if the given argument is in the list, and false otherwise
     * @param element - the element that we are looking for in the list
     * @return - returns true if the element is in the list at least once, and false if it does not
     */
    public abstract boolean contains(I element); 


}
