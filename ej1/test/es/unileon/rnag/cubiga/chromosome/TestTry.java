package es.unileon.rnag.cubiga.chromosome;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import es.unileon.rnag.cubiga.chromosome.BitChromosome;
import es.unileon.rnag.cubiga.datatypes.BitVector;
import es.unileon.rnag.cubiga.datatypes.GeneticType;
import es.unileon.rnag.cubiga.datatypes.List;
import es.unileon.rnag.cubiga.datatypes.ListVector;
import es.unileon.rnag.cubiga.datatypes.Range;
import es.unileon.rnag.cubiga.datatypes.RangeVector;
import es.unileon.rnag.cubiga.gen.BitGen;
import es.unileon.rnag.cubiga.gen.Gen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TestTry extends BitChromosome_ESTest_scaffolding {

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test08");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        try {
            bitChromosome5.mutateGen((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(wildcardClass9);
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
        try {
            bitChromosome5.mutateGen((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(wildcardClass9);
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
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome2.iterator();
        java.lang.Class<?> wildcardClass10 = bitChromosome2.getClass();
        try {
            bitChromosome2.mutateGen((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test11");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType3 = bitChromosome2.getGeneticType();
        try {
            java.lang.Class<?> wildcardClass4 = geneticType3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(geneticType3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test12");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor3 = bitChromosome2.iterator();
        org.junit.Assert.assertNotNull(genItor3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test13");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        try {
            es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (byte) 0, geneticType1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: BitChromosome must have a longitude greater than 0.");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test14");
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
        try {
            es.unileon.rnag.cubiga.gen.Gen[] genArray23 = bitChromosome5.getChromosomeSlice(52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(genArray14);
        org.junit.Assert.assertNotNull(chromosome19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test15");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) ' ', geneticType1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test16");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        double double6 = bitChromosome2.getFitness();
        int int7 = bitChromosome2.length();
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test17");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        int int8 = bitChromosome2.length();
        es.unileon.rnag.cubiga.gen.Gen gen10 = bitChromosome2.getGen(0);
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(gen10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test18");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome8.iterator();
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test19");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome2.copyChromosome();
        try {
            es.unileon.rnag.cubiga.gen.Gen[] genArray11 = bitChromosome2.getChromosomeSlice((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNotNull(chromosome8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test20");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome2.getGeneticType();
        try {
            bitChromosome2.mutateGen((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNull(geneticType8);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test21");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome5.iterator();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(genItor11);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test22");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        int int8 = bitChromosome2.length();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome2.iterator();
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test23");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome2.copyChromosome();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome2.iterator();
        es.unileon.rnag.cubiga.gen.Gen gen11 = bitChromosome2.getGen(10);
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(gen11);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test24");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        bitChromosome5.setFitness((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test25");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome5.iterator();
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome10 = bitChromosome5.copyChromosome();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(chromosome10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test26");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType9 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType9);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType12 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome13 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType12);
        int int14 = bitChromosome10.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome13);
        es.unileon.rnag.cubiga.gen.Gen gen16 = bitChromosome13.getGen(0);
        java.lang.Class<?> wildcardClass17 = bitChromosome13.getClass();
        es.unileon.rnag.cubiga.gen.Gen gen19 = bitChromosome13.getGen((int) (byte) 10);
        try {
            bitChromosome2.setGen(gen19, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(gen16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(gen19);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test27");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome5.iterator();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome10 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(genItor9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test28");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome2.getGeneticType();
        int int9 = bitChromosome2.length();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType10 = bitChromosome2.getGeneticType();
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNull(geneticType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(geneticType10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test29");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome5.iterator();
        es.unileon.rnag.cubiga.gen.Gen gen13 = bitChromosome5.getGen(10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(genItor11);
        org.junit.Assert.assertNotNull(gen13);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test30");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType3 = bitChromosome2.getGeneticType();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        org.junit.Assert.assertNull(geneticType3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test31");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = bitChromosome2.getGeneticType();
        try {
            es.unileon.rnag.cubiga.gen.Gen[] genArray9 = bitChromosome2.getChromosomeSlice((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNull(geneticType6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test32");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        double double6 = bitChromosome2.getFitness();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor7 = bitChromosome2.iterator();
        es.unileon.rnag.cubiga.gen.Gen[] genArray10 = bitChromosome2.getChromosomeSlice((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(genItor7);
        org.junit.Assert.assertNotNull(genArray10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test33");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        int int11 = bitChromosome5.length();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test34");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        double double6 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test35");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType3 = bitChromosome2.getGeneticType();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome6 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType5);
        es.unileon.rnag.cubiga.gen.Gen[] genArray7 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome6.setChromosomeSlice(genArray7, (int) '#');
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType10 = bitChromosome6.getGeneticType();
        boolean boolean11 = bitChromosome2.equals((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome6);
        org.junit.Assert.assertNull(geneticType3);
        org.junit.Assert.assertNotNull(genArray7);
        org.junit.Assert.assertNull(geneticType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test36");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome2.copyChromosome();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome2.iterator();
        java.lang.Class<?> wildcardClass10 = bitChromosome2.getClass();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor11 = bitChromosome2.iterator();
        es.unileon.rnag.cubiga.gen.Gen[] genArray12 = null;
        try {
            bitChromosome2.setChromosomeSlice(genArray12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(genItor11);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test37");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        bitChromosome5.setFitness((double) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test38");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType7);
        int int9 = bitChromosome5.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome8);
        double double10 = bitChromosome5.getFitness();
        es.unileon.rnag.cubiga.gen.Gen gen12 = bitChromosome5.getGen((int) '#');
        try {
            bitChromosome2.setGen(gen12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(gen12);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test39");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = bitChromosome2.getGeneticType();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = bitChromosome2.getGeneticType();
        double double9 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome10 = bitChromosome2.copyChromosome();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(geneticType7);
        org.junit.Assert.assertNull(geneticType8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(chromosome10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test40");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray3 = new es.unileon.rnag.cubiga.gen.Gen[] {};
        bitChromosome2.setChromosomeSlice(genArray3, (int) '#');
        bitChromosome2.setFitness((-1.0d));
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome8 = bitChromosome2.copyChromosome();
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor9 = bitChromosome2.iterator();
        java.lang.Class<?> wildcardClass10 = bitChromosome2.getClass();
        java.lang.Class<?> wildcardClass11 = bitChromosome2.getClass();
        try {
            es.unileon.rnag.cubiga.gen.Gen gen13 = bitChromosome2.getGen(100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(genArray3);
        org.junit.Assert.assertNotNull(chromosome8);
        org.junit.Assert.assertNotNull(genItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTestFlaky0.test41");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType4 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType4);
        int int6 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome5);
        es.unileon.rnag.cubiga.gen.Gen gen8 = bitChromosome5.getGen(0);
        java.lang.Class<?> wildcardClass9 = bitChromosome5.getClass();
        double double10 = bitChromosome5.getFitness();
        es.unileon.rnag.cubiga.gen.Gen gen12 = bitChromosome5.getGen((int) ' ');
        try {
            es.unileon.rnag.cubiga.gen.Gen gen14 = bitChromosome5.getGen((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gen8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(gen12);
    }
    
    
    // Randoop error test
    
    @Test
    public void testError01() throws Throwable {
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
    public void testError02() throws Throwable {
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
    public void testError03() throws Throwable {
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
    public void testError04() throws Throwable {
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
    public void testError05() throws Throwable {
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
    public void testError06() throws Throwable {
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
    public void testError07() throws Throwable {
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
    public void testError08() throws Throwable {
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
    public void testError09() throws Throwable {
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
    public void testError10() throws Throwable {
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
    public void testError11() throws Throwable {
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
    public void testError12() throws Throwable {
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
    public void testError13() throws Throwable {
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
    public void testError14() throws Throwable {
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
    public void testError15() throws Throwable {
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
    public void testError16() throws Throwable {
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
    public void testError17() throws Throwable {
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
    public void testError18() throws Throwable {
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
    public void testError19() throws Throwable {
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
    public void testError20() throws Throwable {
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
    public void testError21() throws Throwable {
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
    public void testError22() throws Throwable {
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
    public void testError23() throws Throwable {
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
    
    @Test(timeout = 4000)
    public void testES00()  throws Throwable  {
        BitVector bitVector0 = new BitVector(751);
        BitChromosome bitChromosome0 = new BitChromosome(1483, bitVector0);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        bitChromosome0.mutateGen(751);
        bitChromosome1.setFitness(751);
        BitChromosome bitChromosome2 = new BitChromosome(bitChromosome1);
        bitChromosome0.length();
        bitChromosome0.geneticType = (GeneticType) bitVector0;
        bitChromosome1.getChromosomeSlice(0, 1483);
        bitChromosome2.length();
        Gen gen0 = bitChromosome2.getGen(1);
        bitVector0.generateGen(751);
        bitChromosome2.setGen(gen0, 0);
        bitChromosome0.getChromosomeSlice(1, 1234);
        bitChromosome2.mutateGen(1140);
        bitChromosome1.copyChromosome();
    }

    @Test(timeout = 4000)
    public void testES01()  throws Throwable  {
        BitVector bitVector0 = new BitVector(1234);
        BitChromosome bitChromosome0 = new BitChromosome(1234, bitVector0);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        bitChromosome1.geneticType = (GeneticType) bitVector0;
        bitChromosome1.copyChromosome();
        // Undeclared exception!
        try { 
          bitChromosome1.mutateGen(1234);
          fail("Expecting exception: ArrayIndexOutOfBoundsException");
        
        } catch(ArrayIndexOutOfBoundsException e) {
           //
           // 1234
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES02()  throws Throwable  {
        int int0 = 4128;
        GeneticType geneticType0 = null;
        BitChromosome bitChromosome0 = new BitChromosome(4128, (GeneticType) null);
        bitChromosome0.iterator();
        bitChromosome0.copyChromosome();
        bitChromosome0.getGen(0);
        bitChromosome0.iterator();
        int int1 = 0;
        bitChromosome0.setFitness(0);
        // Undeclared exception!
        bitChromosome0.iterator();
    }

    @Test(timeout = 4000)
    public void testES03()  throws Throwable  {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "jQ*Mt";
        stringArray0[1] = "";
        List list0 = new List(stringArray0);
        BitChromosome bitChromosome0 = new BitChromosome(1, (GeneticType) null);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        Gen[] genArray0 = new Gen[1];
        BitGen bitGen0 = new BitGen(false, (GeneticType) null);
        genArray0[0] = (Gen) bitGen0;
        // Undeclared exception!
        try { 
          bitChromosome1.setChromosomeSlice(genArray0, (-1033));
          fail("Expecting exception: ArrayIndexOutOfBoundsException");
        
        } catch(ArrayIndexOutOfBoundsException e) {
           //
           // no message in exception (getMessage() returned null)
           //
        }
    }

    @Test(timeout = 4000)
    public void testES04()  throws Throwable  {
        BitChromosome bitChromosome0 = new BitChromosome(1053, (GeneticType) null);
        // Undeclared exception!
        try { 
          bitChromosome0.getChromosomeSlice((-88), 1);
          fail("Expecting exception: ArrayIndexOutOfBoundsException");
        
        } catch(ArrayIndexOutOfBoundsException e) {
           //
           // no message in exception (getMessage() returned null)
           //
        }
    }

    @Test(timeout = 4000)
    public void testES05()  throws Throwable  {
        int int0 = 4195;
        BitVector bitVector0 = new BitVector(4195);
        BitChromosome bitChromosome0 = new BitChromosome(4195, bitVector0);
        bitChromosome0.copyChromosome();
        bitChromosome0.geneticType = (GeneticType) bitVector0;
        bitChromosome0.length();
        int int1 = (-1);
        // Undeclared exception!
        try { 
          bitChromosome0.getGen((-1));
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // The index passed is out of bounds
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES06()  throws Throwable  {
        int int0 = 1102;
        BitChromosome bitChromosome0 = new BitChromosome(1102, (GeneticType) null);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        // Undeclared exception!
        try { 
          bitChromosome1.getGen((-1));
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // The index passed is out of bounds
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES07()  throws Throwable  {
        Range[] rangeArray0 = new Range[2];
        Range range0 = new Range(0, 0);
        rangeArray0[0] = range0;
        int int0 = 0;
        Range range1 = new Range((-1009), 0);
        rangeArray0[1] = range1;
        RangeVector rangeVector0 = new RangeVector(rangeArray0);
        BitChromosome bitChromosome0 = new BitChromosome(386, rangeVector0);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        // Undeclared exception!
        try { 
          bitChromosome1.mutateGen(1725);
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // The index passed is out of bounds
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES08()  throws Throwable  {
        BitVector bitVector0 = new BitVector(925);
        BitChromosome bitChromosome0 = new BitChromosome(925, bitVector0);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        // Undeclared exception!
        try { 
          bitChromosome1.getChromosomeSlice(0, (-1));
          fail("Expecting exception: NegativeArraySizeException");
        
        } catch(NegativeArraySizeException e) {
           //
           // no message in exception (getMessage() returned null)
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES09()  throws Throwable  {
        int int0 = 864;
        GeneticType geneticType0 = null;
        BitChromosome bitChromosome0 = new BitChromosome(864, (GeneticType) null);
        Gen[] genArray0 = new Gen[9];
        // Undeclared exception!
        try { 
          bitChromosome0.getGen(864);
          fail("Expecting exception: ArrayIndexOutOfBoundsException");
        
        } catch(ArrayIndexOutOfBoundsException e) {
           //
           // 864
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES10()  throws Throwable  {
        BitVector bitVector0 = new BitVector(1040);
        BitChromosome bitChromosome0 = new BitChromosome(3623, bitVector0);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        bitChromosome1.getGen(1040);
        bitChromosome1.length();
        Gen[] genArray0 = new Gen[0];
        bitChromosome0.setChromosomeSlice(genArray0, (-4007));
    }

    @Test(timeout = 4000)
    public void testES11()  throws Throwable  {
        BitChromosome bitChromosome0 = new BitChromosome(1, (GeneticType) null);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        bitChromosome1.getGen(0);
        // Undeclared exception!
        try { 
          bitChromosome1.mutateGen((-2139));
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // The index passed is out of bounds
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES12()  throws Throwable  {
        int int0 = 1;
        BitChromosome bitChromosome0 = new BitChromosome(1, (GeneticType) null);
        bitChromosome0.copyChromosome();
        BitVector bitVector0 = new BitVector(1);
        Gen gen0 = bitVector0.generateGen(1);
        // Undeclared exception!
        try { 
          bitChromosome0.setGen(gen0, 1);
          fail("Expecting exception: ArrayIndexOutOfBoundsException");
        
        } catch(ArrayIndexOutOfBoundsException e) {
           //
           // 1
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES13()  throws Throwable  {
        List[] listArray0 = new List[6];
        String[] stringArray0 = new String[0];
        List list0 = new List(stringArray0);
        listArray0[0] = list0;
        List list1 = new List(stringArray0);
        listArray0[1] = list1;
        List list2 = new List(stringArray0);
        listArray0[2] = list2;
        String[] stringArray1 = new String[9];
        stringArray1[0] = "D@l uy";
        stringArray1[1] = "";
        stringArray1[2] = "No=A>{-n5";
        stringArray1[3] = "Cfk~25XX";
        stringArray1[4] = "/HfCwv5~4C+E2[? ,";
        stringArray1[5] = "";
        stringArray1[6] = "";
        stringArray1[7] = ";k<Yj";
        stringArray1[8] = "b`x5G_O";
        List list3 = new List(stringArray1);
        listArray0[3] = list3;
        List list4 = new List(stringArray0);
        listArray0[4] = list4;
        List list5 = new List(stringArray0);
        list3.getRandomPossibility();
        listArray0[5] = list5;
        ListVector listVector0 = new ListVector(listArray0);
        BitChromosome bitChromosome0 = new BitChromosome(1, listVector0);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        // Undeclared exception!
        try { 
          bitChromosome1.mutateGen(1);
          fail("Expecting exception: ArithmeticException");
        
        } catch(ArithmeticException e) {
           //
           // / by zero
           //
           verifyException("org.evosuite.runtime.Random", e);
        }
    }

    @Test(timeout = 4000)
    public void testES14()  throws Throwable  {
        int int0 = 1;
        BitVector bitVector0 = new BitVector(1);
        bitVector0.generateChromosome();
        bitVector0.generateChromosome();
        BitChromosome bitChromosome0 = new BitChromosome(1, bitVector0);
        // Undeclared exception!
        try { 
          bitChromosome0.getGen(590);
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // The index passed is out of bounds
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES15()  throws Throwable  {
        int int0 = 978;
        GeneticType geneticType0 = null;
        BitChromosome bitChromosome0 = new BitChromosome(978, (GeneticType) null);
        Gen[] genArray0 = null;
        int int1 = (-1);
        // Undeclared exception!
        try { 
          bitChromosome0.setChromosomeSlice((Gen[]) null, 978);
          fail("Expecting exception: NullPointerException");
        
        } catch(NullPointerException e) {
           //
           // no message in exception (getMessage() returned null)
           //
        }
    }

    @Test(timeout = 4000)
    public void testES16()  throws Throwable  {
        GeneticType geneticType0 = null;
        BitChromosome bitChromosome0 = new BitChromosome(1252, (GeneticType) null);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        // Undeclared exception!
        try { 
          bitChromosome1.setGen((Gen) null, 1252);
          fail("Expecting exception: NullPointerException");
        
        } catch(NullPointerException e) {
           //
           // no message in exception (getMessage() returned null)
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES17()  throws Throwable  {
        BitChromosome bitChromosome0 = new BitChromosome(1, (GeneticType) null);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        // Undeclared exception!
        try { 
          bitChromosome1.getGen(9);
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // The index passed is out of bounds
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES18()  throws Throwable  {
        BitVector bitVector0 = new BitVector(972);
        Gen gen0 = bitVector0.generateGen(1861);
        BitChromosome bitChromosome0 = new BitChromosome(972, bitVector0);
        int int0 = (-2733);
        // Undeclared exception!
        try { 
          bitChromosome0.setGen(gen0, (-2733));
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // The index passed is out of bounds
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES19()  throws Throwable  {
        BitChromosome bitChromosome0 = null;
        try {
          bitChromosome0 = new BitChromosome((BitChromosome) null);
          fail("Expecting exception: NullPointerException");
        
        } catch(NullPointerException e) {
           //
           // no message in exception (getMessage() returned null)
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES20()  throws Throwable  {
        int int0 = 0;
        List[] listArray0 = new List[6];
        List list0 = new List((String[]) null);
        listArray0[0] = list0;
        List list1 = new List((String[]) null);
        listArray0[1] = list1;
        List list2 = new List((String[]) null);
        listArray0[2] = list2;
        String[] stringArray0 = new String[6];
        stringArray0[0] = "es.unileon.rnag.cubiga.chromosome.RangeChromosome";
        stringArray0[1] = "AI}A`7\"p'c.JWFR_XY";
        stringArray0[2] = "The index passed is out of bounds";
        stringArray0[3] = "";
        stringArray0[4] = "Index to be retrieved for this chromosome is out of bounds";
        stringArray0[5] = "es.unileon.rnag.cubiga.datatypes.List";
        List list3 = new List(stringArray0);
        listArray0[3] = list3;
        List list4 = new List(stringArray0);
        listArray0[4] = list4;
        List list5 = new List(stringArray0);
        listArray0[5] = list5;
        ListVector listVector0 = new ListVector(listArray0);
        BitChromosome bitChromosome0 = null;
        try {
          bitChromosome0 = new BitChromosome(0, listVector0);
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // BitChromosome must have a longitude greater than 0.
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES21()  throws Throwable  {
        BitChromosome bitChromosome0 = null;
        try {
          bitChromosome0 = new BitChromosome(0, (GeneticType) null);
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // BitChromosome must have a longitude greater than 0.
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES22()  throws Throwable  {
        int int0 = 4128;
        GeneticType geneticType0 = null;
        BitChromosome bitChromosome0 = new BitChromosome(4128, (GeneticType) null);
        bitChromosome0.iterator();
        bitChromosome0.copyChromosome();
        bitChromosome0.getGen(0);
        bitChromosome0.iterator();
        int int1 = 0;
        // Undeclared exception!
        try { 
          bitChromosome0.mutateGen(0);
          fail("Expecting exception: NullPointerException");
        
        } catch(NullPointerException e) {
           //
           // no message in exception (getMessage() returned null)
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES23()  throws Throwable  {
        int int0 = 1195;
        GeneticType geneticType0 = null;
        BitChromosome bitChromosome0 = new BitChromosome(1195, (GeneticType) null);
        bitChromosome0.setFitness(0.5);
        // Undeclared exception!
        try { 
          bitChromosome0.mutateGen(1195);
          fail("Expecting exception: NullPointerException");
        
        } catch(NullPointerException e) {
           //
           // no message in exception (getMessage() returned null)
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES24()  throws Throwable  {
        int int0 = 1;
        BitChromosome bitChromosome0 = new BitChromosome(1, (GeneticType) null);
        // Undeclared exception!
        try { 
          bitChromosome0.getChromosomeSlice(1, 1);
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // Index to be retrieved for this chromosome is out of bounds
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES25()  throws Throwable  {
        int int0 = (-1);
        BitVector bitVector0 = null;
        try {
          bitVector0 = new BitVector((-1));
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // The length of the BitVector data type must be greater than 0
           //
           verifyException("es.unileon.rnag.cubiga.datatypes.BitVector", e);
        }
    }

    @Test(timeout = 4000)
    public void testES26()  throws Throwable  {
        BitVector bitVector0 = new BitVector(417);
        Gen gen0 = bitVector0.generateGen(417);
        BitChromosome bitChromosome0 = new BitChromosome(417, bitVector0);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        bitChromosome1.copyChromosome();
        bitChromosome1.copyChromosome();
        bitChromosome1.iterator();
        Gen[] genArray0 = new Gen[9];
        genArray0[0] = gen0;
        genArray0[1] = gen0;
        genArray0[2] = gen0;
        genArray0[3] = gen0;
        genArray0[4] = gen0;
        genArray0[5] = gen0;
        genArray0[6] = gen0;
        genArray0[7] = gen0;
        genArray0[8] = gen0;
        // Undeclared exception!
        try { 
          bitChromosome1.setChromosomeSlice(genArray0, 417);
          fail("Expecting exception: RuntimeException");
        
        } catch(RuntimeException e) {
           //
           // The selected slice does not fit in the position of the chromosome
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

    @Test(timeout = 4000)
    public void testES27()  throws Throwable  {
        Range[] rangeArray0 = new Range[6];
        Range range0 = new Range(0, 1);
        rangeArray0[0] = range0;
        Range range1 = new Range(0, 0);
        rangeArray0[1] = range1;
        Range range2 = new Range(1, 1);
        rangeArray0[2] = range2;
        Range range3 = new Range(0, 2490);
        rangeArray0[3] = range3;
        Range range4 = new Range(0, 0);
        rangeArray0[4] = range4;
        Range range5 = new Range(0, 1);
        rangeArray0[5] = range5;
        RangeVector rangeVector0 = new RangeVector(rangeArray0);
        rangeVector0.generateChromosome();
        range4.last = (-698);
        BitChromosome bitChromosome0 = new BitChromosome(1, rangeVector0);
        bitChromosome0.getGen(0);
        int int0 = 0;
        range0.last = 1;
        int int1 = (-1);
        // Undeclared exception!
        try { 
          rangeVector0.generateGen((-1));
          fail("Expecting exception: ArrayIndexOutOfBoundsException");
        
        } catch(ArrayIndexOutOfBoundsException e) {
           //
           // -1
           //
           verifyException("es.unileon.rnag.cubiga.datatypes.RangeVector", e);
        }
    }

    @Test(timeout = 4000)
    public void testES28()  throws Throwable  {
        int int0 = 1313;
        List[] listArray0 = new List[1];
        String[] stringArray0 = new String[7];
        stringArray0[0] = "";
        stringArray0[1] = ")SUubK_rXD1s)PRG.A";
        stringArray0[2] = "";
        stringArray0[3] = "";
        stringArray0[4] = "[#p+9t8H=N8a";
        stringArray0[5] = "1/]~yDO}(zk";
        stringArray0[6] = "@,v<IB~$uF&LFwF";
        List list0 = new List(stringArray0);
        listArray0[0] = list0;
        list0.getRandomPossibility();
        ListVector listVector0 = new ListVector(listArray0);
        BitChromosome bitChromosome0 = new BitChromosome(1313, listVector0);
        BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
        int int1 = (-1789);
        // Undeclared exception!
        try { 
          bitChromosome1.getChromosomeSlice(1313, (-1789));
          fail("Expecting exception: NegativeArraySizeException");
        
        } catch(NegativeArraySizeException e) {
           //
           // no message in exception (getMessage() returned null)
           //
           verifyException("es.unileon.rnag.cubiga.chromosome.BitChromosome", e);
        }
    }

}

