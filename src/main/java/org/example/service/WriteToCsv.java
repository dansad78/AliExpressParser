package org.example.service;

import org.example.model.Item;

import java.util.List;

public interface WriteToCsv {

    void write(List<Item> items, String filename);
    List<Item> getDataFromAliExpress(Integer pageNumber);
}
