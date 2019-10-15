package com.microbenchmark;

import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Warmup;

public class Benchmark {

  
  @org.openjdk.jmh.annotations.Benchmark
  @Fork(value = 1, warmups = 2)
  @Warmup(iterations = 5)
  public void init() {
    //Do nothing
  }
  
}
