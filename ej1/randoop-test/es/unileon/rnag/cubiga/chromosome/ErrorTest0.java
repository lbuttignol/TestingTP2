package es.unileon.rnag.cubiga.chromosome;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        bitChromosome2.setFitness(100.0d);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and bitChromosome5", (bitChromosome4.compareTo(bitChromosome5) == 0) == bitChromosome4.equals(bitChromosome5));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType7);
        int int9 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and bitChromosome5", (bitChromosome4.compareTo(bitChromosome5) == 0) == bitChromosome4.equals(bitChromosome5));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome5.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome4", (bitChromosome2.compareTo(bitChromosome4) == 0) == bitChromosome2.equals(bitChromosome4));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        int int6 = bitChromosome2.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and bitChromosome5", (bitChromosome4.compareTo(bitChromosome5) == 0) == bitChromosome4.equals(bitChromosome5));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType6);
        double double8 = bitChromosome7.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome7);
        int int11 = bitChromosome4.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome7);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome9", (bitChromosome2.compareTo(bitChromosome9) == 0) == bitChromosome2.equals(bitChromosome9));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        int int5 = bitChromosome2.length();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome2.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and bitChromosome6", (bitChromosome4.compareTo(bitChromosome6) == 0) == bitChromosome4.equals(bitChromosome6));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType5);
        double double7 = bitChromosome6.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome6);
        int int9 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType11 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType11);
        double double13 = bitChromosome12.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome12);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = bitChromosome12.getGeneticType();
        es.unileon.rnag.cubiga.gen.Gen[] genArray18 = bitChromosome12.getChromosomeSlice(10, (int) (short) 0);
        bitChromosome8.setChromosomeSlice(genArray18, (int) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome6", (bitChromosome2.compareTo(bitChromosome6) == 0) == bitChromosome2.equals(bitChromosome6));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType5);
        double double7 = bitChromosome6.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome6);
        int int9 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType11 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType11);
        double double13 = bitChromosome12.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome12);
        int int15 = bitChromosome8.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome6", (bitChromosome2.compareTo(bitChromosome6) == 0) == bitChromosome2.equals(bitChromosome6));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome2.getGen((int) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and bitChromosome5", (bitChromosome4.compareTo(bitChromosome5) == 0) == bitChromosome4.equals(bitChromosome5));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        bitChromosome2.setFitness((double) 100.0f);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType8);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType11 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(97, geneticType11);
        es.unileon.rnag.cubiga.gen.Gen gen14 = bitChromosome12.getGen((int) (byte) 1);
        bitChromosome9.setGen(gen14, (int) (byte) 1);
        bitChromosome2.setGen(gen14, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome4 and bitChromosome9", (bitChromosome4.compareTo(bitChromosome9) == 0) == bitChromosome4.equals(bitChromosome9));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        int int5 = bitChromosome2.length();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome6);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome4", (bitChromosome2.compareTo(bitChromosome4) == 0) == bitChromosome2.equals(bitChromosome4));
    }
}

