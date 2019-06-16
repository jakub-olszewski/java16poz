package pl.sdacademy.java16poz.programowanie1.algorithms;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import pl.sdacademy.java16poz.programowanie1.algorithms.exercises.Power;

/**
 * PowerTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 02.06.2019 09:10
 **/
@State(Scope.Benchmark)
public class PowerTest {
    @Param("3")
    int x;
    @Param({"25", "28", "31", "32"})
    int y;

    private Power power;

    @Setup
    public void setup(){

        power = new Power();
    }

    @Benchmark
    public long fast() {
        return power.fast(x, y);
    }

    @Benchmark
    public long naive() {
        return power.naive(x, y);
    }


    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(PowerTest.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}

