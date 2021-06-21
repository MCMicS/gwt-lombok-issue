# GWT Issue with Lombok >= 1.18.12

# Project structure
## `commons` contains the source for the lib
with profile `delombok` you can create the delomboked jar file

First the error was shown after update from 1.18.10 to 1.18.12

# Steps
>gwt-lombok-issue>mvn package
This will generate the GWT application and compile the needed files.

## with 1.18.10
all compiles

## with 1.18.12
The compilation will fail
```
[ERROR] Errors in 'jar:file:/gwt-lombok-issue/lib/gwt-lombok-issue-commons-1.0-SNAPSHOT-sources.jar!/de/mcmics/common/User.java'
[INFO]          [ERROR] Line 8: Annotation types that do not specify explicit target element types cannot be applied here

```

## with 1.18.20
- it seems to work if sources contains delomboked sources
- inner static classes still fail. Either in direct source or in jar file
