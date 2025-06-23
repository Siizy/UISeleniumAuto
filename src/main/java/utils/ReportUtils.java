package utils;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportUtils {

	public static ExtentSparkReporter spark;
	public static ExtentReports extent;
	public static ExtentTest log;
	

	public static ExtentReports initReport() throws IOException {

		String time = String.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyy hh.mm.ss a")));

		spark = new ExtentSparkReporter("target/AutomationReport_" + time + ".html");

		extent = new ExtentReports();
		extent.attachReporter(spark);

		spark.config().setDocumentTitle(BaseUtils.getConfigValue("documentTitle"));
		spark.config().setReportName(BaseUtils.getConfigValue("reportName"));
		spark.config().setTheme(Theme.STANDARD);

		return extent;

	}

	public static void generateReport() {
		extent.flush();
	}

	public static void createTest(String methodName) {
		log = extent.createTest(methodName);
		
	}
	
	public static  ExtentTest getLog() {
		return log;
	}

}
