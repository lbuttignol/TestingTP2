package es.unileon.rnag.cubiga.chromosome;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitCromosomeTestFlaky0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test01");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        try {
            es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(0, geneticType1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test02");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        try {
            es.unileon.rnag.cubiga.gen.Gen[] genArray8 = bitChromosome2.getChromosomeSlice((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genArray3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test03");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome7 = null;
        try {
            boolean boolean8 = bitChromosome5.equals(chromosome7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test04");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        try {
            es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome2.getGen((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test05");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome2.copyChromosome();
        try {
            es.unileon.rnag.cubiga.gen.Gen gen10 = bitChromosome2.getGen((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNotNull(chromosome8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test06");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        try {
            bitChromosome2.mutateGen(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test07");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType3 = bitChromosome2.getGeneticType();
        org.junit.Assert.assertNull(geneticType3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test08");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome2.copyChromosome();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome2.iterator();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test09");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test10");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome2.copyChromosome();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType10 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType10);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType13 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType13);
        int int15 = bitChromosome11.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        es.unileon.rnag.cubiga.gen.Gen gen17 = bitChromosome14.getGen(0);
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor18 = bitChromosome14.iterator();
        boolean boolean19 = chromosome8.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(genItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

