# A test suite for comp1161 project1.

In order to make the JAR (Java Archive) File, follow the steps below:

# Step 1 - Your Folder Structure
Your project structure should look something like this. 
**Before you begin, MAKE SURE all your .java files have the line ```package contact;``` at the top**

MAKE SURE that your "Project Folder" has these follwing folders: **src**, **bin**, **docs** and **resources**. 
Your "Project Folder" should resemble the diagram below.

## NOTE: Your project folder doesn't need to be called "project" as shown in the example below.

```
project
|____resources
|
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
            | Gender.java
            | Name.java
            | Phone.java
```

# Step 2 - ## Compiling your .java files.
Open a command prompt/terminal to your project folder.
## NOTE: If you want to open a command prompt to the folder just open a command prompt then type:
```
cd <path_to_the_project_folder>
```
     

Now type the following in the Command Prompt. 
#### On Windows
``` 
javac -cp .\src\ .\src\contact\*.java -d .\bin\ 
```

#### On Unix(Mac/Linux)
``` 
javac -cp ./src/ ./src/contact/*.java -d ./bin/ 
```

## NOTE: This compiles your java classes and sets the classpath and stores the output in the bin folder.

# Step 3 - Create the Manifest File.
Create a folder called **resources** (if you have not done so already) inside your project folder. 
Now inside the **resources** folder, create a file called **MANIFEST.FM**  
## NOTE: **In your code editor you can create a new file but be sure to select "no extension" when saving the file. When saving the file, select the option "Save as type" (below "File name"). and search for "no extension".**

In that file place the following.
```
Manifest-Version: 1.0
Class-Path: .

```

Your new folder structure should now look like this.

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
            | Gender.java
            | Name.java
            | Phone.java
```

# Step 4 - Creating a JAR File.

## NOTE: if you use eclipse or any other ide such as intellij you can export the project as a jar file. Just make sure to name it project.jar and you can skip this step.

Now type the following in the Command Prompt.

#### On Windows
``` 
jar cvfm project.jar .\resources\MANIFEST.FM -C .\bin\ . 
```

#### On Unix(Linux/Mac)
``` 
jar cvfm project.jar ./resources/MANIFEST.FM -C ./bin/ . 
```

## NOTE: A jar file will be called *project.jar* and it should have been created in your project folder.

# Step 5 - Running the tests

First, Download the zip https://github.com/stonecoder19/comp1161project1_test/archive/master.zip of this project and extract it. 
## NOTE: After downloading, open a terminal/command prompt in the extracted folder. (If you want to open a command prompt to the folder just open a command prompt then type:
```
cd <path_to_the_project_tester_folder>
```

Secondly, In your project folder, locate the **project.jar** file and copy it to the project tester folder that you just downloaded.

The folder structure of the tester folder should resemble this.

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
Now to actually RUN the tests.
Type the following in the Command Prompt.

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

# Step 6 - 
## Results.

If you passed all the tests then you should see something similar below, if not then your solution is incorrect. Correct it and repeat all the steps.

``` 
JUnit version 4.7
......................
Time: 0.071

OK (22 tests)
```
# HELP - 

## Possible Errors:
- If you have an error regarding Gender, make sure the make a seperate file called Gender.java and in that file put the enum e.g 
```java 
    public enum Gender{
        MALE, FEMALE
    }
```
- Make sure the getAddress and the getPhoneList returns a String[]
- Make sure the toString of the Phone is formatted properly eg. (876) 555-5555


## Javadoc Instructions

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
Open a command prompt/terminal to your project folder.
## N.B (If you want to open a command prompt to the folder just open a command prompt then type: 
```
cd <path_to_the_project_folder>
```
     
Type the following in the Command Prompt.
### Windows
``` 
javadoc -d .\docs .\src\contact\*.java
```
### Unix (Mac\Linux)
```
javadoc -d ./docs ./src/contact/*.java
```

After running the javadoc command.
Your new folder structure should now look like this.
```
project
|____resources
     |______MANIFEST.FM
|
|_______bin
|     |____contact
|          |____Contact.class
|          |____Address.class
|          |____Name.class
|          |____Person.class
|          |____Phone.class
│
|_____docs
|     |_____contact
|     |     |_____ Contact.html
|     |     |_____ Gender.html
|     |     |_____ Name.html
|     |     |_____ Person.html
|     |     |_____ Phone.html
|     |     |_____ Address.html
|     |   
|     |_____stylesheet
|     |_____script
|     |_____package-list
|     |_____etc.
|
|______src
    │
    |_______contact
            |____Address.java
            |____Contact.java
            |____Person.java
            |____Gender.java
            |____Name.java
            |____Phone.java
```
## Submission Instructions

Now it is time to submit, make sure you copy your jar file to your project folder. 
Rename your project folder your id number.
Folder structure should look something like this for a person with id number 6200000.

```
6200000
|
|_______bin
|
|_______src
|
|_______docs
| 
|_______project.jar
```
- After you have done this zip this folder and name this zip file your id number e.g. 6200000.zip
- Upload





