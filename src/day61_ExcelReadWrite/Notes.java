package day61_ExcelReadWrite;

public class Notes {
	/*
	 12/09/2019
Topic:  1. Excel file Read & Write
        2. Data structure
                Collections Intro
WarmUp: 
        1. go to Canvas-> java -> Modules -> Day61_Excel Reader 
        2. donwload "Apache POI Library" zip folder
        3. unzip it and copy&past unzipped folder to desktop
        
        4. Open Excel Application and Store the following data :
                                |   Name    |       Job Title       |   Salary      |
                                | your name |  your job Title       | your Salary   |
                                
                    (If you don't have excel it's fine, just pay close attendtion to)
        5. save it to desk top as TestData.xlsx
Package Name: day61_ExcelReadWrite
how to unzip:
        Mac Operating system: double click the zip folder
        Windows operating system: right click the zip folder -> Extract All
Apache POI Library: used for Data Driven Testing. there special classes & interfaces that we can use to retrive data from excel file
How to add external jars & libraries to java project:
        right click the project -> properties -> Java Build Path -> Library ->  click classPath(if you have) -> click "Add External Jars&Libraries" -> add all the jar files that you needed
        Apply -> apply&close
        in a maven project we don't need to download and add libraries manually, it's all done by writeing the dependecies
            <dependency>
                <groupId>org.apache.poi</groupId>
                <artifactId>poi</artifactId>
                <version>4.0.0</version>
            </dependency>
FileInputStream: helps us to read file
WorkBook(I) : designed for excelfile, reads excel files
                implemented by XSSFWorkBook class
Sheet(I): helps to get spreadsheets from excel file
               implemented by XSSFSheet class
Cell(I): helps us to retrive specific cell 
	 */

}
