package org.example.proxy;

class RealInternet implements Internet{

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to " + serverHost);
    }
}
