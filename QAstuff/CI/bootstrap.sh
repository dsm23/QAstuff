#!/bin/bash

sudo apt install -y git
cd /tmp/shared
sudo cp * /opt
cd /opt
sudo tar zxvf java.tar.gz
sudo update-alternatives --install /usr/bin/java java /opt/jdk1.8.0_45/bin/java 100
sudo update-alternatives --install /usr/bin/javac javac /opt/jdk1.8.0_45/bin/javac 100
sudo tar zxvf maven.tar.gz
sudo update-alternatives --install /usr/bin/mvn mvn /opt/apache-maven-3.3.9/bin/mvn 100
sudo dpkg -i jenkins_2.1_all.deb

sudo apt update
sudo apt install -f -y
sudo apt-get install -y jenkins
sudo service jenkins start

java -version
mvn -version
sudo chmod a+x jira.bin
sudo ./jira.bin << EOF
o
1
2
8081
8006
i
EOF

echo "Hello world, your installation is complete."