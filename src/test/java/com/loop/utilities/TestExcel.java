package com.loop.utilities;

public class TestExcel {

    public static void main(String[] args) {



    ExcelUtils excelUtils = new ExcelUtils("/Users/user/Desktop/TestExcel.xlsx", "Sheet1");
        System.out.println(excelUtils.getCellData(1, 1));

    }
}
