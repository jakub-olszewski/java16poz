package pl.sdacademy.java16poz.programowanie1;

import org.junit.Rule;
import org.junit.internal.AssumptionViolatedException;
import org.junit.rules.Stopwatch;
import org.junit.runner.Description;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * TestBase
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.05.2019 08:57
 **/
public class TestBase {

    private static final Logger logger = Logger.getLogger("");

    private static void logInfo(Description description, String status, long nanos) {
        String testName = description.getMethodName();
        logger.info(String.format("\t---\n\tTest %s %s, spent %d microseconds",
                testName, status, TimeUnit.NANOSECONDS.toMicros(nanos)));
    }

    @Rule
    public Stopwatch stopwatch = new Stopwatch() {
        @Override
        protected void succeeded(long nanos, Description description) {
            logInfo(description, "succeeded", nanos);
        }

        @Override
        protected void failed(long nanos, Throwable e, Description description) {
            logInfo(description, "failed", nanos);
        }

//        @Override
//        protected void skipped(long nanos, AssumptionViolatedException e, Description description) {
//            logInfo(description, "skipped", nanos);
//        }

        @Override
        protected void finished(long nanos, Description description) {
            logInfo(description, "finished", nanos);
        }
    };

    /**
     * Metoda inicjuje wartości tablicy z wykorzystaniem varargs
     * @param numbers
     * @return
     */
    protected int[] initNumbers(int... numbers){
        return numbers;
    }


    protected void print(int[] table){
        StringBuilder builder = new StringBuilder();
        int i=0;
        for(int number : table){
            builder.append(number);
            if(i<table.length-1){
                builder.append(",");
            }
            i++;
        }
        builder.append("\n");
        System.out.println(builder);
    }
}
