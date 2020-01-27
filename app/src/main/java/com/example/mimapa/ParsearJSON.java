package com.example.mimapa;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.net.URL;


public class ParsearJSON {

    public ArrayList<Museo> getMuseos(InputStream input) {
        BufferedReader in = null;
        ArrayList<Museo> museos = new ArrayList<Museo>();
        try {
            String json = "";
            BufferedReader bf = new BufferedReader(new InputStreamReader(input));
            String texto = bf.readLine();
            while (texto != null) {
                json += texto;
                texto = bf.readLine();
            }
            JSONObject objeto_total = new JSONObject(json);
            Log.d(json,json);
            JSONArray graph = objeto_total.getJSONArray("@graph");

            for (int i = 0; i < graph.length(); i++){
//                JSONObject

            }


//            for (int i = 0; i < datalines.length(); i++) {
//                JSONObject linea = (JSONObject) datalines.get(i);
//                String line = linea.getString("line");
//                String direction = linea.getString("direction");
//                String headerA = linea.getString("headerA");
//                String headerB = linea.getString("headerB");
//                String x = "";
//                Museo pa = new Museo(2,3,"");
//                museos.add(pa);
//
//            }
            System.out.println(objeto_total);
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }catch (JSONException jsonE){
            jsonE.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }




        return museos;

    }


}
