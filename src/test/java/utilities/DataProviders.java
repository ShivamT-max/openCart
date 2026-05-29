package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name = "LoginData")
	public String[][] getData() throws Exception {

		String path = ".\\testData\\TestData.xlsx";
		ExcelUtilities excelutil = new ExcelUtilities(path);
		int totalrows = excelutil.getRowCount(path);
		int totalCol = excelutil.getCellCount("Sheet1", 1);
		String loginData[][] = new String[totalrows][totalCol];
		for (int i = 1; i < totalrows; i++) {
			for (int j = 0; j < totalCol; j++) {
				loginData[i-1][j] = excelutil.getCellData("Sheet1", i, j);
			}
		}
		return loginData;
	}

}
