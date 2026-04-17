package  structs.list;


//Java Library Imports
import java.lang.IndexOutOfBoundsException;

/**
 * This is the List interface <br>
 * @param <I> - the type of elements the list contains
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
     * @param toAdd - the element to be added
     * @param index - the index where the element will be added
     * @throws IndexOutOfBoundsException -- if the given index is not in the bounds of the list
     */
    public abstract void add(I toAdd, int index) throws IndexOutOfBoundsException;
    
    /**
     * adds the given element to the beginning of the list
     * @param toAdd - the element to be added
     */
    public abstract void addFirst(I toAdd);

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
    
    /**
     * the get(int index) method returns the data at the given index
     * @param index - the index we are getting data from
     */
    public abstract I get(int index) throws IndexOutOfBoundsException;

    /**
     * the indexOf(I element) method returns the index of the first instance of the passed element
     * @param element - the element being searched for
     * @return - the index of the element being searched for, -1 if it isn't in the list
     */
    public abstract int indexOf(I element);
    
    /**
     * the isEmpty() method returns true if the list contains no elements
     * @return - true if empty, false if not
     */
    public abstract boolean isEmpty();

    /**
     * the lastIndexOf(I element) method returns the index of the last copy of the given element in the list
     * @param element - the element being searched for
     * @return - the last index of the element in the list, or -1 if it is not found in the list
     */
    public abstract int lastIndexOf(I element);

    /**
     * the remove(int index) method removes the element at the given index 
     * @param index - the index of the element to be removed
     * @return - the element being removed
     * @throws IndexOutOfBoundsException - if the given index is not in the bounds of the list
     */
    public abstract I remove(int index) throws IndexOutOfBoundsException;
    
    /**
     * the remove(I element) method removes the first occurance of the given element if it is present
     * @param element - the element to be reomoved
     * @return - the index of the removed element, if the element was not in the list, returns -1
     */
    public abstract int remove(I element);

    /**
     * the size() method returns the size of the list
     * @return - the size of the list as an integer
     */
    public abstract int size();

    /**
     * the subList(int fromIndex, int toIndex) method returns a sublist from the first given index to the last given index inclusive
     * @param fromIndex - first element for the sublist
     * @param toIndex - last element of the sublist
     * @return - a new list containing all the elements between and including fromIndex and toIndex
     * @throws IndexOutOfBoundsException - if one or both given indexes are not in the bounds of the list
     */
    public abstract List<I> subList(int fromIndex, int toIndex) throws IndexOutOfBoundsException;
}
