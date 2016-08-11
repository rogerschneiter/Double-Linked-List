package JRCollection;

public class JRList implements JRCollection {

	// Two fields for first and last node in our list implementation
	private JRNode first;
	private JRNode last;
	private JRNode tempNode;

	// Getters & Setters for all fields
	public JRNode getFirst() {
		return first;
	}

	private void setFirst(JRNode first) {
		this.first = first;
	}

	public JRNode getLast() {
		return last;
	}

	private void setLast(JRNode last) {
		this.last = last;
	}

	@Override
	public void add(String data) throws IndexOutOfBoundsException, NullPointerException {
		if (data != null && !data.equals("")) {
			if (this.isEmpty()) {
				JRNode jrn = new JRNode(data);
				this.setFirst(jrn);
				this.setLast(jrn);
			} else {
				JRNode jrn = new JRNode(data);
				this.getLast().setNext(jrn);
				jrn.setPrev(this.getLast());
				this.setLast(jrn);
			}
		} else {
			throw new NullPointerException("JRList NullPointer");
		}
	}

	@Override
	public void add(int index, String data) throws IndexOutOfBoundsException, NullPointerException {
		if (data != null && !data.equals("")) {
			if (index >= 0 && index <= this.size()) {
				if (index == 0 && this.size() != 0) {
					JRNode jrn = new JRNode(data);
					jrn.setNext(this.getFirst());
					this.getFirst().setPrev(jrn);
					this.setFirst(jrn);
				} else if (index == 0 && this.size() == 0) {
					JRNode jrn = new JRNode(data);
					this.setFirst(jrn);
					this.setLast(jrn);
				} else if (index == this.size()) {
					JRNode jrn = new JRNode(data);
					this.getLast().setNext(jrn);
					jrn.setPrev(this.getLast());
					this.setLast(jrn);
				} else {
					JRNode jrn = new JRNode(data);

					tempNode = this.getFirst();

					for (int i = 0; i < index; i++) {
						tempNode = tempNode.getNext();
					}

					jrn.setNext(tempNode);
					jrn.setPrev(tempNode.getPrev());
					tempNode.getPrev().setNext(jrn);
					tempNode.setPrev(jrn);
				}
			} else {
				throw new IndexOutOfBoundsException("JRList IndexOutOfBounds");
			}
		} else {
			throw new NullPointerException("JRList NullPointer");
		}
	}

	public void addAll(String... data) throws NullPointerException {
		if (data != null && data.length != 0) {
			for (String s : data) {
				if (s != null && !s.equals("")) {
					this.add(s);
				} else {
					continue;
				}
			}
		} else {
			throw new NullPointerException("JRList NullPointer");
		}
	}

	@Override
	public String get(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < this.size()) {
			tempNode = this.getFirst();

			for (int i = 0; i < index; i++) {
				tempNode = tempNode.getNext();
			}

			return tempNode.getContent();
		} else {
			throw new IndexOutOfBoundsException("JRList IndexOutOfBounds");
		}
	}

	@Override
	public boolean isEmpty() {
		if (first == null && last == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		if (index >= 0 && index < this.size()) {
			if (index == 0 && this.size() > 1) {
				this.setFirst(this.getFirst().getNext());
				this.getFirst().setPrev(null);
			} else if (index == 0 && this.size() == 1) {
				this.setFirst(null);
				this.setLast(null);
			} else if (index == this.size() - 1) {
				this.getLast().getPrev().setNext(null);
				this.setLast(this.getLast().getPrev());
			} else {
				tempNode = this.getFirst();

				for (int i = 0; i < index; i++) {
					tempNode = tempNode.getNext();
				}

				tempNode.getPrev().setNext(tempNode.getNext());
				tempNode.getNext().setPrev(tempNode.getPrev());
			}
		} else {
			throw new IndexOutOfBoundsException("JRList IndexOutOfBounds");
		}
	}

	@Override
	public int size() {
		int size = 1;

		if (this.getFirst() == null) {
			return 0;
		} else if (this.getFirst() == this.getLast()) {
			return 1;
		}

		tempNode = this.getFirst();

		while (tempNode.getNext() != null) {
			tempNode = tempNode.getNext();
			size++;
		}

		return size;
	}

	public void clear() {
		this.setFirst(null);
		this.setLast(null);
	}

	public boolean contains(String item) {
		if (item != null && !item.equals("")) {
			boolean contains = false;

			for (int i = 0; i < this.size(); i++) {
				if (this.get(i).equals(item)) {
					contains = true;
				}
			}

			return contains;
		} else {
			return false;
		}

	}

}
