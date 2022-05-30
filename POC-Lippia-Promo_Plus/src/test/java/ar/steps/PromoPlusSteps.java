package ar.steps;

import api.config.EntityConfiguration;
import ar.Validator.PromoValidator;
import com.claro.sp.automation.testCellulars.controller.CellularController;
import com.claro.sp.tecnoapis.model.subscriber.Cellular;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import com.google.api.client.repackaged.com.google.common.base.Splitter;
import cucumber.api.java.en.When;
import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import services.BaseService;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import static com.sp.ta.tecno.UpdateSubscriber.updateSubscriber;

public class PromoPlusSteps extends PageSteps {
    private static CellularController controller;
    static String billNumber = null;


    @When("^I perform a '(.*)' to '(.*)' endpoint with the '(.*)' and '(.*)'$")
    public void doRequest(String methodName, String entity, String jsonName, String jsonReplacementValues) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Class entityService = EntityConfiguration.valueOf(entity).getEntityService();
        Map<String, String> parameters = getParameters(jsonReplacementValues);
        String jsonPath = "request/".concat(jsonName);
        if (parameters == null) {
            entityService.getMethod(methodName.toLowerCase(), String.class).invoke("", jsonPath);
        } else {
            entityService.getMethod(methodName.toLowerCase(), String.class, Map.class).invoke("", jsonPath, parameters);
        }
    }

    private Map<String, String> getParameters(String jsonReplacementValues) {
        Map<String, String> parameters = null;
        if (!StringUtils.isEmpty(jsonReplacementValues)) {
            parameters = Splitter.on(",").withKeyValueSeparator(":").split(jsonReplacementValues);
        }
        return parameters;
    }


    @Given("tengo una linea (.*) y un profile (.*)")
    public void tengoUnaLineaBussinessTypeYUnProfileProfileId(String bussinesType, String profile) {
        Cellular cellular = null;
        try {
            System.out.println("<---GENERO UN NUMERO DE LINEA--->");
            controller = new CellularController("TEST", "AR", "ghct", "auto_333", "ghct", "auto_333"); //Para testing.
            Cellular newCellular = new Cellular();
            newCellular.setBusinessType(bussinesType);   //Opcional. Para indicar si la genera como PP o CR.
            newCellular = controller.cellularProvisioning(newCellular);
            if (!bussinesType.equalsIgnoreCase("PP")) {
                updateSubscriber()
                        .user("ghct")
                        .password("auto_333")
                        .environment("TEST")
                        .country("AR")
                        .subId(newCellular.getSubid())
                        .profileid(profile)
                        .execute();
            }
            billNumber = newCellular.getCellularNumber();
            System.out.println("<------NUMERO DE LINEA GENERADO : " + billNumber + " de tipo: " + bussinesType + "------>");
            cellular = newCellular;
        } catch (Error e) {
            String mensaje = "Error al crear la linea de tipo " + bussinesType + " " + e.getMessage();
            Assert.fail(mensaje);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @And("ingreso un monto (.*) y una linea")
    public void ingresoUnMontoMontoYUnaLinea(String monto) {
        BaseService.linea.set(billNumber);
        BaseService.monto.set(monto);

    }

    @And("obtengo las promociones para el monto (.*) y (.*) (.*) (.*)")
    public void obtengoLasPromocionesParaElMontoMonto(String Monto, String pDato, String pVoz, String pDinero) {
        PromoValidator.validate(pDato,pVoz,pDinero);
    }
}
