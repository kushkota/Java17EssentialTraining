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
    if [ "$listDirectoryFilter" = "$PKG" ]
    then
        echo -e "\nYour package directory is $PKG.$extension"
        echo "PROCEED? Y/n"
        read Input
        if [ "$Input" == "Y" ]
        then
            #echo "Run java command on terminal: java -cp . $PKG,$extension"
            
            echo -e "\n=======QUICK DETOUR======"
            echo -e "\nDo you like to explore option for creating a runnable JAR file [Y/n]"
            read option
            if [ "$option" == "Y" ]
            then
                echo "echo -e '\nCreating JAR file!\n'" > startJar.sh
                echo "jar.exe cvmf manifest.txt test.jar $listDirectory$extension.class" >> startJar.sh
                echo "java.exe -jar test.jar" >> startJar.sh
                #$(jar.exe cvmf "manifest.txt" "test.jar" $listDirectory$extension.class)
                echo -e "\nRun 'bash startJar.sh' on the terminal."
            else
                echo "java.exe -cp . $PKG.$extension" > start.sh
                echo "Run bash start.sh on terminal."
            fi
        else
            echo "Thank you for your visit!"
        fi
    else
        echo "Check your directory listings!"
    fi
else 
    echo "Compile Error!"
 fi


