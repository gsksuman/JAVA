public interface Log4j2Config {
	String ROOTLOGGER_LEVEL = "rootLogger.level"; 
	String ROOTLOGGER_LEVEL_VALUE="DEBUG";

	String PROPERTY_FILENAME="property.filename"; 
	String PROPERTY_FILENAME_VALUE="../logs/log.log";
	String APPENDERS ="appenders";
	//String APPENDERS_VALUE = "CONSOLE";
	String APPENDERS_VALUE = "FILE";
	
	//Console Appender
	String APPENDER_CONSOLE_TYPE="appender.console.type"; 
	String APPENDER_CONSOLE_TYPE_VALUE= "Console";
	String APPENDER_CONSOLE_NAME="appender.console.name"; 
	String APPENDER_CONSOLE_NAME_VALUE= "STDOUT";
	String APPENDER_CONSOLE_LAYOUT_TYPE="appender.console.layout.type"; 
	String APPENDER_CONSOLE_LAYOUT_TYPE_VALUE= "PatternLayout";
	String APPENDER_CONSOLE_LAYOUT_PATTERN="appender.console.layout.pattern"; 
	String APPENDER_CONSOLE_LAYOUT_PATTERN_VALUE= "%d %5p [%t] (%F:%L) - %m%n";

	//Rolling File Appender
	String APPENDER_FILE_TYPE="appender.FILE.type";
	String APPENDER_FILE_TYPE_VALUE= "RollingFile";
	String APPENDER_FILE_NAME="appender.FILE.name";
	String APPENDER_FILE_NAME_VALUE= "File";
	String APPENDER_FILE_FILENAME="appender.FILE.fileName";
	String APPENDER_FILE_FILENAME_VALUE="microService.log";
	String APPENDER_FILE_FILEPATTERN="appender.FILE.filePattern";
	String APPENDER_FILE_FILEPATTERN_VALUE= "../logs/$${date:yyyy-MM}/microService-%d{MM-dd-yyyy_HH_mm}-%i.log";
	String APPENDER_FILE_LAYOUT_TYPE="appender.FILE.layout.type"; 
	String APPENDER_FILE_LAYOUT_TYPE_VALUE="PatternLayout";
	String APPENDER_FILE_LAYOUT_PATTERN="appender.FILE.layout.pattern";
	String APPENDER_FILE_LAYOUT_PATTERN_VALUE= "[%d{MMM dd HH:mm:ss}] %-5p (%F:%L) - %m%n";
	String APPENDER_FILE_POLICIES_TYPE="appender.FILE.policies.type"; 
	String APPENDER_FILE_POLICIES_TYPE_VALUE= "Policies";
	String APPENDER_FILE_POLICIES_TIME_TYPE="appender.FILE.policies.time.type"; 
	String APPENDER_FILE_POLICIES_TIME_TYPE_VALUE= "TimeBasedTriggeringPolicy";
	String APPENDER_FILE_POLICIES_TIME_INTERVAL="appender.FILE.policies.time.interval";
	String APPENDER_FILE_POLICIES_TIME_INTERVAL_VALUE="1";
	
	String APPENDER_FILE_POLICIES_SIZE_TYPE="appender.FILE.policies.size.type"; 
	String APPENDER_FILE_POLICIES_SIZE_TYPE_VALUE="SizeBasedTriggeringPolicy";
	String APPENDER_FILE_POLICIES_SIZE_SIZE="appender.FILE.policies.size.size";
	String APPENDER_FILE_POLICIES_SIZE_SIZE_VALUE="4000 KB";
	String APPENDER_FILE_STRATEGY_TYPE="appender.FILE.strategy.type"; 
	String APPENDER_FILE_STRATEGY_TYPE_VALUE="DefaultRolloverStrategy";
	String APPENDER_FILE_STRATEGY_MAX="appender.FILE.strategy.max";
	String APPENDER_FILE_STRATEGY_MAX_VALUE="30";
	
	String ROOTLOGGER_APPENDERREFS="rootLogger.appenderRefs";
	String ROOTLOGGER_APPENDERREFS_VALUE= "FILE";
	String ROOTLOGGER_APPENDERREFS_VALUE= "CONSOLE";

	String ROOTLOGGER_APPENDERREF_CONSOLE_REF="rootLogger.appenderRef.console.ref";
	String ROOTLOGGER_APPENDERREF_CONSOLE_REF_VALUE="STDOUT";
	String ROOTLOGGER_APPENDERREF_FILE_REF="rootLogger.appenderRef.FILE.ref"; 
	String ROOTLOGGER_APPENDERREF_FILE_REF_VALUE="File";
}
