package org.example;

import org.example.command.Broker;
import org.example.command.BuyStock;
import org.example.command.SellStock;
import org.example.command.Stock;

public class ClientCode {
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}