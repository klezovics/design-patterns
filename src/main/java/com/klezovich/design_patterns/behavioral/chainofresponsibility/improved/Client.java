package com.klezovich.design_patterns.behavioral.chainofresponsibility.improved;


public class Client {

    public static void main(String[] args) {


        PaymentCheckoutHandler handler = new PaymentCheckoutHandler();
        CustomerInfoCheckoutHandler customerInfoCheckoutHandler = new CustomerInfoCheckoutHandler();

        handler.setNextHandler(customerInfoCheckoutHandler);


        handler.handlCheckout();




    }

}
