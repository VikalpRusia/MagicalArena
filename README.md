# Magical Arena

## Problem Statement:

Design a Magical Arena.
Every Player is defined by a `health` attribute,
`strength` attribute and an `attack` attribute - all positive integers.
The player dies if his health attribute touches 0

## Pre-requisite

- have java(18) installed
- have source code

## Executing

Locate the MagicalArena.java file in the project structure.

```
cd src
java -Djava.util.logging.config.file=../logging.properties MagicalArena.java
```

## Changing values

Go to MagicalArena.java file and modify main accordingly

### Changing logging properties

Modify logging properties in logging.properties file

### Executing test cases

Excluded Main class from code coverage

#### Intelli-J

- Go to the Run menu and select Run....
- Choose All Tests in Project.

#### Eclipse

- Right-click on the test class name in the editor or the Package Explorer.
- Select Run As > JUnit Test.

### Code coverage

| Element                 | Class %    | Method %     | Line %       | Branch %     |
|-------------------------|------------|--------------|--------------|--------------|
| **all**                 | 100% (5/5) | 100% (18/18) | 100% (54/54) | 100% (12/12) |
| entities                | 100% (1/1) | 100% (10/10) | 100% (24/24) | 100% (6/6)   |
| - Player                | 100% (0/0) | 100% (0/0)   | 100% (0/0)   | 100% (0/0)   |
| - SimplePlayer          | 100% (1/1) | 100% (4/4)   | 100% (24/24) | 100% (6/6)   |
| utils                   | 100% (4/4) | 100% (8/8)   | 100% (30/30) | 100% (6/6)   |
| - arena                 | 100% (1/1) | 100% (4/4)   | 100% (21/21) | 100% (4/4)   |
| -- Match                | 100% (1/1) | 100% (4/4)   | 100% (21/21) | 100% (4/4)   |
| - attack                | 100% (1/1) | 100% (1/1)   | 100% (1/1)   | 100% (0/0)   |
| -- AttackingStrategy    | 100% (0/0) | 100% (0/0)   | 100% (0/0)   | 100% (0/0)   |
| -- SimpleAttackStrategy | 100% (1/1) | 100% (1/1)   | 100% (1/1)   | 100% (0/0)   |
| - defend                | 100% (1/1) | 100% (1/1)   | 100% (3/3)   | 100% (2/2)   |
| -- DefendingStrategy    | 100% (0/0) | 100% (0/0)   | 100% (0/0)   | 100% (0/0)   |
| -- SimpleDefendStrategy | 100% (1/1) | 100% (1/1)   | 100% (3/3)   | 100% (2/2)   |
| Utils                   | 100% (1/1) | 100% (2/2)   | 100% (5/5)   | 100% (0/0)   |
