## Java RMI Calculator  
  
### Steps for execution:  

Compile the service interface and implementation using java compiler.
```
javac Calculator.java
javac CalculatorImpl.java
```
  
Compile remote service implementation class file using RMI compiler to create skeleton and stub files.
```
rmic CalculatorImpl -v1.1 -nowarn
```

Compile the server and client files.
```
javac CalculatorServer.java
javac CalculatorClient.java
```

Start the RMI registry server on first terminal.
```
rmiregistry
```

Start the calculator server on second terminal.
```
java CalculatorServer
```

Run the client on third terminal.
```
java CalculatorClient
```
  
Reference: [Dept. of Computer Science, University of Illinois at Chicago](https://www.cs.uic.edu/~troy/fall04/cs441/rmi/calc/index.html)
