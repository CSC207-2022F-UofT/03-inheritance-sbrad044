/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
public class CrossbodyBag extends Bag {

    /**
     * Creates a new CrossbodyBag with the given color,
     * capacity, and number of straps.
     *
     * @param colour : the colour of the bag
     * @param capacity : the capacity of the bag
     * @param numberOfStraps : the number of straps the bag has
     */

    private int numberOfStraps;

    public CrossbodyBag(String colour, int capacity, int numberOfStraps) {
        /**
         * This is how we call the parent's constructor
         * The Python equivalent is super().__init__(...)
         */
        super(colour, capacity);
        this.numberOfStraps = numberOfStraps;
    }

    public int getNumberOfStraps() {
        return this.numberOfStraps;
    }

    @Override
    public String toString() {
        return this.color + " Crossbody Bag with " + numberOfStraps + " straps (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    @Override
    public void enhance() {
        super.increaseCapacity(2);
    }
}
/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */
