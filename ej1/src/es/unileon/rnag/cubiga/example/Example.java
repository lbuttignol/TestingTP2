package es.unileon.rnag.cubiga.example;

import es.unileon.rnag.cubiga.GeneticAlgorithm;
import es.unileon.rnag.cubiga.datatypes.BitVector;
import es.unileon.rnag.cubiga.datatypes.GeneticType;
import es.unileon.rnag.cubiga.operator.GeneticStrategy;
import es.unileon.rnag.cubiga.operator.crossover.CrossoverFactory.CrossoverType;
import es.unileon.rnag.cubiga.operator.mutation.MutationFactory.MutationType;
import es.unileon.rnag.cubiga.operator.selection.SelectionFactory.SelectionType;

/**
 * Example of the CubiGA with BitVector
 * @author Adrian Casimiro Alvarez
 * @author Javier de Pedro Lopez
 */
public class Example {
	private static final Double CROSSOVER_PROBABILITY = 0.7;
	private static final Double MUTATION_PROBABILITY = 0.05;
	private static final int POPULATION = 80;
	private static final int NUMBER_OF_GENERATIONS = 200;
	
	/**
	 * Executes the genetic algorithm
	 * @param args External arguments
	 */
	public static void main(String[] args) {
		//Select the algorithm strategy
		GeneticStrategy geneticStrategy = new GeneticStrategy(SelectionType.TOURNAMENT, CrossoverType.TWO_POINT, MutationType.RANDOM);
		Operators operators = new Operators();
		//Create an instance of the GA
		GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(geneticStrategy, operators, operators);
		//Determine the data type
		GeneticType geneticType = new BitVector(200);
		//Initialize the GA
		geneticAlgorithm.initialize(POPULATION, geneticType, NUMBER_OF_GENERATIONS, CROSSOVER_PROBABILITY, MUTATION_PROBABILITY);
		//Evolve it
		geneticAlgorithm.evolve();
		//Print results
		System.out.println("Chromosome: " + geneticAlgorithm.getFittest());
		System.out.println("Fitness: " + geneticAlgorithm.getFittest().getFitness());
		System.out.println("Execution time = " + geneticAlgorithm.getExecutionTime());
	}
}
