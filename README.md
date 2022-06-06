# Java 17 Essential Training: Syntax and Structure

Learning how to program with the most recent Long-Term-Support(LTS) release, Java 17.


## Development

```python

# clone a repository 
$ git clone https://github.com/kushkota/Java17EssentialTraining

cd Java17EssentialTraining

./run.sh <java_file>
```
Run `./run.sh` to automate compile and run Java exection

Terminal
```python
$ javac.exe <java_file>
$ javac.exe -d . <java_file> // forces compliler to create a package
$ java -cp . <package.javaClass> 
```

Create and importing JAR files
```python
# manifest.txt 
Main-Class: decision_structures.GradeMessage

jar cvmf manifest.txt <jar_file> <package/javaClass_file>
java -jar <jar_file>
```

## Project
https://github.com/kushkota/Java17EssentialTraining
