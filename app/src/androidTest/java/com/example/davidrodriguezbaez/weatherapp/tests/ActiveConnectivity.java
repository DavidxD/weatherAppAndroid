package com.example.davidrodriguezbaez.weatherapp.tests;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;


/**
 * Created by davidrodriguezbaez on 14/11/2017.
 */
@RunWith(AndroidJUnit4.class)
public class ActiveConnectivity extends AndroidTestCase {

    private ConnectivityManager connectivity;
    private static final String  URL_NAME = "http://www.google.co.uk";

    @Override
    public void setUp() {
        connectivity = (ConnectivityManager) getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        assertNotNull(connectivity);
    }

    /**
     * Test that there is a network
     */
    @Test
    public void testActiveConnectivity() {
        NetworkInfo networkInfo = connectivity.getActiveNetworkInfo();
        assertNotNull(networkInfo);
        assertEquals( NetworkInfo.State.CONNECTED, networkInfo.getState());
    }

    /**
     * Test that a connection can be established through the active network
     */
    @Test
    public void testConnectionCreation() throws IOException {
        URL url = new URL(URL_NAME);
        assertNotNull(url);
        URLConnection connection = url.openConnection();
        assertNotNull(connection);
        connection.connect();
    }
}
