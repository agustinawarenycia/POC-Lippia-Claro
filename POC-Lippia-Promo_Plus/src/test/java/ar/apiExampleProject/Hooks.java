package ar.apiExampleProject;
import com.claro.sp.automation.objetosPrepago.Properties;
import com.claro.sp.automation.testCellulars.controller.CellularController;
import gherkin.ast.Scenario;
import io.cucumber.java.*;
import org.apache.log4j.Logger;
import services.BaseService;

public class Hooks extends BaseService  {
    CellularController cellularController = new CellularController("TEST", "AR", "ghct", "auto_333", "ghct", "auto_333");

    public Hooks() throws Exception {
    }


    @Before()
    public void setScenario(Scenario scenario) {
        Logger.getRootLogger().info("-----------" + scenario.getName() + "-----------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("----------INICIO PRUEBA----------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Starting - " + scenario.getName());
        System.out.println("REGION: " + Properties.country);
        System.out.println("AMBIENTE: " + Properties.environment);
        System.out.println("USER:" + Properties.userProd + " PASSWORD: " + Properties.passwordProd);
        System.out.println("--------------------------------------------------------------");
    }

    @After()
    public void dismissAll(Scenario scenario) throws Exception {
        Logger.getRootLogger().info(" ending -----------" + scenario.getName() + "-----------");
        String billNumber = cellular.getBillNumber();
        cellularController.deleteCellular(cellular);
        System.out.println("<---SE ELIMINA LA LINEA GENERADA: " + billNumber + "--->");
        System.out.println("<------ FIN PRUEBA ------>");

    }
}
