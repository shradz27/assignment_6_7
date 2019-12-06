# Assignment 6
## Analysis of the presenation
I have written the python script to parse the csv file and write it to the sqlite database. 
Following is the output of the script.

    organization metrics
    Average organization value: 4.60
    Minimum organization value: 3.00
    Maximum organization value: 5.00

    Enthusiasm metrics
    Average enthusiasm value: 4.47
    Minimum enthusiasm value: 3.00
    Maximum enthusiasm value: 5.00

    Presentation value metrics
    Average presentation value: 4.33
    Minimum presentation value: 3.00
    Maximum presentation value: 5.00

<a href="https://gist.github.com/shradz27/8f540173bdc862621585c1024f21ba75">Please find the source code in this gist file.</a>

## Pandoc file conversion command
Following command converted <a href="https://github.com/shradz27/assignment_6_7/blob/master/ReportForAssignment6.txt">ReportForAssignment6.txt</a> to <a href="https://github.com/shradz27/assignment_6_7/blob/master/ReportForAssignment6.pdf">ReportForAssignment6.pdf</a> file.

        pandoc ReportForAssignment6.txt -o ReportForAssignment6.pdf --pdf-engine=/Library/TeX/texbin/pdflatex
        
This is the file generated by pandoc.</a>

# Assignment 7
## Java Program
I have included a java file named `MyApplication` which has following functions

- greetUser() : greets user
- getVersion() : prints the version of the app
- getAuthorName() : prints the name of the author

I have included the `makefile` which includes following commands 
  - `run` : uses java compiler to build the class file and calls all the methods of `MyApplication` class
  - `clean` : command deletes the class file

### makefile commands
`make run`<br>
`make clean`


# SVN Server
Since SVN system is based on centralized model where source code and it's history is saved in server, We need server to host our application's repository. I found a <a href="https://riouxsvn.com">free svn repository hosting service</a> so created an account and got my server url as below

https://svn.riouxsvn.com/luintelapp

## SVN Client
Following are the commands i used to 
  - initially check out the empty repo from the server
  - add files to the repo
  - then finally commit
  
```
 svn co https://svn.riouxsvn.com/luintelapp --username luintelshradha
 svn add makefile
 svn add MyApplication.java
 svn commit -m "First commit"
```

`svn commit` updates the source code to the server, so when i checked the server, i saw my commit there. 
<br/><br/>
![Screenshot of remote repo](screenshot.png)



## SVN Log
I have added the logs of the svn commands in the following GIST file.
<a href="https://gist.github.com/shradz27/8ed4fc6a2e07a8afa2f6c824429348e6">Link to SVN logs gist</a>

## GIT Log
Similary, here is the log file that contains my git command and the output logs.
<a href="https://gist.github.com/shradz27/13983ccbcc979fdecc7faae9494db76d">Link to GIT logs gist</a>
