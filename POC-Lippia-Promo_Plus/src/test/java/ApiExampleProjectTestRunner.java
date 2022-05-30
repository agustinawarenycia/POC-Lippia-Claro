import com.claro.sp.automation.objetosPrepago.Properties;
import com.crowdar.bdd.cukes.TestNGSecuencialRunner;
import org.junit.BeforeClass;

public class ApiExampleProjectTestRunner extends TestNGSecuencialRunner {
    @BeforeClass
    public static void beforeTest() throws Exception {

        //se obtienen las variables parametricas, utilizar las necesarias en cada caso
        Properties.userCcard     = System.getProperty("UserCcard");
        Properties.passwordCcard = System.getProperty("PasswordCcard");
//
        Properties.userProd      = System.getProperty("UserProd");
        Properties.passwordProd  = System.getProperty("PasswordProd");
//
        Properties.environment   = System.getProperty("Environment");
        Properties.country       = System.getProperty("Country");
        //Properties.flagCpa = Boolean.valueOf(System.getProperty("FlagCpa"));

        //Se validan que las propiedades no sean nulas o tengan los valores esperados
        //Si se agregan o se eliminan propiedades, se debe actualizar el validate()
        Properties.validate();
    }
}
