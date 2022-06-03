#!/bin/bash
clear

javac.exe $1

# check command succeeded
result=$(echo $?)

success=0

 if [ "$result" -eq "$success" ]
then
    echo -e "Compiling package...\n"
    $(javac.exe -d . $1)

    echo "Listing directory in tree-like format"
    tree -d

    echo -e "\nWhat is your package name?"
    
    read PKG
    
    listDirectory=$(echo */)
    listDirectoryFilter=$(echo $listDirectory | cut -f 1 -d '/')
    
    extension=$(echo $1 | cut -f 1 -d '.')
    echo "$PKG"
    if [ "$listDirectoryFilter" = "$PKG" ]
    then
        echo "Your package directory is $PKG.$extension"
        echo "PROCEED? Y/n"
        read Input
        if [ "$Input" == "Y" ]
        then
            #echo "Run java command on terminal: java -cp . $PKG,$extension"
            echo "Run bash start.sh on terminal"
            echo "java.exe -cp . $PKG.$extension" > start.sh
            exit
        else
            echo "Please check your package syntax."
        fi
    else
        echo "Check your directory listings!"
    fi
else 
    echo "Compile Error!"
 fi


