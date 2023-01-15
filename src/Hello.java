/*
package com.java.collectionsTutoring;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;

public class FileHandlingExercise3 {

    public static void main(String[] args) {

        //// Convert JSON array to CSV file, then to excel

        //Reading JSON Array from a File

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            List<Map<String,Object>> sampleJSON = objectMapper.readValue(
                    new File("src/CarClientOwnInput.json"),
                    new TypeReference <List<Map<String,Object>>>(){});


            Map<String,Object> testMap = new HashMap();
            testMap.put("anyKey", sampleJSON);


            // Convert Map into String (convert -> use .writeValueAsString

            String convertToString = objectMapper.writeValueAsString(testMap);

            JSONObject jsonObject = new JSONObject(convertToString);

            JSONArray jsonArrayVar = jsonObject.getJSONArray("anyKey");


            String varForCsv = CDL.toString(jsonArrayVar);
            System.out.println(varForCsv);

            File file = new File("src/fromJSON.csv");

            FileUtils.writeStringToFile(file, varForCsv); //other way is we can use FileWriter but it's longer


            //// Reading CSV file

            // Create an object of filereader
            // class with CSV file as a parameter.
            FileReader filereader = new FileReader(file);

            // create csvReader object passing
            // file reader as a parameter
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            // we are going to read data line by line
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }

            //// Create a JSON from CSV file

            List <Map<String, Object>> csvFileToJson = new ArrayList();

            int i=0;


            List <String> listOfHeaders = new LinkedList();


            while ((nextRecord = csvReader.readNext()) != null) {

                Map<String,Object> carsMap = new HashMap();

                int j=0;

                for (String cell : nextRecord) {

                    if(i==0) {
                        //always the headers iteration
                        listOfHeaders.add(cell);

                    }else {
                        //for the values processing
                        String key = listOfHeaders.get(j);

                        carsMap.put(key, cell);
                    }
                    j++;
                }
                csvFileToJson.add(carsMap);
                i++;
            }
            System.out.println(listOfHeaders);

            //Parse JSON to a single Java Object / read a JSON file
            //-> TheObject obj = objectmapper.readValue(new File("thepath.json"),TheObject.class);

            //Convert JSON array to java object list, thus list of object or list of Map<S,O>
            //Two ways to do this;  First:
            //-> List <TheObject> objList = objectmapper.readValue(new File("thepath.json"),new TypeReference<List<TheObject.class>>(){});
            //System.out.println(objList);


            //Convert JSON array to java array
            //Second using Array:
            //-> TheObject[] objArray = objectmapper.readValue(new File("thepath.json"), TheObject[].class);
            // for (TheObject eachObj : objArray) {
            //		System.out.println(eachObj);
            // }



        } catch (StreamReadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DatabindException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}*/
