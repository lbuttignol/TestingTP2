/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 03 21:19:43 GMT 2018
 */

package es.unileon.rnag.cubiga.chromosome;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;

@EvoSuiteClassExclude
public class BitChromosome_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "es.unileon.rnag.cubiga.chromosome.BitChromosome"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/2v/d8d1pdc94wn17l_gkgsrlzsr0000gn/T/"); 
    java.lang.System.setProperty("user.country", "ES"); 
    java.lang.System.setProperty("user.dir", "/Users/lbuttignol/Documents/Universidad/2018/Testing/TP2"); 
    java.lang.System.setProperty("user.home", "/Users/lbuttignol"); 
    java.lang.System.setProperty("user.language", "es"); 
    java.lang.System.setProperty("user.name", "lbuttignol"); 
    java.lang.System.setProperty("user.timezone", "America/Argentina/Cordoba"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BitChromosome_ESTest_scaffolding.class.getClassLoader() ,
      "es.unileon.rnag.cubiga.gen.ListGen",
      "es.unileon.rnag.cubiga.gen.RangeGen",
      "es.unileon.rnag.cubiga.datatypes.ListVector",
      "es.unileon.rnag.cubiga.gen.BitGen",
      "es.unileon.rnag.cubiga.datatypes.GeneticType",
      "es.unileon.rnag.cubiga.chromosome.BitChromosome",
      "es.unileon.rnag.cubiga.chromosome.RangeChromosome",
      "es.unileon.rnag.cubiga.chromosome.Chromosome",
      "es.unileon.rnag.cubiga.datatypes.BitVector",
      "es.unileon.rnag.cubiga.datatypes.Range",
      "es.unileon.rnag.cubiga.datatypes.RangeVector",
      "es.unileon.rnag.cubiga.datatypes.List",
      "es.unileon.rnag.cubiga.chromosome.ListChromosome",
      "es.unileon.rnag.cubiga.gen.Gen"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BitChromosome_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "es.unileon.rnag.cubiga.chromosome.Chromosome",
      "es.unileon.rnag.cubiga.chromosome.BitChromosome",
      "es.unileon.rnag.cubiga.datatypes.List",
      "es.unileon.rnag.cubiga.datatypes.GeneticType",
      "es.unileon.rnag.cubiga.datatypes.ListVector",
      "es.unileon.rnag.cubiga.gen.Gen",
      "es.unileon.rnag.cubiga.gen.RangeGen",
      "es.unileon.rnag.cubiga.datatypes.Range",
      "es.unileon.rnag.cubiga.datatypes.BitVector",
      "es.unileon.rnag.cubiga.gen.BitGen",
      "es.unileon.rnag.cubiga.datatypes.RangeVector",
      "es.unileon.rnag.cubiga.chromosome.ListChromosome",
      "es.unileon.rnag.cubiga.gen.ListGen",
      "es.unileon.rnag.cubiga.chromosome.RangeChromosome"
    );
  }
}
