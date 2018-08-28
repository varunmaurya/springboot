This small app is to gracefully shutdown a springboot application, We can use the same 
logic in any other application as well.</br>
Here we have a scheduler which keeps generating work for an executor service which has
predefined number of workers.</br>
On on iterrupution all the woek which currently workers are doing should be done and they should not be processing any new work

<ul>

**<li>mvn clean install</li>**
**<li>java -jar target/SpringBootShutDownApp-0.0.1-SNAPSHOT.jar</li>**

<li>get the pid for the running instance</li>
<li>kill <<**PID**>></li>

