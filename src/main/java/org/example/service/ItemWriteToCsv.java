package org.example.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.example.model.Item;
import org.example.model.Response;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

public class ItemWriteToCsv implements WriteToCsv {
    @Override
    public void write(String urlAliExpress, String filename) {
        URL url = null;
        try {
            url = new URL(urlAliExpress);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader buffer = null;
        try {
            buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String content = buffer.lines().collect(Collectors.joining()).replace("/**/jQuery18307708159037100661_1628137061540(","").replace(");","");
        ObjectMapper mapper = new ObjectMapper();
        Response response = null;
        try {
            response = mapper.readValue(content, Response.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        Writer writer = null;
        try {
            writer = new FileWriter(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        StatefulBeanToCsv<Item> itemToCsv = new StatefulBeanToCsvBuilder<Item>(writer)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .build();
        try {
            itemToCsv.write(response.getResults());
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (CsvDataTypeMismatchException e) {
            e.printStackTrace();
        } catch (CsvRequiredFieldEmptyException e) {
            e.printStackTrace();
        }
    }
}
