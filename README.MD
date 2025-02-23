## Grails CRUD project


### download jdk 7u80
https://medium.com/@opnchaudhary/install-jdk7-in-ubuntu-18-04-2e1a3c65b08c
extract : tar -xvzf jdk-7u80-linux-x64.tar.gz
guide:
Step 2: Move to a Standard Location
Move the extracted JDK folder to /opt (recommended location for manually installed software)
sudo mv jdk1.7.0_80 /opt/

Step 3: Configure Java Environment Variables
You need to set up the JAVA_HOME and update system paths.

Open the environment variables file:
sudo gedit /etc/profile

Add the following lines at the end of the file:
export JAVA_HOME=/opt/jdk1.7.0_80
export PATH=$JAVA_HOME/bin:$PATH

Save the file (Ctrl + X, then Y, then Enter).

Apply the changes:
source /etc/profile

check:
java -version
javac -version

Install grails:
https://chatgpt.com/c/679a7033-10f0-8003-91b9-1cd1adb13a00

