# Logistic Growth Model (JavaFX)

This repository contains a JavaFX implementation of the **logistic growth model**, a fundamental concept in population dynamics.

## Description
The logistic growth equation is given by:

$$
\frac{dP}{dt} = kP (M - P)
$$

where:
- \( P \) is the population size,
- \( k \) is the growth rate,
- \( M \) is the carrying capacity,
- \( t \) is time.

This Java program uses **JavaFX** to visualize the population growth over time with a dynamic graph.

## Prerequisites
Ensure you have **Java 11+** and **JavaFX** installed.

### **For Ubuntu Users**
Install JavaFX with:
```sh
sudo apt install openjfx
```

## Installation
Clone the repository:
```sh
git clone https://github.com/KennethTebogo/logistic-growth-java.git
cd logistic-growth-java
```

## Compilation & Execution

### **1. Compile the Java Program**
```sh
javac --module-path /usr/share/openjfx/lib --add-modules javafx.controls LogisticGrowth.java
```

### **2. Run the Java Program**
```sh
java --module-path /usr/share/openjfx/lib --add-modules javafx.controls LogisticGrowth
```

## Expected Output
A JavaFX window will pop up showing the **logistic growth curve**, with population increasing over time until it stabilizes at the carrying capacity (M).

## License
This project is licensed under the MIT License.

