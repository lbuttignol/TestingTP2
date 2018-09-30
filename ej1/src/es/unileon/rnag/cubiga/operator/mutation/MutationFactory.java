package es.unileon.rnag.cubiga.operator.mutation;

/**
 * Class that generate a MutationStrategy
 * @author Adrian Casimiro Alvarez
 * @author Javier de Pedro Lopez
 */
public class MutationFactory {
	/**
	 * Enumeration type that specify the MutationStrategy that can be created
	 * @author Adrian Casimiro Alvarez
	 * @author Javier de Pedro Lopez
	 */
	public enum MutationType{
		RANDOM
	}
	
	/**
	 * Method that generate the MutationStrategy
	 * @param mutationType Enumeration type that specify the SelectionStrategy to be created
	 * @return The strategy
	 */
	public static MutationStrategy makeMutationStrategy(MutationType mutationType){
		MutationStrategy mutationStrategy;
		switch (mutationType) {
		case RANDOM:
			mutationStrategy = new RandomMutation();
			break;

		default:
			throw new RuntimeException("The selected mutation strategy does not exists");
		}
		return mutationStrategy;
	}
}
