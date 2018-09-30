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

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType12 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType12);
        es.unileon.rnag.cubiga.gen.Gen[] genArray14 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome13.setChromosomeSlice(genArray14, (int) '#');
        bitChromosome13.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome19 = bitChromosome13.copyChromosome();
        boolean boolean20 = bitChromosome5.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType22 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome23 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType22);
        es.unileon.rnag.cubiga.gen.Gen[] genArray24 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome23.setChromosomeSlice(genArray24, (int) '#');
        bitChromosome23.setFitness((-1.0d));
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType29 = bitChromosome23.getGeneticType();
        boolean boolean30 = bitChromosome13.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome23);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome5", (bitChromosome2.compareTo(bitChromosome5) == 0) == bitChromosome2.equals(bitChromosome5));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType12 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType12);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType15);
        int int17 = bitChromosome13.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome16);
        double double18 = bitChromosome13.getFitness();
        boolean boolean19 = bitChromosome5.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome16", (bitChromosome2.compareTo(bitChromosome16) == 0) == bitChromosome2.equals(bitChromosome16));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType12 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType12);
        es.unileon.rnag.cubiga.gen.Gen[] genArray14 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome13.setChromosomeSlice(genArray14, (int) '#');
        bitChromosome13.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome19 = bitChromosome13.copyChromosome();
        boolean boolean20 = bitChromosome5.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType22 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome23 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType22);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType25 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome26 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType25);
        int int27 = bitChromosome23.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome26);
        es.unileon.rnag.cubiga.gen.Gen gen29 = bitChromosome26.getGen(0);
        java.lang.Class<?> wildcardClass30 = bitChromosome26.getClass();
        double double31 = bitChromosome26.getFitness();
        es.unileon.rnag.cubiga.gen.Gen gen33 = bitChromosome26.getGen((int) ' ');
        bitChromosome13.setGen(gen33, 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome5", (bitChromosome2.compareTo(bitChromosome5) == 0) == bitChromosome2.equals(bitChromosome5));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType12 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType12);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType15);
        int int17 = bitChromosome13.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome16);
        es.unileon.rnag.cubiga.gen.Gen gen19 = bitChromosome16.getGen(0);
        java.lang.Class<?> wildcardClass20 = bitChromosome16.getClass();
        boolean boolean21 = bitChromosome5.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome16);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome13", (bitChromosome2.compareTo(bitChromosome13) == 0) == bitChromosome2.equals(bitChromosome13));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        java.lang.Class<?> wildcardClass20 = bitChromosome14.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and chromosome8", (bitChromosome2.compareTo(chromosome8) == 0) == bitChromosome2.equals(chromosome8));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome5);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType13 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome14 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType13);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType16 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome17 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType16);
        int int18 = bitChromosome14.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome17);
        boolean boolean19 = bitChromosome5.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome14);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome11", (bitChromosome2.compareTo(bitChromosome11) == 0) == bitChromosome2.equals(bitChromosome11));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType11 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType11);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType14 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType14);
        int int16 = bitChromosome12.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome15);
        es.unileon.rnag.cubiga.gen.Gen gen18 = bitChromosome15.getGen(0);
        java.lang.Class<?> wildcardClass19 = bitChromosome15.getClass();
        es.unileon.rnag.cubiga.gen.Gen gen21 = bitChromosome15.getGen((int) (byte) 10);
        bitChromosome5.setGen(gen21, 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome12", (bitChromosome2.compareTo(bitChromosome12) == 0) == bitChromosome2.equals(bitChromosome12));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome5);
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome11.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome5", (bitChromosome2.compareTo(bitChromosome5) == 0) == bitChromosome2.equals(bitChromosome5));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome5);
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome5.iterator();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome11", (bitChromosome2.compareTo(bitChromosome11) == 0) == bitChromosome2.equals(bitChromosome11));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome2.copyChromosome();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome2.iterator();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType12 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType12);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType15 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome16 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType15);
        int int17 = bitChromosome13.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome16);
        es.unileon.rnag.cubiga.gen.Gen gen19 = bitChromosome16.getGen(0);
        java.lang.Class<?> wildcardClass20 = bitChromosome16.getClass();
        es.unileon.rnag.cubiga.gen.Gen gen22 = bitChromosome16.getGen((int) (byte) 10);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome25 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType24);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType27 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome28 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType27);
        int int29 = bitChromosome25.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome28);
        es.unileon.rnag.cubiga.gen.Gen gen31 = bitChromosome28.getGen(0);
        java.lang.Class<?> wildcardClass32 = bitChromosome28.getClass();
        es.unileon.rnag.cubiga.gen.Gen gen34 = bitChromosome28.getGen((int) (byte) 10);
        es.unileon.rnag.cubiga.gen.Gen[] genArray35 = new es.unileon.rnag.cubiga.gen.Gen[] { gen22, gen34 };
        bitChromosome10.setChromosomeSlice(genArray35, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and chromosome8", (bitChromosome2.compareTo(chromosome8) == 0) == bitChromosome2.equals(chromosome8));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        double double20 = chromosome8.getFitness();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome11 and bitChromosome14", (bitChromosome11.compareTo(bitChromosome14) == 0) == bitChromosome11.equals(bitChromosome14));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType7);
        int int9 = bitChromosome5.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome8.getGen(0);
        java.lang.Class<?> wildcardClass12 = bitChromosome8.getClass();
        double double13 = bitChromosome8.getFitness();
        es.unileon.rnag.cubiga.gen.Gen gen15 = bitChromosome8.getGen((int) ' ');
        boolean boolean16 = bitChromosome2.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType18 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome19 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType18);
        es.unileon.rnag.cubiga.gen.Gen[] genArray20 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome19.setChromosomeSlice(genArray20, (int) '#');
        bitChromosome19.setFitness((-1.0d));
        int int25 = bitChromosome19.length();
        es.unileon.rnag.cubiga.gen.Gen[] genArray28 = bitChromosome19.getChromosomeSlice((int) ' ', (int) (byte) 1);
        bitChromosome2.setChromosomeSlice(genArray28, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome5 and bitChromosome8", (bitChromosome5.compareTo(bitChromosome8) == 0) == bitChromosome5.equals(bitChromosome8));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType7);
        int int9 = bitChromosome5.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome8.getGen(0);
        java.lang.Class<?> wildcardClass12 = bitChromosome8.getClass();
        double double13 = bitChromosome8.getFitness();
        es.unileon.rnag.cubiga.gen.Gen gen15 = bitChromosome8.getGen((int) ' ');
        boolean boolean16 = bitChromosome2.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        bitChromosome8.setFitness((double) (byte) -1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome5", (bitChromosome2.compareTo(bitChromosome5) == 0) == bitChromosome2.equals(bitChromosome5));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        double double7 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType9);
        es.unileon.rnag.cubiga.gen.Gen[] genArray11 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome10.setChromosomeSlice(genArray11, (int) '#');
        bitChromosome2.setChromosomeSlice(genArray11, (int) (byte) 10);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome5 and bitChromosome10", (bitChromosome5.compareTo(bitChromosome10) == 0) == bitChromosome5.equals(bitChromosome10));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        double double6 = bitChromosome2.getFitness();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome2.iterator();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType9);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType12 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType12);
        int int14 = bitChromosome10.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        es.unileon.rnag.cubiga.gen.Gen gen16 = bitChromosome13.getGen(0);
        java.lang.Class<?> wildcardClass17 = bitChromosome13.getClass();
        double double18 = bitChromosome13.getFitness();
        es.unileon.rnag.cubiga.gen.Gen gen20 = bitChromosome13.getGen((int) ' ');
        bitChromosome2.setGen(gen20, (int) (byte) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome10 and bitChromosome13", (bitChromosome10.compareTo(bitChromosome13) == 0) == bitChromosome10.equals(bitChromosome13));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome2.copyChromosome();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome2.iterator();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        int int11 = bitChromosome2.length();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome8 and bitChromosome10", (chromosome8.compareTo(bitChromosome10) == 0) == chromosome8.equals(bitChromosome10));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType11 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType11);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType14 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType14);
        int int16 = bitChromosome12.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome15);
        es.unileon.rnag.cubiga.gen.Gen gen18 = bitChromosome15.getGen(0);
        java.lang.Class<?> wildcardClass19 = bitChromosome15.getClass();
        double double20 = bitChromosome15.getFitness();
        es.unileon.rnag.cubiga.gen.Gen gen22 = bitChromosome15.getGen((int) ' ');
        bitChromosome5.setGen(gen22, (int) (short) 1);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome12", (bitChromosome2.compareTo(bitChromosome12) == 0) == bitChromosome2.equals(bitChromosome12));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        es.unileon.rnag.cubiga.gen.Gen gen12 = bitChromosome5.getGen((int) ' ');
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType14 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType14);
        es.unileon.rnag.cubiga.gen.Gen[] genArray16 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome15.setChromosomeSlice(genArray16, (int) '#');
        bitChromosome5.setChromosomeSlice(genArray16, (int) (short) 0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome15", (bitChromosome2.compareTo(bitChromosome15) == 0) == bitChromosome2.equals(bitChromosome15));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome2.copyChromosome();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome2.iterator();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType11 = bitChromosome2.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on chromosome8 and bitChromosome10", (chromosome8.compareTo(bitChromosome10) == 0) == chromosome8.equals(bitChromosome10));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType21 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome22 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType21);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome25 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType24);
        int int26 = bitChromosome22.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome25);
        es.unileon.rnag.cubiga.gen.Gen gen28 = bitChromosome25.getGen(0);
        java.lang.Class<?> wildcardClass29 = bitChromosome25.getClass();
        es.unileon.rnag.cubiga.gen.Gen gen31 = bitChromosome25.getGen((int) (byte) 10);
        boolean boolean32 = chromosome8.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome25);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome11 and bitChromosome14", (bitChromosome11.compareTo(bitChromosome14) == 0) == bitChromosome11.equals(bitChromosome14));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome5.iterator();
        java.lang.Class<?> wildcardClass12 = genItor11.getClass();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome2 and bitChromosome5", (bitChromosome2.compareTo(bitChromosome5) == 0) == bitChromosome2.equals(bitChromosome5));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType20 = chromosome8.getGeneticType();
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on bitChromosome11 and bitChromosome14", (bitChromosome11.compareTo(bitChromosome14) == 0) == bitChromosome11.equals(bitChromosome14));
    }
}

