package es.unileon.rnag.cubiga.chromosome;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome5.iterator();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType11 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType11);
        es.unileon.rnag.cubiga.gen.Gen[] genArray13 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome12.setChromosomeSlice(genArray13, (int) '#');
        bitChromosome5.setChromosomeSlice(genArray13, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome12", (bitChromosome2.compareTo(bitChromosome12) == 0) == bitChromosome2.equals(bitChromosome12));
    }
}

