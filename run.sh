i#!/bin/bash
clear

javac.exe $1

# check command succeeded
result=$(echo $?)

success=0

 if [ "$result" -eq "$success" ]
then
    echo -e "Compiling package...\n"
    javac.exe -d . $1
    
    package=$(head -n 1 $1)
    #echo -e "\n$package\n"

    # echo "Listing directory in tree-like format"
    # tree -d

    # echo -e "\nWhat is your package name?"
    
    # read PKG
    
    #Change
    #listDirectory=$(echo */)
    #listDirectoryFilter=$(echo $listDirectory | grep $package)
    
    packageFilter=$(echo $package | cut -f 1 -d ';' | awk '{print $2}')
    
    extension=$(echo $1 | cut -f 1 -d '.')
    
    #if [ "$packageFilter" = "$PKG" ]
    #then
        packageDirectory=$packageFilter.$extension
        packageDirectoryJar="$packageFilter\/$extension.class"
        echo -e "\nYour package directory is $packageDirectory"
        echo "PROCEED? Y/n"
        read Input
        if [ "$Input" == "Y" -o "$Input" == "y" ]
        then
            #echo "Run java command on terminal: java -cp . $PKG,$extension"
            
            echo -e "\n=======QUICK DETOUR======"
            echo -e "\nDo you like to explore option for creating a runnable JAR file [Y/n]"
            read option
            if [ "$option" == "Y" -o "$Input" == "y" ]
            then
                echo -e "\nCreating JAR file!\n"
                # replacing 2nd item Manifest Main Class
                
                echo -e "\nCreating manifest text"
                
                $(echo "Main-Class: $packageDirectory" > manifest.txt)

                #ls -al manifest.txt
                
                # cat manifest.txt

                # sleep 1000
                # jar=test.jar
                # search=$(awk '{print $2}' manifest.txt) 
                # replace=$packageDirectory
                # sed -i "s/$search/$replace/" manifest.txt
                
                # c     create the archive file
                # v     verbose
                # m     manifest file
                # f     archive file
                echo -e "\n**********"
                jar.exe cvmf manifest.txt test.jar $packageDirectoryJar
                echo -e "**********"
                
                java.exe -jar test.jar
                
                #$(jar.exe cvmf "manifest.txt" "test.jar" $listDirectory$extension.class)
            else
                java.exe -cp . $packageDirectory
                
            fi
        else
            echo "Thank you for your visit!"
        fi
    else
        echo "Check your directory listings!"
    fi
# else 
#   echo "Compile Error!"
# fi


