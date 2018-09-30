package es.unileon.rnag.cubiga.chromosome;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BitCromosomeTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test01");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen gen3 = null;
        try {
            bitChromosome2.setGen(gen3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test02");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        try {
            es.unileon.rnag.cubiga.gen.Gen gen4 = bitChromosome2.getGen((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test03");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        es.unileon.rnag.cubiga.gen.Gen gen3 = null;
        try {
            bitChromosome2.setGen(gen3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test04");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome5 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.gen.Gen gen6 = null;
        es.unileon.rnag.cubiga.gen.Gen[] genArray7 = new es.unileon.rnag.cubiga.gen.Gen[] { gen6 };
        try {
            bitChromosome5.setChromosomeSlice(genArray7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(genArray7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test05");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType3 = bitChromosome2.getGeneticType();
        org.junit.Assert.assertNull(geneticType3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test06");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        try {
            bitChromosome2.mutateGen((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test07");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        bitChromosome2.setFitness((double) 100.0f);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType8 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome9 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType8);
        bitChromosome9.setFitness((double) ' ');
        java.util.Iterator<es.unileon.rnag.cubiga.gen.Gen> genItor12 = bitChromosome9.iterator();
        int int13 = bitChromosome2.compareTo((es.unileon.rnag.cubiga.chromosome.Chromosome) bitChromosome9);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(genItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test08");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome3 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        try {
            bitChromosome3.mutateGen((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test09");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        bitChromosome2.setFitness((double) 100.0f);
        java.lang.Class<?> wildcardClass7 = bitChromosome2.getClass();
        int int8 = bitChromosome2.length();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test10");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        try {
            es.unileon.rnag.cubiga.gen.Gen[] genArray7 = bitChromosome2.getChromosomeSlice((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Index to be retrieved for this chromosome is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test11");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) '4', geneticType1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test12");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome2.getGeneticType();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType7);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType10 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome11 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(97, geneticType10);
        es.unileon.rnag.cubiga.gen.Gen gen13 = bitChromosome11.getGen((int) (byte) 1);
        bitChromosome8.setGen(gen13, (int) (byte) 1);
        try {
            bitChromosome2.setGen(gen13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(geneticType5);
        org.junit.Assert.assertNotNull(gen13);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test13");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome2.getGeneticType();
        try {
            es.unileon.rnag.cubiga.gen.Gen[] genArray8 = bitChromosome2.getChromosomeSlice((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(geneticType5);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test14");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType6 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome7 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(97, geneticType6);
        es.unileon.rnag.cubiga.gen.Gen gen9 = bitChromosome7.getGen((int) (byte) 1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType11 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome12 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType11);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType14 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome15 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(97, geneticType14);
        es.unileon.rnag.cubiga.gen.Gen gen17 = bitChromosome15.getGen((int) (byte) 1);
        bitChromosome12.setGen(gen17, (int) (byte) 1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType21 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome22 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType21);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType24 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome25 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(97, geneticType24);
        es.unileon.rnag.cubiga.gen.Gen gen27 = bitChromosome25.getGen((int) (byte) 1);
        bitChromosome22.setGen(gen27, (int) (byte) 1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType31 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome32 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType31);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType34 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome35 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(97, geneticType34);
        es.unileon.rnag.cubiga.gen.Gen gen37 = bitChromosome35.getGen((int) (byte) 1);
        bitChromosome32.setGen(gen37, (int) (byte) 1);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType41 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome42 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType41);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType44 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome45 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(97, geneticType44);
        es.unileon.rnag.cubiga.gen.Gen gen47 = bitChromosome45.getGen((int) (byte) 1);
        bitChromosome42.setGen(gen47, (int) (byte) 1);
        es.unileon.rnag.cubiga.gen.Gen[] genArray50 = new es.unileon.rnag.cubiga.gen.Gen[] { gen9, gen17, gen27, gen37, gen47 };
        try {
            bitChromosome2.setChromosomeSlice(genArray50, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The selected slice does not fit in the position of the chromosome");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(gen9);
        org.junit.Assert.assertNotNull(gen17);
        org.junit.Assert.assertNotNull(gen27);
        org.junit.Assert.assertNotNull(gen37);
        org.junit.Assert.assertNotNull(gen47);
        org.junit.Assert.assertNotNull(genArray50);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test15");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) 'a', geneticType1);
        double double3 = bitChromosome2.getFitness();
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome4 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(bitChromosome2);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome2.getGeneticType();
        es.unileon.rnag.cubiga.gen.Gen[] genArray8 = bitChromosome2.getChromosomeSlice(10, (int) (short) 0);
        bitChromosome2.setFitness((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(geneticType5);
        org.junit.Assert.assertNotNull(genArray8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test16");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType1);
        bitChromosome2.setFitness(1.0d);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome2.getGeneticType();
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType7 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome8 = new es.unileon.rnag.cubiga.chromosome.BitChromosome(97, geneticType7);
        es.unileon.rnag.cubiga.gen.Gen gen10 = bitChromosome8.getGen((int) (byte) 1);
        try {
            bitChromosome2.setGen(gen10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(geneticType5);
        org.junit.Assert.assertNotNull(gen10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test17");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType1);
        bitChromosome2.setFitness((double) ' ');
        es.unileon.rnag.cubiga.chromosome.Chromosome chromosome5 = bitChromosome2.copyChromosome();
        org.junit.Assert.assertNotNull(chromosome5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BitCromosomeTest0.test18");
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType1 = null;
        es.unileon.rnag.cubiga.chromosome.BitChromosome bitChromosome2 = new es.unileon.rnag.cubiga.chromosome.BitChromosome((int) (short) 10, geneticType1);
        bitChromosome2.setFitness(1.0d);
        es.unileon.rnag.cubiga.datatypes.GeneticType geneticType5 = bitChromosome2.getGeneticType();
        try {
            es.unileon.rnag.cubiga.gen.Gen gen7 = bitChromosome2.getGen((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: The index passed is out of bounds");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNull(geneticType5);
    }
}

