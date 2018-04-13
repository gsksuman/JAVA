public class Log4JImpl {
	private Properties log4j2Properties=new Properties();
	private String maxFileSize="2000KB";
	private String maxBackupIndex="40";
	private String logFilePath="../logs";
	public Log4j2Interface obj;
	
	public Properties getLog4j2Properties() {
		return log4j2Properties;
	}

	public Properties getLog4j2PropertiesToInit() {
		return new Properties(log4j2Properties);
	}

	public void setLog4j2Properties(Properties log4j2Properties) {
		this.log4j2Properties = log4j2Properties;
	}

	public void loadLog4j2Properties() {
		log4j2Properties.setProperty(
				Log4j2Parameters.ROOTLOGGER_LEVEL,
				Log4j2Parameters.ROOTLOGGER_LEVEL_VALUE);
		log4j2Properties.setProperty(
				Log4j2Parameters.PROPERTY_FILENAME,
				Log4j2Parameters.PROPERTY_FILENAME_VALUE);
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDERS,
				Log4j2Parameters.APPENDERS_VALUE);
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_CONSOLE_TYPE,
				Log4j2Parameters.APPENDER_CONSOLE_TYPE_VALUE);
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_CONSOLE_NAME,
				Log4j2Parameters.APPENDER_CONSOLE_NAME_VALUE);
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_CONSOLE_LAYOUT_TYPE,
				Log4j2Parameters.APPENDER_CONSOLE_LAYOUT_TYPE_VALUE);
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_CONSOLE_LAYOUT_PATTERN,
				Log4j2Parameters.APPENDER_CONSOLE_LAYOUT_PATTERN_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_TYPE,
				Log4j2Parameters.APPENDER_FILE_TYPE_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_NAME,
				Log4j2Parameters.APPENDER_FILE_NAME_VALUE);

		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_FILENAME,
				Log4j2Parameters.APPENDER_FILE_FILENAME_VALUE);

		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_FILEPATTERN,
				Log4j2Parameters.APPENDER_FILE_FILEPATTERN_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_LAYOUT_TYPE,
				Log4j2Parameters.APPENDER_FILE_LAYOUT_TYPE_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_LAYOUT_PATTERN,
				Log4j2Parameters.APPENDER_FILE_LAYOUT_PATTERN_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_POLICIES_TYPE,
				Log4j2Parameters.APPENDER_FILE_POLICIES_TYPE_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_POLICIES_TIME_TYPE,
				Log4j2Parameters.APPENDER_FILE_POLICIES_TIME_TYPE_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_POLICIES_TIME_INTERVAL,
				Log4j2Parameters.APPENDER_FILE_POLICIES_TIME_INTERVAL_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_POLICIES_SIZE_TYPE,
				Log4j2Parameters.APPENDER_FILE_POLICIES_SIZE_TYPE_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_POLICIES_SIZE_SIZE,
				Log4j2Parameters.APPENDER_FILE_POLICIES_SIZE_SIZE_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_STRATEGY_TYPE,
				Log4j2Parameters.APPENDER_FILE_STRATEGY_TYPE_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.APPENDER_FILE_STRATEGY_MAX,
				Log4j2Parameters.APPENDER_FILE_STRATEGY_MAX_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.ROOTLOGGER_APPENDERREFS,
				Log4j2Parameters.ROOTLOGGER_APPENDERREFS_VALUE);

		log4j2Properties.setProperty(
				Log4j2Parameters.ROOTLOGGER_APPENDERREF_CONSOLE_REF,
				Log4j2Parameters.ROOTLOGGER_APPENDERREF_CONSOLE_REF_VALUE);
		
		log4j2Properties.setProperty(
				Log4j2Parameters.ROOTLOGGER_APPENDERREF_R_REF,
				Log4j2Parameters.ROOTLOGGER_APPENDERREF_R_REF_VALUE);
	}

	public String getMaxFileSize() {
		return maxFileSize;
	}

	public void setMaxFileSize(String maxFileSize) {
		this.maxFileSize = maxFileSize;
	}

	public String getMaxBackupIndex() {
		return maxBackupIndex;
	}

	public void setMaxBackupIndex(String maxBackupIndex) {
		this.maxBackupIndex = maxBackupIndex;
	}

	public String getLogFilePath() {
		return logFilePath;
	}

	public void setLogFilePath(String logFilePath) {
		this.logFilePath = logFilePath;
	}
}
