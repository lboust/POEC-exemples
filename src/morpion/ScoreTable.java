package morpion;

public class ScoreTable {
	// instance fields
	int[] table;

	// getters and setters
	public int[] getTable() {
		return table;
	}

	public void setTable(int[] table) {
		this.table = table;
	}

	// constructor
	public ScoreTable(int n) {
		table = new int[n];
	}

	// methods
	public void addAPoint(int j) {
		this.table[j] += 1;
	}

	public void display() {
		System.out.println(table[0] + " | " + table[1]);
	}
}
