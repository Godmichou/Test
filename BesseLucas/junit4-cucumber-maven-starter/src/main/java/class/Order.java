package dojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String from;
    private String to;
    private List<String> contents = new ArrayList<String>();

    public void declareOwner(String mrpignon) {
        this.from = mrpignon ;
    }
    public void declareTarget(String mrleblanc) {
        this.to = mrleblanc ;
    }
    public List<String> getCocktails() {
        return contents;
    }
