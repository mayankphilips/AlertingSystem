package src.TestCases;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({ 
   TestValidatingModule.class,TestPulseRate.class,TestTemprature.class,TestOxygenConcentration.class
})
public class TestSuite {

}
