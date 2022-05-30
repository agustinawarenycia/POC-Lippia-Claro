package ar.Validator;

//import api.model.project.ProjectResponse;
import api.model.promoPlusModel.ProductOfferingQualificationItemItem;
import api.model.promoPlusModel.ProductRelationshipItem;
import api.model.promoPlusModel.ResponsePromoPlusModel;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import org.testng.Assert;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;

public class PromoValidator {
    static Response response;
    static ResponsePromoPlusModel responsePost;

    public static void validate(String pDato, String pVoz, String pDinero){

      //ProductOfferingQualificationItemItem[] response = (ProductOfferingQualificationItemItem[]) APIManager.getLastResponse().getResponse();



        ResponsePromoPlusModel listaM = (ResponsePromoPlusModel) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(listaM.getId(),"123456789", "No tiene promocion");

        List<ProductOfferingQualificationItemItem> lista1 = listaM.getProductOfferingQualificationItem();

        for (ProductOfferingQualificationItemItem i : lista1) {
            for (ProductRelationshipItem y : i.getProduct().getProductRelationship()) {
                System.out.println("--------------------------------------------------------------");
                System.out.println("EL PACK ES: " + y.getProduct().getName());
                System.out.println("--------------------------------------------------------------");
                String name = y.getProduct().getName();
                switch (name) {
                    case "PACKS_VOICE_OFFNET_PLUS":
                    case "PACKS_VOICE_MIX_PLUS":
                    case "PACKS_VOICE_ONNET_PLUS":
                        org.junit.Assert.assertThat(y.getProduct().getName(), containsString(pVoz));
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("COINCIDE EL PACK " + y.getProduct().getName());
                        System.out.println("--------------------------------------------------------------");
                        break;
                    case "PACKS_DATA_PLUS":
                        org.junit.Assert.assertThat(y.getProduct().getName(), containsString(pDato));
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("COINCIDE EL PACK " + y.getProduct().getName());
                        System.out.println("--------------------------------------------------------------");
                        break;
                    case "FUNDS_PROMOTIONAL_PLUS":
                        org.junit.Assert.assertThat(y.getProduct().getName(), containsString(pDinero));
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("COINCIDE EL PACK " + y.getProduct().getName());
                        System.out.println("--------------------------------------------------------------");
                        break;
                    default:
                        System.out.println("No se encuentra esta promocion" + name);
                }


            }
        }

        //Assert.assertEquals(name,response.getName(),"Nombre de proyecnto no coincide");
    }

}
