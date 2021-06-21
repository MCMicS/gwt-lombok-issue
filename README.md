# GWT Issue with Lombok >= 1.18.12

# Project structure
## `commons` contains the source for the lib
with profile `delombok` you can create the delomboked jar file

First the error was shown after update from 1.18.10 to 1.18.12

## with 1.18.20
- it seems to work if sources contains delomboked sources
- inner static classes still fail. Either in direct source or in jar file
