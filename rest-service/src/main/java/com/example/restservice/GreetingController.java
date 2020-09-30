package com.example.restservice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.temporal.ValueRange;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/*import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	/*@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	} */
	
/*	@PostMapping("/greeting2")
	public Greeting greeting2(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	} */
	
	@PostMapping("/simulate")
	public DeviceData generate(@RequestBody PatientInfo patient) throws IOException {
		
		
		
		
		System.out.print("Patient age is " + patient.getAge());
		System.out.print("Patient Id is " + patient.getPatientId());

		System.out.print("Patient Smoke is " + patient.getSmoke());

		System.out.print("Patient Sex is " + patient.getSex());
		
		return generateGandRData(patient.getAge(), patient.getSex());
		
		//patient.getAge() 

		
		///Generate the G values based on age and sex
		
		//obtaining input bytes from a file  
	   /* FileInputStream fis=new FileInputStream(new File("/Users/shivanireddysingireddy/Downloads/Attributes.xlsx"));  
		//creating workbook instance that refers to .xls file  
		XSSFWorkbook wb=new XSSFWorkbook(fis);   
		//creating a Sheet object to retrieve the object  
		XSSFSheet sheet=wb.getSheetAt(0);  
		//evaluating cell type   
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
		for(Row row: sheet)     //iteration over row using for each loop  
		{  
		for(Cell cell: row)    //iteration over cell using for each loop  
		{  
		switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
		{  
		case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
		//getting the value of the cell as a number  
		System.out.print(cell.getNumericCellValue()+ "\t\t");   
		break;  
		case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
		//getting the value of the cell as a string  
		System.out.print(cell.getStringCellValue()+ "\t\t");  
		break;  
		}  
		}  
		System.out.println();  
		}  
		 
		
		return null; */
		
	}
	
	
	public  DeviceData generateGandRData(int Age, int Sex) throws FileNotFoundException {
		
		
		 Random rand = new Random();
		
		 ValueRange range20_29 = ValueRange.of(20, 29);
		 ValueRange range30_39 = ValueRange.of(30, 39);
		 ValueRange range40_49 = ValueRange.of(40, 49);
		 ValueRange range50_59 = ValueRange.of(50, 59);
		 ValueRange range60_69 = ValueRange.of(60, 69);
		 ValueRange range70_79 = ValueRange.of(70, 79);
		 
		 DeviceData simulatedData = new DeviceData();
		 
		 FileInputStream fis= new FileInputStream(new File("/Users/shivanireddysingireddy/Desktop/Book1.xlsx")); 
		 
		 if (range20_29.isValidIntValue(Age) && Sex == 1) {
			int trestbps =  (int) (Math.random() * (140 - 120 + 1) + 120);
			int chol =  (int) (Math.random() * (250 - 130 + 1) + 130);
			
			
			simulatedData.setChol(chol);
			simulatedData.setTrestbps(trestbps);
			 
		 }
		 
		 
		 
		 //Generate R data 
		 
		 
		 
		  
		return simulatedData;
		  
		/* System.out.println("hjlhjn,mc  " +  range.isValidIntValue(Age));
		
		switch(Age) {
		
		
		case 0-10: 
			System.out.println("age now is");
			break;
		case 2 :
			System.out.println("kgdjksc");
		
		 //return null;
		}
		
		return null; */
		
		
	}
	
		
	
}
