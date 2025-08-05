package com.jbalbuen.demoPaymentWS.mercadopago.auth.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MercadoPagoAuthResponse {
    private String accessToken;
    private String tokenType;
    private Long expiresIn;
    private String scope;
    private Long userId;
    private String refreshToken;
    private String publicKey;
    private Boolean liveMode;
}
