package ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel == DEBUG) System.out.println("Processing Debug processor");
        else super.log(logLevel, message);
    }
}
