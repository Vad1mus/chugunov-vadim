package ua.oop.khpi.chugunov05;

import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Arrays;


/**
 * This is class TaskContainer.
 * Class is iterable - can be iterated element by element.
 *
 * @author Chugunov Vadim
 */
public class TaskContainer implements Iterable<String> {
    /** Holding the elements. */
    private String[] buf = null;

    /**
     *The  Method that  concatenates all container elements into a string.
     * @return container in a string
     */
    @Override
    public String toString() {
        if (buf == null || buf.length == 0) {
            return null;
        } else {
            StringBuilder builder = new StringBuilder();
            for (String i : buf) {
                builder.append(i).append(' ');
            }
            return builder.toString();
        }
    }
    
    /**
    *  The override to add method for adding an elem of string array.
    *  @param str - string array
    */
   public void addElemOfArray(final String[] str) {
     for (String i : str) {
         this.add(i);
       }
   }
   
    /**
     * The Method that adding elem to the container.
     *  @param str - string to initialize a new container element
     */
    public void add(final String str) {
        if (buf == null) {
        	buf = new String[1];
        	buf[0] = str;
        } else {
        	buf = Arrays.copyOf(buf, buf.length + 1);
        	buf[buf.length - 1] = str;
        }
    }
    /**
     * The Method that resetting a container.
     */
    public void clear() {
    	buf = new String[0];
    }
    /**
     * The Method that removes element by string criteria.
     * @return false if removing cannot be done(no elements in container)
     *         true if element has been found and successfully deleted
     * @param str - string to specify the element to remove
     */
    public boolean remove(final String str) {
        if (buf == null || buf.length == 0) {
            return false;
        }
        String[] newBuf = new String[buf.length - 1];
        int index;
        for (index = 0; index < buf.length; index++) {

            if (buf[index].equals(str)) {
                break;
            } else if (index == buf.length - 1) {
                return false;
            }
        }
        int j = 0;
        for (int k = 0; k < buf.length; k++) {
            if (k == index) {
                continue;
            }
            newBuf[j++] = buf[k];
        }
        buf = Arrays.copyOf(newBuf, newBuf.length);
        return true;
    }
    /**
     *The  Method that converts container to an array.
     * @return an array of container elements
     */
    public String[] toArray() {
        if (buf == null) {
            return null;
        }
        return Arrays.copyOf(buf, buf.length);
    }
    /**
     *The  Method that receives the size of container.
     * @return current container size
     */
    public int size() {
        if (buf == null) {
            return 0;
        }
        return buf.length;
    }
    /**
     * The Method that checks a container elements.
     * @param str - string to find in a container
     * @return true if contains, false if does not contain
     */
    public boolean contains(final String str) {
        if (buf == null || buf.length == 0) {
            return false;
        }
        for (String i : buf) {
            if (i.equals(str)) {
                return true;
            }
        }
        return false;
    }
    /**
     *The  Method for checking the equality of two containers.
     * @param container - for comparing with another container
     * @return true if both containers are the same
     * false if they are different
     */
    public boolean containsAll(final TaskContainer container) {
        if (buf == null || buf.length == 0) {
            return false;
        }
        int equation = 0;
        String[] toCompare;
        toCompare = container.toArray();
        for (int i = 0; i < container.size(); i++) {
            if (this.contains(toCompare[i])) {
                equation++;
            }
        }
        return equation == container.size();
    }
    /**
     * The Method that creat's a iterator.
     * @return a new iterator to a Container object
     */
    @Override
    public TaskIterator iterator() {
        return new TaskIterator(buf);
    }
    /**
     * This is class TaskIterator.
     * Contains two fields of lower/higher bound of a container.
     * Contains methods for iterating over a container,
     * checking the existence of the next element and removing.
     * @author Chugunov Vadim
     */
    public class TaskIterator implements Iterator<String> {
        private int lowerB;
        private int higherB;
        
        /**
         * Defines values of lower and higher bound.
         * @param buf - array of container elements
         */
        TaskIterator(final String[] buf) {
            lowerB = -1;
            higherB = buf.length-1;
        }
        /**
         * The Method that checks the existence of the next element.
         * @return true if the next element exists
         * false if it doesn't exist
         */
        @Override
        public boolean hasNext() {
            return lowerB < higherB;
        }
        /**
         * The Method that  for moving further through the container.
         * @return (current!) iterated element
         */
        @Override
        public String next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            } else {
                lowerB++;
                return buf[lowerB];
            }
        }
        /**
         *The Method that for removing the current element from iteration.
         */
        @Override
        public void remove() {
            String[] copyBuf = Arrays.copyOf(buf,
                                                buf.length);
            buf = new String[buf.length - 1];
            int j = 0;
            for (int i = 0; i < copyBuf.length; i++) {
                if (i != lowerB) {
                    buf[j++] = copyBuf[i];
                }
            }
            higherB--;
        }
    }
}