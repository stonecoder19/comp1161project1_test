# A test suite for comp1161 project1.

In order to make the JAR (Java Archive) File, follow the steps below:

# Step 1 - Your Folder Structure
Your project structure should look something like this. 
**Before you begin, MAKE SURE all your .java files have the line ```package snid;``` at the top**

MAKE SURE that your "Project Folder" has these follwing folders: **src**, **bin**, **docs**. 
Your "Project Folder" should resemble the diagram below.

### NOTE: Your project folder doesn't need to be called "project" as shown in the example below.

```
project
|_____bin
│
|_____docs
|
|______src
    │
    |_______snid
            | Address.java
            | Citizen.java
            | Name.java
            | Biometric.java
            | CivicDoc.java
            | Person.java
```


# Step 2 -  Compiling your .java files.
Open a command prompt/terminal to your project folder.
### NOTE: If you want to open a command prompt to the folder just open a command prompt then type:
```
cd <path_to_the_project_folder>
```
     

Now type the following in the Command Prompt. 
#### On Windows
``` 
javac -cp .\src\ .\src\snid\*.java -d .\bin\ 
```

#### On Unix(Mac/Linux)
``` 
javac -cp ./src/ ./src/snid/*.java -d ./bin/ 
```

### NOTE: This compiles your java classes and sets the classpath and stores the output in the bin folder.


# Step 3 - Javadoc Instructions

Your code should include Java Documentation. This can be done by adding this to your code:
``` 
/**
*  (Add comments here about methods)
*
*  (Add special Java Documentation Tags)
*  (Tags may include: @param, @return, @author and @version)
*/
``` 
To make a javadoc of your code.

Type the following in the Command Prompt.
### Windows
``` 
javadoc -d .\docs .\src\snid\*.java
```
### Unix (Mac\Linux)
```
javadoc -d ./docs ./src/snid/*.java
```

After running the javadoc command.
Your new folder structure should now look like this.
```
project
|_______bin
|     |____snid
|          |____Citizen.class
|          |____Address.class
|          |____Name.class
|          |____Person.class
|          |____Biometric.class
|          |____CivicDoc.class
│
|_____docs
|     |_____snid
|     |     |_____ Citizen.html
|     |     |_____ Address.html
|     |     |_____ Name.html
|     |     |_____ Person.html
|     |     |_____ Biometric.html
|     |     |_____ CivicDoc.html
|     |   
|     |_____stylesheet
|     |_____script
|     |_____package-list
|     |_____etc.
|
|______src
    │
    |_______snid
            |____Address.java
            |____Citizen.java
            |____Person.java
            |____Biometric.java
            |____Name.java
            |____CivicDoc.java
```


# Step 3 - Creating a JAR File.

Now type the following in the Command Prompt.

#### On Windows
``` 
jar cvf snid.jar -C .\bin\ . .\src\ .\docs\
```

#### On Unix(Linux/Mac)
``` 
jar cvf snid.jar -C ./bin/ . ./src/ ./docs/
```

### NOTE: A jar file will be called *snid.jar* and it should have been created in your project folder.

# Step 5 - Running the tests

First, Download the zip https://github.com/stonecoder19/comp1161project1_test/archive/master.zip of this project and extract it. 
### NOTE: After downloading, open a terminal/command prompt in the extracted folder. (If you want to open a command prompt to the folder just open a command prompt then type:
```
cd <path_to_the_project_tester_folder>
```

Secondly, In your project folder, locate the **snid.jar** file and copy it to the project tester folder that you just downloaded.

The folder structure of the tester folder should resemble this.

```
comp1161project_test
|____
     | AddressTest.java
     | CitizenTest.java
     | NameTest.java
     | junit-4.7.jar
     | hamcrest-all-1.3.jar
     | snid.jar
```
Now to actually RUN the tests.
Type the following in the Command Prompt.

#### On Windows
```
javac -cp snid.jar;junit-4.7.jar;hamcrest-all-1.3.jar;. .\*.java 
```
```
java -cp snid.jar;junit-4.7.jar;hamcrest-all-1.3.jar;. org.junit.runner.JUnitCore AddressTest CitizenTest NameTest
```

#### Unix(Mac/Linux)
```
javac -cp snid.jar:junit-4.7.jar:hamcrest-all-1.3.jar:. ./*.java 
```
```
java -cp snid.jar:junit-4.7.jar:hamcrest-all-1.3.jar:. org.junit.runner.JUnitCore AddressTest CitizenTest NameTest
```

# Step 6 - Results.

If you passed all the tests then you should see something similar below, if not then your solution is incorrect. Correct it and repeat all the steps.

``` 
JUnit version 4.7
......................
Time: 0.071

OK (18 tests)
```


## Submission Instructions

Submit the jar file





