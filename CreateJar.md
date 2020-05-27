
# Executable Jar File Creation Instructions.

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
    |       | Address.java
    |       | Citizen.java
    |       | Name.java
    |       | Biometric.java
    |       | CivicDoc.java
    |       | Person.java
    |_______app
    |       | SNIDApp.java
    |_______data
    |       | SNIDDb.java
    |_______ui
    |       | TextUI.java
    |       | GUI.java
    |
    | Main.java
       
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
javac -cp .\src\ .\src\app\*.java -d .\bin\ 
javac -cp .\src\ .\src\data\*.java -d .\bin\ 
javac -cp .\src\ .\src\ui\*.java -d .\bin\ 
javac -cp .\src\ .\src\*.java -d .\bin\ 
```

#### On Unix(Mac/Linux)
``` 
javac -cp ./src/ ./src/*/*.java -d ./bin/ 
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
javadoc -d .\docs -cp .\src .\src\snid\*.java
javadoc -d .\docs -cp .\src .\src\app\*.java
javadoc -d .\docs -cp .\src .\src\data\*.java
javadoc -d .\docs -cp .\src .\src\ui\*.java
```
### Unix (Mac\Linux)
```
javadoc -d ./docs -cp ./src ./src/*/*.java
```

After running the javadoc command.
Your new folder structure should now look like this.
```
project
|_______bin
|     |____snid
|     |     |____Citizen.class
|     |     |____Address.class
|     |     |____Name.class
|     |     |____Person.class
|     |     |____Biometric.class
|     |     |____CivicDoc.class
|     |
|     |____app
|     |     |___SNIDApp.class
|     |
|     |____data
|     |     |___SNIDDb.class
|     |
|     |____ui
|           |___TextUI.class
|           |___GUI.class
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
      |       | Address.java
      |       | Citizen.java
      |       | Name.java
      |       | Biometric.java
      |       | CivicDoc.java
      |       | Person.java
      |_______app
      |       | SNIDApp.java
      |_______data
      |       | SNIDDb.java
      |_______ui
      |       | TextUI.java
      |       | GUI.java
      |
      | Main.java
```
# Step 4 - Create Manifest file
Create a file called manifest.txt and place it in your project folder. In that file place the following.*Make sure there is an extra blank line*.
```
Manifest-Version: 1.0
Created-By: MyNameGoesHere
Main-Class: Main

```


# Step 5 - Creating a JAR File.

Now type the following in the Command Prompt.

#### On Windows
``` 
jar cvfm snid.jar manifest.txt -C .\bin\ . .\src\ .\docs\
```

#### On Unix(Linux/Mac)
``` 
jar cvfm snid.jar manifest.txt -C ./bin/ . ./src/ ./docs/
```

### NOTE: A jar file will be called *snid.jar* and it should have been created in your project folder. Also make sure the data file you are using for this project is in the project folder.

# Step 6 - Execute Jar.

Now run this command to execute the jar

``` 
java -jar snid.jar
```


## Submission Instructions

Submit the jar file
