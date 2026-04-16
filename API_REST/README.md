API de gestion des étudiants avec Flask

Cette application est une API REST simple développée avec Flask.
Elle permet de gérer une liste d’étudiants.

Fonctionnalités
Afficher tous les étudiants
Afficher un étudiant par son identifiant
Ajouter un étudiant
Modifier un étudiant
Supprimer un étudiant
Lancer le projet

Installer Flask :
pip install flask

Exécuter le fichier Python :
python app.py

Ouvrir dans le navigateur :
http://127.0.0.1:5000/

Routes disponibles

GET /
Affiche un message de bienvenue pour vérifier que le serveur fonctionne.

GET /students
Retourne la liste de tous les étudiants au format JSON.

POST /students
Ajoute un nouvel étudiant.

Exemple de données à envoyer :
{name: "Amine", age: 23}

GET /students/<id>
Retourne les informations d’un étudiant selon son identifiant.

PUT /students/<id>
Modifie les informations d’un étudiant existant.

Exemple de données à envoyer :
{name: "Youcef", age: 22}

DELETE /students/<id>
Supprime un étudiant selon son identifiant.

Remarques

Les données sont stockées en mémoire dans une liste Python.
Elles ne sont pas enregistrées dans une base de données.
Si le serveur redémarre, les données reviennent à l’état initial.
Le mode debug permet d’afficher les erreurs et de recharger automatiquement le serveur.

Conclusion

Ce projet est un bon exemple pour apprendre Flask et comprendre le fonctionnement d’une API REST avec les méthodes HTTP GET, POST, PUT et DELETE
