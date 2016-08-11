package JRCollection;

public interface JRCollection {

	/**
	 * Append the data at the end of the list.
	 * 
	 * @param data
	 *            the data to add.
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range (index < 0 || index > size()).
	 * @throws NullPointerException
	 *             if the data is null.
	 */
	public void add(String data) throws IndexOutOfBoundsException,
			NullPointerException;

	/**
	 * Insert the data at the position of the list.
	 * 
	 * @param index
	 *            the position to add the element. The index of the first
	 *            position is 0. The index of the end is size.
	 * @param data
	 *            the data to add.
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range (index < 0 || index > size()).
	 * @throws NullPointerException
	 *             if the data is null.
	 */
	public void add(int index, String data) throws IndexOutOfBoundsException,
			NullPointerException;

	/**
	 * Gets the data of a given position.
	 * 
	 * @param index
	 *            the position. The index of the first position is 0. The index
	 *            of the last position is size-1.
	 * @return the data at the spezified position.
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range (index < 0 || index >= size()).
	 */
	public String get(int index) throws IndexOutOfBoundsException;

	/**
	 * Returns true if this list contains no elements.
	 * 
	 * @return true if this list contains no elements.
	 */
	public boolean isEmpty();

	/**
	 * Removes the element at the specified position in this list.
	 * @param index the index of the element to be removed. The index of the first position is 0. The index
	 *            of the last position is size-1.
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of range (index < 0 || index >= size()).
	 * 
	 */
	public void remove(int index) throws IndexOutOfBoundsException;

	/**
	 * Returns the number of elements in this list.
	 * @return the number of elements in this list.
	 */
	public int size();

}