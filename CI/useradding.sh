#!bin/bash

echo "What is the user's name: "
read user

echo "What is the user's password: "
read pass

sudo useradd $user
sudo passwd --stdin $user | $pass
sudo usermod -aG sudo $user
