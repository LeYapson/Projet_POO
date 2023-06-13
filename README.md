# Projet POO
---
Ce projet à été réalisé par TABOGA LUKAS et YAPI THEAU. 

---

Ce projet est un projet visant à apprendre les bases de la POO (Programmation Orientée Objet) en créant un jeu en ligne de commande.

---

# Run project

---
Pour lancer ce projet, il est préférable d'utiliser au minimum la version JAVA Amazon Corretto 17 (disponible sur : https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html ) ou au mieux la verison 17.0.6 de JAVA Amazon Corretto.  
Les versions JDK fonctionnent à partir de la version OPEN JDK 17 (disponible ici : https://jdk.java.net/17/).

NB : Pour les versions JDK, il est possible de les installer à l'aide de SDKMAN (https://sdkman.io/install) en effectuant cette comande :
```shell
sdk install java
```

Pour lancer le projet, il existe 2 possibilitées :
- la première est de passer par la suite JetBrains IntelliJ et d'éxecuter le programme à partir du fichier main.java .

- la deuxième est d'installer maven par l'intermédiaire de SDKMAN (lien vers SDKMAN : https://sdkman.io/install) en effectuant cette commande :
```shell
sdk install maven
```
La version recommandé pour Maven est la 3.6.3.

Enfin, une fois maven d'installer, il suffit de rentrer ces commandes au terminal.
```shell
mvn clean install
mvn exec:java -Dexec.mainClass=com.ynov.oop.Main
```