package hr.fer.zemris.java.tecaj.hw6.observer1;

/**
 * The implementation of {@link IntegerStorageObserver} that calculates the
 * square value of an {@link IntegerStorage} object and outputs it to the
 * standard output.
 * 
 * @author Juraj Juričić
 */
public class SquareValue implements IntegerStorageObserver {

	/*
	 * (non-Javadoc)
	 * 
	 * @see hr.fer.zemris.java.tecaj.hw6.observer1.IntegerStorageObserver#
	 * valueChanged(hr.fer.zemris.java.tecaj.hw6.observer1.IntegerStorage)
	 */
	@Override
	public void valueChanged(IntegerStorage istorage) {
		int value = istorage.getValue();
		System.out.printf("Provided new value: %d, square is %d%n", value,
				value * value);
	}

}
