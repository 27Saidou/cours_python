public class ChainOfResponsabilityClient {
    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.OUTPUTINFO, "Entrez la sequence de valeurs ");
        chainLogger.logMessage(Logger.ERRORINFO, "Erreur ");
        chainLogger.logMessage(Logger.DEBUGINFO, "cette erreur est debugger maintenant");
    }
}
