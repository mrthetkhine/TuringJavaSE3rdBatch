/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter31.demoapp.service;

import chapter31.demoapp.service.model.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thetkhine
 */
public class ItemServiceImpl implements ItemService{
    ArrayList<Item> items = new ArrayList<Item>();

    @Override
    public void addItem(Item item) {
        this.items.add(item);
    }

    @Override
    public ArrayList<Item> getAllItems() {
        return this.items;
    }
}
