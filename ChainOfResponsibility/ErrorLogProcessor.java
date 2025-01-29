package ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel == ERROR) System.out.println("Processing Error processor");
        else super.log(logLevel, message);
    }
}
