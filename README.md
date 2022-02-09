### Pré-requis :

Les logiciels suivants doivent être installés sur votre machine :

- [Node.js](https://nodejs.org/) et npm (au minimum node v 10.x et npm 5.x).
- Maven 3
- Java 8

### Instructions :

  - Télécharger l'ensemble du projet
  - Démarrer la partie back dans Gbsuftblai-back-java : 
  ```bash
  mvn spring-boot:run
  ```
  - Installer bootstrap si non installé dans gbsuftblai-ui : 
  ```bash
  npm install bootstrap@3 --save
  ```
  - Démarrer la partie front dans gbsuftblai-ui : 
  ```bash
  ng serve
  ```
  - Pour accéder à l'application:http://localhost:4200/

