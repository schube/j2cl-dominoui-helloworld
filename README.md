# j2cl-dominoui-helloworld

Based on https://blog.kie.org/2022/04/rise-of-j2cl-java-web-development-after-gwt.html

How to start:

1. Terminal Window: MAVEN_OPTS='-Xmx10240m' mvn j2cl:watch
2. Terminal Window: mvn jetty:run
3. Open Browser http://localhost:8080

Now change a string in "scmodule.java"

Expected: Reload browser and see new string
Actual: CPU at 100%, browser shows old site after reload