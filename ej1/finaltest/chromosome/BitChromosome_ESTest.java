/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 03 21:19:43 GMT 2018
 */

package es.unileon.rnag.cubiga.chromosome;

import org.junit.Test;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BitChromosome_ESTest extends BitChromosome_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
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
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
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
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
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
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
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
  public void test07()  throws Throwable  {
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
  public void test08()  throws Throwable  {
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
  public void test09()  throws Throwable  {
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
  public void test10()  throws Throwable  {
      BitVector bitVector0 = new BitVector(1040);
      BitChromosome bitChromosome0 = new BitChromosome(3623, bitVector0);
      BitChromosome bitChromosome1 = new BitChromosome(bitChromosome0);
      bitChromosome1.getGen(1040);
      bitChromosome1.length();
      Gen[] genArray0 = new Gen[0];
      bitChromosome0.setChromosomeSlice(genArray0, (-4007));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
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
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
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
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
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
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
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
  public void test23()  throws Throwable  {
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
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
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
  public void test27()  throws Throwable  {
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
  public void test28()  throws Throwable  {
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
