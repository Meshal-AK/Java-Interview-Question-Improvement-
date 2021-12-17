# Big O Notation Linear VS Quadratic Solution 

mvn archetype:generate \
-DarchetypeGroupId=org.openjdk.jmh \
-DarchetypeArtifactId=jmh-java-benchmark-archetype \
-DinteractiveMode=false -DgroupId=com.example \
-DartifactId=coll-test -Dversion=1.0



mvn clean install


java -jar target/benchmarks.jar -w 1 -r 1

############

############

 JMH version: 1.29
 VM version: JDK 1.8.0_311, Java HotSpot(TM) 64-Bit Server VM, 25.311-b11
 VM invoker: C:\Program Files\Java\jre1.8.0_311\bin\java.exe
 VM options: <none>
 Blackhole mode: full + dont-inline hint
 Warmup: 5 iterations, 1 s each
 Measurement: 5 iterations, 1 s each
 Timeout: 10 min per iteration
 Threads: 1 thread, will synchronize iterations
 Benchmark mode: Throughput, ops/time
 Benchmark: com.example.MyBenchmark.solution

Run progress: 0.00% complete, ETA 00:01:40
 Fork: 1 of 5
 Warmup Iteration   1: 5.470 ops/s
 Warmup Iteration   2: 7.123 ops/s
 Warmup Iteration   3: 7.063 ops/s
 Warmup Iteration   4: 7.336 ops/s
 Warmup Iteration   5: 7.610 ops/s
Iteration   1: 7.376 ops/s
Iteration   2: 6.586 ops/s
Iteration   3: 7.296 ops/s
Iteration   4: 7.299 ops/s
Iteration   5: 7.429 ops/s

 Run progress: 10.00% complete, ETA 00:01:57
 Fork: 2 of 5
 Warmup Iteration   1: 5.546 ops/s
 Warmup Iteration   2: 7.849 ops/s
 Warmup Iteration   3: 7.983 ops/s
 Warmup Iteration   4: 7.592 ops/s
 Warmup Iteration   5: 7.880 ops/s
Iteration   1: 7.242 ops/s
Iteration   2: 6.674 ops/s
Iteration   3: 6.561 ops/s
Iteration   4: 7.442 ops/s
Iteration   5: 7.675 ops/s

 Run progress: 20.00% complete, ETA 00:01:37
 Fork: 3 of 5
 Warmup Iteration   1: 4.078 ops/s
 Warmup Iteration   2: 5.461 ops/s
 Warmup Iteration   3: 6.784 ops/s
 Warmup Iteration   4: 6.899 ops/s
 Warmup Iteration   5: 6.829 ops/s
Iteration   1: 6.958 ops/s
Iteration   2: 6.371 ops/s
Iteration   3: 5.942 ops/s
Iteration   4: 6.777 ops/s
Iteration   5: 6.721 ops/s

 Run progress: 30.00% complete, ETA 00:01:22
 Fork: 4 of 5
 Warmup Iteration   1: 3.959 ops/s
 Warmup Iteration   2: 5.370 ops/s
 Warmup Iteration   3: 7.017 ops/s
 Warmup Iteration   4: 6.189 ops/s
 Warmup Iteration   5: 5.925 ops/s
Iteration   1: 6.026 ops/s
Iteration   2: 5.878 ops/s
Iteration   3: 6.499 ops/s
Iteration   4: 6.313 ops/s
Iteration   5: 6.149 ops/s

 Run progress: 40.00% complete, ETA 00:01:10
 Fork: 5 of 5
 Warmup Iteration   1: 3.665 ops/s
 Warmup Iteration   2: 3.682 ops/s
 Warmup Iteration   3: 6.148 ops/s
 Warmup Iteration   4: 6.526 ops/s
 Warmup Iteration   5: 6.158 ops/s
Iteration   1: 6.331 ops/s
Iteration   2: 6.502 ops/s
Iteration   3: 6.376 ops/s
Iteration   4: 6.620 ops/s
Iteration   5: 6.253 ops/s


Result "com.example.MyBenchmark.solution":
  6.692 ±(99.9%) 0.387 ops/s [Average]
  (min, avg, max) = (5.878, 6.692, 7.675), stdev = 0.516
  CI (99.9%): [6.305, 7.079] (assumes normal distribution)


 JMH version: 1.29
 VM version: JDK 1.8.0_311, Java HotSpot(TM) 64-Bit Server VM, 25.311-b11
 VM invoker: C:\Program Files\Java\jre1.8.0_311\bin\java.exe
 VM options: <none>
 Blackhole mode: full + dont-inline hint
 Warmup: 5 iterations, 1 s each
 Measurement: 5 iterations, 1 s each
 Timeout: 10 min per iteration
 Threads: 1 thread, will synchronize iterations
 Benchmark mode: Throughput, ops/time
 Benchmark: com.example.MyBenchmark.solution2

 Run progress: 50.00% complete, ETA 00:00:58
 Fork: 1 of 5
 Warmup Iteration   1: 1242.682 ops/s
 Warmup Iteration   2: 1870.902 ops/s
 Warmup Iteration   3: 2091.362 ops/s
 Warmup Iteration   4: 2056.070 ops/s
 Warmup Iteration   5: 2168.057 ops/s
Iteration   1: 2198.286 ops/s
Iteration   2: 2111.714 ops/s
Iteration   3: 2259.539 ops/s
Iteration   4: 2126.871 ops/s
Iteration   5: 1927.701 ops/s

 Run progress: 60.00% complete, ETA 00:00:46
 Fork: 2 of 5
 Warmup Iteration   1: 1673.238 ops/s
 Warmup Iteration   2: 2038.985 ops/s
 Warmup Iteration   3: 2235.472 ops/s
 Warmup Iteration   4: 2212.721 ops/s
 Warmup Iteration   5: 2245.086 ops/s
Iteration   1: 2235.608 ops/s
Iteration   2: 2242.758 ops/s
Iteration   3: 2253.017 ops/s
Iteration   4: 2092.556 ops/s
Iteration   5: 2065.711 ops/s

 Run progress: 70.00% complete, ETA 00:00:34
 Fork: 3 of 5
 Warmup Iteration   1: 1634.780 ops/s
 Warmup Iteration   2: 1937.658 ops/s
 Warmup Iteration   3: 2090.138 ops/s
 Warmup Iteration   4: 1738.722 ops/s
 Warmup Iteration   5: 2115.780 ops/s
Iteration   1: 2060.411 ops/s
Iteration   2: 2044.260 ops/s
Iteration   3: 2066.972 ops/s
Iteration   4: 2126.958 ops/s
Iteration   5: 2103.833 ops/s

 Run progress: 80.00% complete, ETA 00:00:22
 Fork: 4 of 5
 Warmup Iteration   1: 1681.158 ops/s
 Warmup Iteration   2: 1955.647 ops/s
 Warmup Iteration   3: 2241.413 ops/s
 Warmup Iteration   4: 2186.118 ops/s
 Warmup Iteration   5: 2145.285 ops/s
Iteration   1: 2041.507 ops/s
Iteration   2: 2197.228 ops/s
Iteration   3: 2132.351 ops/s
Iteration   4: 2130.826 ops/s
Iteration   5: 2190.371 ops/s

 Run progress: 90.00% complete, ETA 00:00:11
 Fork: 5 of 5
 Warmup Iteration   1: 1733.198 ops/s
 Warmup Iteration   2: 1904.277 ops/s
 Warmup Iteration   3: 1954.686 ops/s
 Warmup Iteration   4: 2236.432 ops/s
 Warmup Iteration   5: 2204.316 ops/s
Iteration   1: 2132.235 ops/s
Iteration   2: 1792.879 ops/s
Iteration   4: 2084.507 ops/s
Iteration   5: 2135.307 ops/s


Result "com.example.MyBenchmark.solution2":
  2110.467 ±(99.9%) 78.138 ops/s [Average]
  (min, avg, max) = (1792.879, 2110.467, 2259.539), stdev = 104.312
  CI (99.9%): [2032.328, 2188.605] (assumes normal distribution)


# Run complete. Total time: 00:01:53

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark               Mode  Cnt     Score    Error  Units
MyBenchmark.solution   thrpt   25     6.692 ±  0.387  ops/s
MyBenchmark.solution2  thrpt   25  2110.467 ± 78.138  ops/s
