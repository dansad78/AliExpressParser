package org.example;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.example.model.Item;
import org.example.model.Response;
import org.example.service.ItemWriteToCsv;
import org.example.service.WriteToCsv;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;


public class ParserFromAliExpress {
    public static void main(String[] args) throws IOException {
        WriteToCsv writeToCsv = new ItemWriteToCsv();
        writeToCsv.write("https://gpsfront.aliexpress.com/getRecommendingResults.do?callback=jQuery18307708159037100661_1628137061540&widget_id=5547572&platform=pc&limit=12&offset=120&phase=1&productIds2Top=&postback=1015b5ca-71b0-42d7-80f9-9f0086091fa1&_=1628143789515","example.csv");

    }
}
