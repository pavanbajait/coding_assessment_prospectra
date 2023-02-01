package com.pavan_bajait.main;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class CSVMatrix {

    private static final String CSV_FILE_CUSTOM_SEPARATOR
        = "D:\\EclipseWorkSpace\\CSVOperations\\results_semicolon_Separator.csv";
        
    public static void main(String[] args) {
         System.out.println("Custom Separator here semi-colon\n");
        readDataFromCustomSeparator(CSV_FILE_CUSTOM_SEPARATOR);
        System.out.println("_______________________________________________");
    }
    
    private static Map<String,Integer> map = new HashMap<>();
    
     public static void readDataFromCustomSeparator(String file)
    {
        try {
            FileReader filereader = new FileReader(file);
  
            CSVParser parser = new CSVParserBuilder().withSeparator(',').build();
  
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                                      .withCSVParser(parser)
                                      .build();
  
            List<String[]> allData = csvReader.readAll();
  
            for (String[] row : allData) {
                for (String cell : row) {
                    int val = getResult(cell);
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


public static int getResult(String input){
    String [] arr = input.split(":");
    if(isNumeric(arr[1])){
    	map.put(arr[0],Integer.parseInt(arr[1]));
    	return Integer.parseInt(arr[1]);
    }else{
    	return calculateValue(arr[1]);
    }
}

public static int calculateValue(String form) {
	String[] arr = form.split("");
	int ans =0;
	for(int i=0;i<arr.length;i++) {
		if(isNumeric(arr[i])) {
			ans+=Integer.parseInt(arr[i]);
		}
		else if(arr[i]!="+") {
			ans+=map.get(arr[i]);
		}
	}
	return ans;
}
private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false; 
    }
    return pattern.matcher(strNum).matches();
}
}
