package com.jbalbuen.demoPaymentWS.mercadopago.auth.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MercadoPagoAuthRequest {
    private String clientSecret;
    private String clientId;
    private String grantType;
}
