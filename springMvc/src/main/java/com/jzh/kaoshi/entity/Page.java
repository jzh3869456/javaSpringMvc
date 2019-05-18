package com.jzh.kaoshi.entity;

public class Page {

    private int startPage;// 起始页

    private int endPage;// 终止页

    private int dataNumber;// 每页显示的数据量

    public Page() {
    }

    public Page(int startPage, int endPage, int dataNumber) {
        this.startPage = startPage;
        this.endPage = endPage;
        this.dataNumber = dataNumber;
    }

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public int getDataNumber() {
        return dataNumber;
    }

    public void setDataNumber(int dataNumber) {
        this.dataNumber = dataNumber;
    }

    @Override
    public String toString() {
        return "Page{" +
                "startPage=" + startPage +
                ", endPage=" + endPage +
                ", dataNumber=" + dataNumber +
                '}';
    }
}
