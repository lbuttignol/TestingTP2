package es.unileon.rnag.cubiga.operator.selection;

/**
 * Class that generate a SelectionStrategy
 * @author Adrian Casimiro Alvarez
 * @author Javier de Pedro Lopez
 */
public class SelectionFactory {
	/**
	 * Enumeration type that specify the SelectionStrategies that can be created
	 * @author Adrian Casimiro Alvarez
	 * @author Javier de Pedro Lopez
	 */
	public enum SelectionType{
		TOURNAMENT,ROULETTE
	}
	
	/**
	 * Method that generate the SelectionStrategy
	 * @param selectionType Enumeration type that specify the SelectionStrategy to be created
	 * @return The strategy
	 */
	public static SelectionStrategy makeSelectionStrategy(SelectionType selectionType){
		SelectionStrategy selectionStrategy = null;
		switch (selectionType) {
		case TOURNAMENT:
			selectionStrategy = new TournamentSelection();
			break;

		case ROULETTE:
			selectionStrategy = new RouletteSelection();
			break;
		default:
			throw new RuntimeException("The selected selection strategy does not exists");
		}

		return selectionStrategy;
	}
}
