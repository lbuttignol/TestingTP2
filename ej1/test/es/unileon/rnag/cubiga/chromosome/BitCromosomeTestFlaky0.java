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
}

