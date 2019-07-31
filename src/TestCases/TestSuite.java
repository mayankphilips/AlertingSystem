package TestCases;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)
@Suite.SuiteClasses({TestValidatingModule.class, TestPulseRate.class,TestTemprature.class,TestOxygenConcentration.class,TestAlertRaisingModule.class})
public class TestSuite{}