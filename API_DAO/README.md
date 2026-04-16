API REST Flask + MySQL
Description

Cette application est une API REST développée avec Flask.
Elle permet de gérer des étudiants en utilisant une base de données MySQL.

Technologies utilisées
Python 3.12.3
Flask
MySQL
mysql-connector-python
Structure du projet

.
├── app.py # Point d’entrée de l’API Flask
├── config.py # Paramètres de configuration
├── db.py # Connexion à la base de données MySQL
├── repository.py # Requêtes SQL

Installation

Installez les dépendances avec la commande suivante :

pip install flask mysql-connector-python

Base de données

Créez d’abord la base de données et la table students avec les requêtes SQL suivantes :

CREATE DATABASE school_db;
USE school_db;

CREATE TABLE students (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
age INT
);

Lancement du projet

Pour démarrer l’application, exécutez :

python app.py

L’API sera accessible à l’adresse suivante :

http://localhost:5000

Endpoints disponibles
Récupérer tous les étudiants

GET /students

Récupérer un étudiant par son identifiant

GET /students/<id>

Remarques
Ce projet est un exemple simple conçu pour l’apprentissage
Assurez-vous que le serveur MySQL est bien démarré avant de lancer l’application
Vérifiez que la configuration de la base de données correspond bien à votre environnement
Pensez à garder une cohérence entre la structure de la base et les requêtes SQL utilisées


BEN YOUNES MAJDI
