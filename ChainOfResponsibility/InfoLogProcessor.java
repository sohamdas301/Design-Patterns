package ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel == INFO) System.out.println("Processing Info log processor");
        else super.log(logLevel, message);
    }
}
