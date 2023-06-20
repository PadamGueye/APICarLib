
CREATE TABLE `categorie` (
  `categorie_id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`categorie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


INSERT INTO `categorie` VALUES (1,'Standard'),(2,'Special'),(3,'JeunesConducteurs');



CREATE TABLE `categorie_produit` (
  `categorie_id` int NOT NULL,
  `produit_id` int NOT NULL,
  PRIMARY KEY (`categorie_id`,`produit_id`),
  KEY `produitid_idx` (`produit_id`),
  CONSTRAINT `categorieid` FOREIGN KEY (`categorie_id`) REFERENCES `categorie` (`categorie_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `produit_id` FOREIGN KEY (`produit_id`) REFERENCES `produit` (`produit_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

INSERT INTO `categorie_produit` VALUES (1,1),(1,2),(1,3),(3,4);


CREATE TABLE `commentaire` (
  `commentaire_id` int NOT NULL AUTO_INCREMENT,
  `contenu` varchar(255) DEFAULT NULL,
  `produit_id` int NOT NULL,
  PRIMARY KEY (`commentaire_id`),
  KEY `produitid_idx` (`produit_id`),
  CONSTRAINT `produitid` FOREIGN KEY (`produit_id`) REFERENCES `produit` (`produit_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


INSERT INTO `commentaire` VALUES (1,'Assurance avec un bon rapport qualité prix',2),(2,'Minimum du minimum, un peu deçu',1),(3,'Ce qu\'on peut attendre d\'une assurance au tiers, ni plus, ni moins',1),(4,'Excellente assurance tous risques ! Prix compétitif vis à vis des autres assureurs',3),(5,'L\'assurance est bien, mais les délais de traitement ne me conviennent pas, trop d\'attente!',3);



CREATE TABLE `produit` (
  `produit_id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `cout` int DEFAULT NULL,
  PRIMARY KEY (`produit_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

INSERT INTO `produit` VALUES (1,'AssuranceAuTiersSimple','Assurance couvrant uniquement les dégats matériels et corporels que vous êtes susceptible de causer à autrui avec votre véhicule.',500),(2,'AssuranceAuTiersEtendue','Assurance couvrant le minimum de la garantie responsabilité civile et le bris de glace, le vol, l\'attentat, les catastrophes naturelles et technologiques',800),(3,'AssuranceTousRisques','Assurance qui reprend les garanties de l\'assurance au tiers étendue et auxquelles on ajoute la garantie dommage tous accidents (responsable ou non).',1500),(4,'AssuranceTousRisquesJeunes','L\'assurance tous risques pour les jeunes conducteurs (- 2 ans de permis de conduire)',2200);

