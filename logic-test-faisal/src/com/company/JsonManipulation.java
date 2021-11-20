package com.company;


import com.company.model.DataItem;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class JsonManipulation {
    public static void main(String[] args) throws JSONException {
        String str = "[\n" +
                "  {\n" +
                "    \"inventory_id\": 9382,\n" +
                "    \"name\": \"Brown Chair\",\n" +
                "    \"type\": \"furniture\",\n" +
                "    \"tags\": [\n" +
                "      \"chair\",\n" +
                "      \"furniture\",\n" +
                "      \"brown\"\n" +
                "    ],\n" +
                "    \"purchased_at\": 1579190471,\n" +
                "    \"placement\": {\n" +
                "      \"room_id\": 3,\n" +
                "      \"name\": \"Meeting Room\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"inventory_id\": 9380,\n" +
                "    \"name\": \"Big Desk\",\n" +
                "    \"type\": \"furniture\",\n" +
                "    \"tags\": [\n" +
                "      \"desk\",\n" +
                "      \"furniture\",\n" +
                "      \"brown\"\n" +
                "    ],\n" +
                "    \"purchased_at\": 1579190642,\n" +
                "    \"placement\": {\n" +
                "      \"room_id\": 3,\n" +
                "      \"name\": \"Meeting Room\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"inventory_id\": 2932,\n" +
                "    \"name\": \"LG Monitor 50 inch\",\n" +
                "    \"type\": \"electronic\",\n" +
                "    \"tags\": [\n" +
                "      \"monitor\"\n" +
                "    ],\n" +
                "    \"purchased_at\": 1579017842,\n" +
                "    \"placement\": {\n" +
                "      \"room_id\": 3,\n" +
                "      \"name\": \"Lavender\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"inventory_id\": 232,\n" +
                "    \"name\": \"Sharp Pendingin Ruangan 2PK\",\n" +
                "    \"type\": \"electronic\",\n" +
                "    \"tags\": [\n" +
                "      \"ac\"\n" +
                "    ],\n" +
                "    \"purchased_at\": 1578931442,\n" +
                "    \"placement\": {\n" +
                "      \"room_id\": 5,\n" +
                "      \"name\": \"Dhanapala\"\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"inventory_id\": 9382,\n" +
                "    \"name\": \"Alat Makan\",\n" +
                "    \"type\": \"tableware\",\n" +
                "    \"tags\": [\n" +
                "      \"spoon\",\n" +
                "      \"fork\",\n" +
                "      \"tableware\"\n" +
                "    ],\n" +
                "    \"purchased_at\": 1578672242,\n" +
                "    \"placement\": {\n" +
                "      \"room_id\": 10,\n" +
                "      \"name\": \"Rajawali\"\n" +
                "    }\n" +
                "  }\n" +
                "]";


        JSONArray data = new JSONArray(str);
        Gson gson = new Gson();
        DataItem[] dataItems = gson.fromJson(String.valueOf(data),DataItem[].class);

        //        1. Find items in the Meeting Room.
        GetItemRoom(dataItems);
        System.out.println("==================================");

        //        2. Find all electronic devices.
        FindAllElectronic(dataItems);
        System.out.println("==================================");

        //        3. Find all the furniture.
        FindAllFurniture(dataItems);
        System.out.println("==================================");

        //        4. Find all items were purchased on 16 Januari 2020.
        //           millisecond unixtime to date
        String inputTanggal = "16 January 2020";
        FindByDate(dataItems,inputTanggal);
        System.out.println("==================================");

        //        5. Find all items with brown color.
        String inputWarna = "brown";
        FindColor(dataItems,inputWarna);
        System.out.println("==================================");



    }

    private static void GetItemRoom(DataItem[] dataItems){
        for(DataItem dataItem : dataItems){
           if (dataItem.getPlacement().getName().equals("Meeting Room")){
               System.out.println(dataItem);
           }
        }
    }

    private static void FindAllElectronic(DataItem[] dataItems){
        for(DataItem dataItem : dataItems){
            if (dataItem.getType().equals("electronic")){
                System.out.println(dataItem);
            }
        }
    }

    private static void FindAllFurniture(DataItem[] dataItems){
        for(DataItem dataItem : dataItems){
            if (dataItem.getType().equals("furniture")){
                System.out.println(dataItem);
            }
        }
    }

    private static void FindByDate(DataItem[] dataItems,String inputTanggal){
        for(DataItem dataItem : dataItems){
            java.util.Date tanggalPembelian=new java.util.Date((long)dataItem.getPurchasedAt()*1000);
            DateFormat simpleDateFormat = new SimpleDateFormat("d MMMM yyyy");
            String date = simpleDateFormat.format(tanggalPembelian);
            if (inputTanggal.equals(date)){
                System.out.println(dataItem);
            }
        }
    }

    private static void FindColor(DataItem[] dataItems,String input){
        for(DataItem dataItem : dataItems){
            for(String tag : dataItem.getTags()){
                if (input.equals(tag)){
                    System.out.println(dataItem);
                }
            }
        }
    }

}
