package JRCollection;

public class JRTest {

	public static void main(String[] args) {

		JRList jrl = new JRList();
		System.out.println("JRList Test: 11.08.16\nADD/SIZE:\n");
		System.out.println("Size: " + jrl.size());

		System.out.println("--------\nAdd: Testdata 1 - 3");
		jrl.add("Testdata 1");
		jrl.add("Testdata 2");
		jrl.add("Testdata 3");

		System.out.println("--------\nSize: " + jrl.size());
		System.out.println("--------\nOutput:");

		for (int i = 0; i < jrl.size(); i++) {
			System.out.println(jrl.get(i));
		}

		System.out.println("--------\nAddAll: Testdata 1 - 3");
		jrl.clear();
		jrl.addAll("Testdata 1", "Testdata 2", "Testdata 3");

		System.out.println("--------\nSize: " + jrl.size());
		System.out.println("--------\nOutput:");

		for (int i = 0; i < jrl.size(); i++) {
			System.out.println(jrl.get(i));
		}

		System.out.println("--------\nAdd: Testdata 0 at index: 0");
		jrl.add(0, "Testdata 0");
		for (int i = 0; i < jrl.size(); i++) {
			System.out.println(jrl.get(i));
		}

		System.out.println("--------\nAdd: Testdata 4 at index: 4");
		jrl.add(4, "Testdata 4");
		for (int i = 0; i < jrl.size(); i++) {
			System.out.println(jrl.get(i));
		}

		System.out.println("--------\nSize: " + jrl.size());
		System.out.println("\nREMOVE/EMPTY/CONTAINS:\n");

		System.out.println("--------\nSize: " + jrl.size());
		System.out.println("--------\nRemove: From index: 0");
		jrl.remove(0);
		for (int i = 0; i < jrl.size(); i++) {
			System.out.println(jrl.get(i));
		}

		System.out.println("--------\nRemove: From index: 1");
		jrl.remove(1);
		for (int i = 0; i < jrl.size(); i++) {
			System.out.println(jrl.get(i));
		}

		System.out.println("--------\nRemove: From index: 2");
		jrl.remove(2);
		for (int i = 0; i < jrl.size(); i++) {
			System.out.println(jrl.get(i));
		}

		System.out.println("--------\nClear");
		jrl.clear();
		for (int i = 0; i < jrl.size(); i++) {
			System.out.println(jrl.get(i));
		}

		jrl.add("Hallo");
		jrl.add("Velo");
		jrl.add("Auto");

		System.out.println("--------\nContains Velo?");
		for (int i = 0; i < jrl.size(); i++) {
			System.out.println(jrl.get(i));
		}

		System.out.println("\n" + jrl.contains("Velo"));
		System.out.println("--------\nContains Flugzeug?");
		for (int i = 0; i < jrl.size(); i++) {
			System.out.println(jrl.get(i));
		}

		System.out.println("\n" + jrl.contains("Flugzeug"));

		System.out.println("--------\nSize: " + jrl.size());
		System.out.println("--------\nEmpty: " + jrl.isEmpty());

		System.out.println("\nEXCEPTIONS:\n");
		System.out.println("--------\nException: IndexOutOfBoundsException\n");

		System.out.println("1. JRList.get(2)");
		try {
			jrl.get(2);
		} catch (IndexOutOfBoundsException ioob) {
			System.out.println(ioob.getMessage() + "\n");
		}

		System.out.println("1. JRList.remove(2)");
		try {
			jrl.remove(2);
		} catch (IndexOutOfBoundsException ioob) {
			System.out.println(ioob.getMessage() + "\n");
		}

		System.out.println("1. JRList.add(2, \"Hallo\")");
		try {
			jrl.add(2, "Hallo");
		} catch (IndexOutOfBoundsException ioob) {
			System.out.println(ioob.getMessage() + "\n");
		}

		System.out.println("--------\nException: NullPointerException\n");
		System.out.println("1. JRList.add(\"\")");
		try {
			jrl.add("");
		} catch (NullPointerException np) {
			System.out.println(np.getMessage() + "\n");
		}

		System.out.println("Successfull!");

	}

}
