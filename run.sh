#!/bin/bash

javac.exe $1

# check command succeeded
result=$(echo $?)

echo $result
success=0
echo $success

 if [ "$result" -eq "$success" ]
then
    $(javac.exe -d . $1)
    echo "What is your package name?"
    read PKG
    
    extension=$(echo $1 | cut -f 1 -d '.')

    echo "$extension"
    echo "Your package directory is $PKG.$extension"

    echo "PROCEED? Y/n"
    read Input

    if [ "$Input" == "Y" ]
    then
        # nohup (1)            - run a command immune to hangups, with output to a non-tty
        # nohup: redirecting stderr to stdout
        $(nohup java.exe -cp . $PKG.$extension > output.txt /dev/null 2>&1 &)
        
    else
        echo "Check your settings!"
    fi
else
    echo "Complie Error!"
 fi


