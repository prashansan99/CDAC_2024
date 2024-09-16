package com.example.logger;

public class Logger {

		String message;
		private Logger() {
			this.message = "Currently no log exist!";
		}
		
		private static Logger reference = null;
		public static Logger getInstance() {
			if( reference == null )
				reference = new Logger();
			return reference;
		}
		public void log(String message) {
			this.message = message;
		}
		public String getLog() {
			return message;		
		}
		public void clearLog() {
			this.message = "Currently no log exist!";
			System.out.println("Logs cleared!");
		}
		
	}

