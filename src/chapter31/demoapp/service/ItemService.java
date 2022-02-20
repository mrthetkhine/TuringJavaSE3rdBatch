/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter31.demoapp.service;

import chapter31.demoapp.service.model.Item;
import java.util.ArrayList;

/**
 *
 * @author thetkhine
 */
public interface ItemService {
    void addItem(Item item);
    ArrayList<Item> getAllItems();
}
