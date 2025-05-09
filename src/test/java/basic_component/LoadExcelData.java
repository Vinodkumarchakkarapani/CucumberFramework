package basic_component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.Test;


public class LoadExcelData {
	
	
	int iMatchCount=0;
    int iFetchRow=-1;
    boolean fileFlagCheck=false;
    protected String testName, testId,applicationId,profileName,applicantLastName,applicantInitials;
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
    	LoadExcelData ee= new LoadExcelData();
    	ee.commonTestDataLoad("testCaseId","testCaseName","browser");
    }
    
    public boolean commonTestDataLoad(String testCaseId,String testCaseName,String browser) throws FileNotFoundException,IOException {
        String filePath= System.getProperty("user.dir").concat("C:\\Users\\vinow\\OneDrive\\Desktop\\Testnput.xlsx");
        File inputFile= new File(filePath);
        if(inputFile.isFile()&&inputFile.exists()) {
            System.out.println("Test Data Input File is present in user directory ");
        }else {
            System.out.println("Test Data Input File is not present in user directory ");
            return false;
        }
        // Load FIle inputStream
        FileInputStream xlsxFile= new FileInputStream(filePath);
        @SuppressWarnings("resource")
        XSSFWorkbook xlsxWorkBook= new XSSFWorkbook(xlsxFile);
        XSSFSheet xlsxSheet=xlsxWorkBook.getSheet("InputSheet");
        String TestData[][]= new String[xlsxSheet.getLastRowNum()+1][xlsxSheet.getRow(0).getLastCellNum()];

        // Row Iteration
        for(int i=0; i<TestData.length;i++) {
            XSSFRow sheetRow= xlsxSheet.getRow(i);
            if(sheetRow==null) {
                sheetRow=xlsxSheet.createRow(i);
            }
            for(int j=0;j<TestData[i].length;j++) {
                String sCellValue="";
                Cell cell= sheetRow.getCell(j);
                if(cell==null) {
                    cell= sheetRow.createCell(j);
                    TestData[i][j]="";
                }else {
                    DataFormatter formatter= new DataFormatter();
                    Cell cellOne= xlsxSheet.getRow(i).getCell(j);
                    sCellValue=formatter.formatCellValue(cellOne);
                    TestData[i][j]=sCellValue;
                }
            }
        }

        // Assign values from excel sheet to variable
        for(int j=0;j<TestData.length;j++) {
            if(TestData[j][1].equalsIgnoreCase(testCaseId)&&TestData[j][2].equalsIgnoreCase(testCaseName)&&TestData[j][3].equalsIgnoreCase(browser)) {
                System.out.println("Data Match is there");
                iFetchRow=j;
                iMatchCount++;
            }
        }
        
        if(iMatchCount>1) {
            System.out.println("Number of matching records is more than one");
            return false;
            
        }else if(iMatchCount<1) {
            System.out.println("Number of matching records is nil");
            return false;
        }else {
            this.testId= TestData[iFetchRow][1];
            this.testName= TestData[iFetchRow][2];
            this.applicationId= TestData[iFetchRow][3];
            this.profileName= TestData[iFetchRow][4];
            this.applicantInitials= TestData[iFetchRow][5];
            fileFlagCheck= true;        
        }
        return fileFlagCheck;
    }

    

}