#!/bin/bash
clear

javac.exe $1

# check command succeeded
result=$(echo $?)

success=0

 if [ "$result" -eq "$success" ]
then
    echo -e "Compiling package...\n"
    javac.exe -d . $1

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
                echo -e "\nCreating JAR file!\n"
                # replacing 2nd item Manifest Main Class

                search=$(awk '{print $2}' manifest.txt) 
                replace=$PKG.$extension
                sed -i "s/$search/$replace/" manifest.txt

                
                jar.exe cvmf manifest.txt test.jar $listDirectory$extension.class
                java.exe -jar test.jar
                #$(jar.exe cvmf "manifest.txt" "test.jar" $listDirectory$extension.class)
            else
                java.exe -cp . $PKG.$extension
                
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


