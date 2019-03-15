# A test suite for comp1161 project1


First thing is first let us create a jar file for your project.

Your project structure should look something like this. **Before you begin MAKE SURE all your .java files have the line ```package contact;``` at the top**

```
project
|_____bin
│
|_____docs
|
|______src
    │
    |_______contact
            | Adress.java
            | Contact.java
            | Person.java
            | Name.java
            | Phone.java
```

## Compiling files
Open a command prompt/terminal to the project folder.N.B (If you want to open a command prompt to the folder just open a command prompt then type ```cd <path_to_the_project_folder>```)

Now type the following. 
#### On Windows
``` 
javac -cp .\src\ .\src\contact\*.java -d .\bin\ 
```

#### On Unix(Mac/Linux)
``` 
javac -cp ./src/ ./src/contact/*.java -d ./bin/ 
```
This compiles your java classes and sets the classpath and stores the output in the bin folder.

## Create Manifest File
Create a folder called **resources** inside your project folder and inside that create a file called **MANIFEST.FM**  (**In your code editor you can create a new file but be sure to select no extension**)

In that file place the following
```
Manifest-Version: 1.0
Class-Path: .

```
Your folder structure should now look like this.

```
project
|____resources
     | MANIFEST.FM
|
|_______bin
│
|_____docs
|
|______src
    │
    |_______contact
            | Address.java
            | Contact.java
            | Person.java
            | Name.java
            | Phone.java
```

## Create JAR File

#### On Windows

``` jar cvfm project.jar .\resources\MANIFEST.FM -C .\bin\ . ```

#### On Unix(Linux/Mac)
``` jar cvfm project.jar ./resources/MANIFEST.FM -C ./bin/ . ```

A jar file called *project.jar* should have been created in the project folder


## Running the tests

Download the zip https://github.com/stonecoder19/comp1161project1_test/archive/master.zip of this project and extract it. After which open a terminal/command prompt in the extracted folder.

Copy the **project.jar** file to this folder.

The folder structure should like this
```
comp1161project_test
|____
     | AddressTest.java
     | ContactTest.java
     | PersonTest.java
     | NameTesT.java
     | PhoneTest.java
     | junit-4.7.jar
     | hamcrest-all-1.3.jar
     | project.jar
```

#### On Windows

```
javac -cp project.jar;junit-4.7.jar;hamcrest-all-1.3.jar;. .\*.java 
```
```
java -cp project.jar;junit-4.7.jar;hamcrest-all-1.3.jar;. org.junit.runner.JUnitCore AddressTest ContactTest NameTest PhoneTest PersonTest
```

#### Unix(Mac/Linux)
```
javac -cp project.jar:junit-4.7.jar:hamcrest-all-1.3.jar:. ./*.java 
```
```
java -cp project.jar:junit-4.7.jar:hamcrest-all-1.3.jar:. org.junit.runner.JUnitCore AddressTest ContactTest NameTest PhoneTest PersonTest
```

## Results

If you passed all the tests then you should see something similar below, if not then your solution is incorrect. Correct it and repeat all the steps.
``` 
JUnit version 4.7
......................
Time: 0.071

OK (22 tests)
```


