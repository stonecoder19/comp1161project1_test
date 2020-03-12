#!/bin/bash

javac -cp project.jar:junit-4.7.jar:hamcrest-all-1.3.jar:. ./*.java
java -cp project.jar:junit-4.7.jar:hamcrest-all-1.3.jar:. org.junit.runner.JUnitCore AddressTest ContactTest NameTest PhoneTest PersonTest
