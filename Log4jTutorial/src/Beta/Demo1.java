package Beta;


import org.apache.logging.log4j.*;

public class Demo1 {
	private static Logger Log = LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Log.debug("Click on the button");
Log.info("Clicked on the button");
Log.error("Button not clicked");
Log.fatal("Button not found");
	}

}
