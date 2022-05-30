Feature: Lippia Example
  Como usuario quiero ver las promociones disponibles para mi linea

  @Example @Success
  Scenario Outline: Obtener promociones datos, Voz y Dinero con un monto medio de <monto>
    Given tengo una linea <bussinessType> y un profile <profileId>
    And ingreso un monto <monto> y una linea
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And obtengo las promociones para el monto <monto> y <beneficio1> <beneficio2> <beneficio3>

    Examples:
      | jsonName             | operation | entity    | bussinessType | profileId | monto | beneficio1      | beneficio2  | beneficio3             |
      | promo_plus_con_promo | POST      | PROMOPLUS | PP            | 1257      | 500   | PACKS_DATA_PLUS | PACKS_VOICE | FUNDS_PROMOTIONAL_PLUS |

