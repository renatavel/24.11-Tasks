import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Task5 {
    static class MyException1 extends Exception{
        private static Logger logger= Logger.getLogger("FirstException");
        public MyException1() throws IOException{
            StringWriter trace=new StringWriter();
            printStackTrace(new PrintWriter(trace));
            logger.severe(trace.toString());
        }
    }
    static  void MyException1Throws()throws MyException1,MyException2,IOException{
        throw new MyException1();
    }

    static class MyException2 extends Exception{
        private static Logger logger= Logger.getLogger("SecondException");
        public MyException2() throws IOException {
            StringWriter trace=new StringWriter();
            printStackTrace(new PrintWriter(trace));
            logger.severe(trace.toString());
        }
    }

    static  void MyExceptionThrows2()throws MyException2,IOException{
           throw new MyException2();
    }

    public static void main(String[] args) {
       try{
           MyException1Throws();
       }
       catch(MyException1|MyException2|IOException e){
           System.out.println(e);
       }
       try{
           MyExceptionThrows2();
       }
       catch(MyException2|IOException e)
       {
           System.out.println(e);
       }
    }
}
