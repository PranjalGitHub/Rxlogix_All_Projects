package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener{
	
	
	   @Override		
	    public void onFinish(ITestContext arg0) {					
	        			
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext arg0) {					
	        			
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        			
	        System.out.println("Listeners");		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult arg0) {					
	       			
	    	System.out.println("Listeners");	 		
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
		
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	    	
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
		
	        		
	    }		
	}

