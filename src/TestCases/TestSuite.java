package testCases;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestValidatingModule.class, TestPulseRate.class,TestTemprature.class,TestOxygenConcentration.class})
public class TestSuite{
}
