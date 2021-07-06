
public abstract class Coin extends Money {
	private int value;

	public Coin(int v) { // no default constructor, its one argumented constructor
		value = v;
	}

	public int getValue() {
		return value;
	}

	public String toString() {
		if (value < 10)
			return ("$ 0.0" + getValue()); // 0.01, 0.05

		else

			return ("$ 0." + getValue());	// 0.10, 0.25

	}
}
