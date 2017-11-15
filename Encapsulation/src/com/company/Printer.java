package com.company;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private String type;

    Printer(int tonerLevel, int pagesPrinted, String type){
        if(tonerLevel > 0 || tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }
        if(pagesPrinted>0){
            this.pagesPrinted = pagesPrinted;
        }
        this.type = type;
    }

    public void print(int pages){
        System.out.println("Printing your " + pages + " pages");
        if(this.type == "duplex"){
            System.out.println("inside the duplex loop");
            this.pagesPrinted += (pages%2 == 0) ? pages/2 : pages/2+1;
        } else{
            this.pagesPrinted += pages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
