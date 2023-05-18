package org.example.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception
    {
        if(bannedSites.contains(serverHost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverHost);
    }

}
