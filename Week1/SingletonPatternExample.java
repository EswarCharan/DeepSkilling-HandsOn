package DesignPatternsAndPrinciples;
class Logger{
    private static Logger instance; 
    private Logger(){
       System.out.println("Logger Initialized");
     }
     static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
     }
     public void log(String msg){
        System.out.println("Log:"+msg);
     }
}
public class SingletonPatternExample{
    public static void main(String[] args) {
        Logger logger1=Logger.getInstance();
        Logger logger2=Logger.getInstance();
        logger1.log("Application started");
        logger2.log("Another message ");
        if(logger1==logger2){
              System.out.println("Both logger instances are the same (Singleton confirmed).");
        }
        else{
              System.out.println(" Singleton Failed");
        }

    }
}