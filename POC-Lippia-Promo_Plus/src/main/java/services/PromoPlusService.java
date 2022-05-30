package services;

import api.model.Data;
import api.model.promoPlusModel.ProductOfferingQualificationItemItem;
import api.model.promoPlusModel.ResponsePromoPlusModel;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;
import com.crowdar.util.MapUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;


public class PromoPlusService extends BaseService {

    public static Response post(String jsonName) {
        return post(jsonName,setParams(), ResponsePromoPlusModel.class);
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("linea", linea.get());
        params.put("monto",monto.get());
        return params;
    }



}


