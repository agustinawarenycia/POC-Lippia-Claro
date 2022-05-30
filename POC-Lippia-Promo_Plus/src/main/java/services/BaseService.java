package services;

import api.report.CucumberReporter;
import com.claro.sp.tecnoapis.model.subscriber.Cellular;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Request;
import com.crowdar.api.rest.Response;
import com.crowdar.core.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class BaseService extends MethodsService {

    public static final ThreadLocal<String> linea = new ThreadLocal<String>();
    public static final ThreadLocal<String> monto = new ThreadLocal<String>();
    public static final Cellular cellular = new Cellular();

    public static <T> Response get(String jsonRequest, Map<String, String> params, Class<T> classModel) {
        Request request = getRequest(jsonRequest, params);
        request.getHeaders().put("Accept-Charset", "utf-8");
        showRequest(request);
        Response resp = get(request, classModel);
        String entity = classModel.getName().substring(classModel.getName().lastIndexOf(".") +1);
        showResponse(entity);
        return resp;
    }
    public static <T> Response post(String jsonRequest, Map<String, String> params, Class<T> classModel) {
        Request request = getRequest(jsonRequest, params);
        request.getHeaders().put("Accept-Charset", "utf-8");
        showRequest(request);
        Response resp = post(request, classModel, getRestClient());
        String entity = classModel.getName().substring(classModel.getName().lastIndexOf(".") +1);
        showResponse(entity);
        return resp;
    }
    private static void showRequest(Request request) {
        CucumberReporter.addTestStepLog("<---------------------------------------- REQUEST ---------------------------------------->");
        String strRequest =
                "<textarea readonly=\"\" class=\"code-block\">" +
                        "\nEndpoint: " + request.getUrl() + request.getEndpoint() +
                        "\nHeader: " + JsonUtils.serialize(request.getHeaders()) +

                        "\nBody: " + JsonUtils.serialize(request.getBody()).replace("\\", "") +
                        "</textarea>";
        CucumberReporter.addTestStepLog(strRequest);
    }
    public static void showResponse(String entity) {
        ObjectMapper mapper = new ObjectMapper();
        Response response = APIManager.getLastResponse();
        Object obj = response.getResponse();
        CucumberReporter.addTestStepLog("<----------------------------------------" +  String.format("\nRESPONSE %s: ", entity) + "---------------------------------------->");
        String strResponse;

        try {
            strResponse = "<textarea readonly=\"\" class=\"code-block\">" +
                    mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj) +
                    "</textarea>";
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            strResponse = "ERROR al mostrar la respuesta del servicio.";
        }
        CucumberReporter.addTestStepLog(strResponse);
        CucumberReporter.addTestStepLog(
                "\nStatusCode: " + response.getStatusCode() +
                "\nMessage: " + response.getMessage());
    }

}
