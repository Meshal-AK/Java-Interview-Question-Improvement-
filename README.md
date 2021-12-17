# Big O Notation Linear VS Quadratic Solution 

mvn archetype:generate \
-DarchetypeGroupId=org.openjdk.jmh \
-DarchetypeArtifactId=jmh-java-benchmark-archetype \
-DinteractiveMode=false -DgroupId=com.example \
-DartifactId=coll-test -Dversion=1.0



mvn clean install


java -jar target/benchmarks.jar -w 1 -r 1
