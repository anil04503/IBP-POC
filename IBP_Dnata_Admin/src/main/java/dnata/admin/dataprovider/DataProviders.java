/**
 * 
 */
package dnata.admin.dataprovider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import dnata.admin.utility.NewExcelLibrary;


public class DataProviders {

	NewExcelLibrary obj = new NewExcelLibrary();


	@DataProvider(name = "credentials")
	public Object[][] getCredentials() {
		// Totals rows count
		int rows = obj.getRowCount("Credentials");
		// Total Columns
		int column = obj.getColumnCount("Credentials");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Credentials", j, i + 2);
			}
		}
		return data;
	}
	
	@DataProvider(name = "email")
	public Object[][] getEmail() {
		// Totals rows count
		int rows = obj.getRowCount("Email");
		// Total Columns
		int column = obj.getColumnCount("Email");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Email", j, i + 2);
			}
		}
		return data;
	}
	
	@DataProvider(name = "getProduct")
	public Object[][] getProduct() {
		// Totals rows count
		int rows = obj.getRowCount("ProductDetails");
		// Total Columns
		int column = obj.getColumnCount("ProductDetails");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("ProductDetails", j, i + 2);
			}
		}
		return data;
	}

	@DataProvider(name = "searchProduct")
	public Object[][] getProductPrice() {
		// Totals rows count
		int rows = obj.getRowCount("SearchProduct");
		// Total Columns
		int column = obj.getColumnCount("SearchProduct");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("SearchProduct", j, i + 2);
			}
		}
		return data;
	}
	
	@DataProvider(name = "wrongUser")
	public Object[][] EnterwrongUser() {

		// Totals rows count
		int rows = obj.getRowCount("Wrongusr");
		// Total Columns
		int column = obj.getColumnCount("Wrongusr");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("Wrongusr", j, 1),
						obj.getCellData("Wrongusr", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	@DataProvider(name = "wrongUserandPwd")
	public Object[][] EnterwrongUserandPwd() {

		// Totals rows count
		int rows = obj.getRowCount("Wrongusrpwd");
		// Total Columns
		int column = obj.getColumnCount("Wrongusrpwd");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("Wrongusrpwd", j, 1),
						obj.getCellData("Wrongusrpwd", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	@DataProvider(name = "ValidUserandPwd")
	public Object[][] entercorrectUserandPwd() {

		// Totals rows count
		int rows = obj.getRowCount("Validusrpwd");
		// Total Columns
		int column = obj.getColumnCount("Validusrpwd");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("Validusrpwd", j, 1),
						obj.getCellData("Validusrpwd", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	@DataProvider(name = "branchaddcompany")
	public Object[][] enterBranchcompanydetails() {

		// Totals rows count
		int rows = obj.getRowCount("BranchCompanyDetails");
		// Total Columns
		int column = obj.getColumnCount("BranchCompanyDetails");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("BranchCompanyDetails", j, 1),
						obj.getCellData("BranchCompanyDetails", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	@DataProvider(name = "B2Baddcompany")
	public Object[][] enterB2Bcompanydetails() {

		// Totals rows count
		int rows = obj.getRowCount("B2BCompanyDetails");
		// Total Columns
		int column = obj.getColumnCount("B2BCompanyDetails");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("B2BCompanyDetails", j, 1),
						obj.getCellData("B2BCompanyDetails", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	@DataProvider(name = "compUserCreation")
	public Object[][] enterCompUserdetails() {

		// Totals rows count
		int rows = obj.getRowCount("CompUserCreation");
		// Total Columns
		int column = obj.getColumnCount("CompUserCreation");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("CompUserCreation", j, 1),
						obj.getCellData("CompUserCreation", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	

}
