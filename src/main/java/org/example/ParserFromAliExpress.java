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
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;


public class ParserFromAliExpress {
    public static void main(String[] args) throws IOException {
        LocalDateTime start = LocalDateTime.now();
        WriteToCsv writeToCsv = new ItemWriteToCsv();
        List<Item> items = writeToCsv.getDataFromAliExpress(10);
        writeToCsv.write(items,"example.csv");
        LocalDateTime end = LocalDateTime.now();
        System.out.println(Duration.between(start,end));

    }
}
