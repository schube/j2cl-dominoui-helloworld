# j2cl-dominoui-helloworld

Based on https://blog.kie.org/2022/04/rise-of-j2cl-java-web-development-after-gwt.html

Set java to java 11 with SDKman (`sdk env`) (current setting for Java and Apple M1)

How to start:

1. Terminal Window: `MAVEN_OPTS='-Xmx10240m' mvn j2cl:watch`
2. Terminal Window: `mvn jetty:run`
3. Open Browser http://localhost:8080


Terminal 1 says

~~~
[INFO] Finished org.dominokit:domino-ui:1.0.0-RC12/bundled_js in 4051ms
[INFO] Finished org.dominokit.i18n:gwt-cldr:1.0/transpiled_js in 90050ms
[INFO] Starting org.dominokit.i18n:gwt-cldr:1.0/bundled_js
[INFO] Finished org.dominokit.i18n:gwt-cldr:1.0/bundled_js in 11803ms
[INFO] Starting scgroup:scartifact:1.0-SNAPSHOT/bundled_js_app
[INFO] Starting final task scgroup:scartifact:1.0-SNAPSHOT/bundled_js_app
[INFO] Finished final task scgroup:scartifact:1.0-SNAPSHOT/bundled_js_app in 7676ms
[INFO] -----  Build Complete: ready for browser refresh  -----
~~~

Terminal 2 says
~~~
[INFO] Started ServerConnector@33a8c9c9{HTTP/1.1, (http/1.1)}{0.0.0.0:8080}
[INFO] Started @1754ms
[INFO] Started Jetty Server
~~~

CPU is at 100% !!!!!!

Now change a string in "scmodule.java"

Expected: Reload browser and see new string
Actual: CPU at 100%, browser shows old site after reload