package es.unileon.rnag.cubiga.example;

import es.unileon.rnag.cubiga.GeneticAlgorithm;
import es.unileon.rnag.cubiga.chromosome.Chromosome;
import es.unileon.rnag.cubiga.operator.FitnessOperator;
import es.unileon.rnag.cubiga.operator.StopOperator;

/**
 * Class that implements the fitness and the stop functions
 * @author Adrian Casimiro Alvarez
 * @author Javier de Pedro Lopez
 */
public class Operators implements FitnessOperator, StopOperator{
	@Override
	public boolean mustContinue(GeneticAlgorithm algorithm) {
		//The algorithm stop if the fittest has all bits set to 1
		boolean result = false;
		Chromosome chromosome = algorithm.getFittest();
		for(int i = 0; i < chromosome.length(); i++){
			if(!Boolean.parseBoolean(chromosome.getGen(i).getValue())){
				result = true;
				break;
			}
		}
		return result;
	}

	@Override
	public double fitnessFunction(Chromosome chromosome,
			GeneticAlgorithm algorithm) {
		//The fittest has more bits to 1
		double result = 0;
		for(int i=0; i<chromosome.length(); i++){
			if(Integer.parseInt(chromosome.getGen(i).toString()) == 1){
				result++;
			}
		}
		return result;
	}
}