Create Application.java
# README – Service Web SOAP en Java (JAX-WS)

## 1. Présentation du projet

Ce projet consiste à développer un service web SOAP en Java avec JAX-WS.  
Le service est déployé localement et permet à des clients d’appeler des méthodes à distance via le protocole SOAP.

---

## 2. Technologies utilisées

- Java SE  
- SOAP  
- JAX-WS  
- JAXB  
- HTTP  

---

## 3. Architecture du projet

Le projet est composé de trois classes :

- `Application` : démarre et déploie le service web  
- `MonserviceWeb` : contient les méthodes exposées  
- `Etudiant` : objet métier échangé via le service  

---

## 4. Description des fichiers

### 4.1 `Application.java`

Cette classe permet de lancer l’application et de publier le service web à l’adresse suivante :
http://localhost:8888/

La méthode `Endpoint.publish()` rend le service accessible aux clients SOAP.

---

### 4.2 `MonserviceWeb.java`

Cette classe est le service web SOAP.  
Elle est annotée avec `@WebService` pour exposer ses méthodes.

Méthodes disponibles :
- `conversion(double mt)` : applique une conversion sur un montant  
- `somme(double a, double b)` : retourne la somme de deux nombres  
- `getEtudiant(int identifiant)` : retourne un objet `Etudiant`

---

### 4.3 `Etudiant.java`

Cette classe représente un étudiant échangé entre le client et le service.

Attributs :
- identifiant  
- nom  
- moyenne  

Elle est sérialisable et compatible avec JAXB pour l’échange en XML.

---

## 5. Fonctionnement du service

1. L’application démarre  
2. Le service SOAP est déployé  
3. Le client envoie une requête SOAP  
4. La méthode est exécutée  
5. La réponse est renvoyée en XML  

---

## 6. WSDL

Le WSDL du service est accessible à l’adresse :

http://localhost:8888/?wsdl

Il décrit les méthodes et les types de données du service.

---

## 7. Conclusion

Ce projet montre une implémentation simple d’un service web SOAP en Java.  
Il permet de comprendre les bases de JAX-WS et l’échange de données via SOAP
