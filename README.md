# **Projet HomeShop**
## Ceci est un projet rélisé au fil du cours suivi sur [OpenClassrooms "Apprenez l’objet avec Java](https://openclassrooms.com/fr/courses/4989236-apprenez-l-objet-avec-java)" 
### I. Débutez avec la programmation orientée objet
#### 2- Concevez visuellement votre programme
##### a. Un Objet c'est quoi ?

Si vous prenez un four, par exemple, il possède avant tout une fonctionnalité : faire cuire des aliments. Pour mener à bien cette fonctionnalité, il possède des caractéristiques  :
- Puissance : quantité en watts,
- Capacité :  quantité en litres.

_cf. class Four_

>Il ne faut surtout pas confondre classe et objet : 
>- La classe est la description d'un type : de quels éléments ce type est composé.
>- Un objet est une variable du type d'une classe. On dit aussi : une instance de classe.

> Pour décrire un concept, il y a une seule et unique classe, mais il peut y avoir une infinité d'instances de cette classe

Etant donné qu'unfour sert à faire cuire des aliments, nous allons faire pareil avec Aliment ...
Quelles sont les fonctionnalités d'un  `Aliment` ? On peut le manger ! 
De quelles caractéristiques a besoin un aliment pour qu'on puisse le manger ? Pour faire simple, nous allons dire : son nom et s'il est cuit ou cru.

Il va donc falloir gfaire intéragir `Four` et `Aliment`

>Il faut toujours réfléchir à :
>- Quel objet je souhaite représenter ?
>- Quelles fonctionnalités possède cet objet ?
 >- De quelles caractéristiques a besoin cet objet pour assurer ses fonctionnalités ?
 
##### b. Utilisez un UML complet
>Elaboration d'une première version de notre schéma UML et celui-ci va évoluer au fur et à mesure des chapitres.

**Notre projet est une application de gestion de facture dans un magasin en ligne.**

La base de notre projet, c'est la facture. Elle se compose :
- de **produits** :
    - > Pour pouvoir **regarder** ou **acheter** un produit, nous avons besoin de son **nom**, de sa **description** et de son **prix**.
- **d'un client** :
    - > En nous limitant au strict minimum, pour pouvoir **vendre** à un client en ligne, il nous faut **son nom complet** et son **adresse**.
    
#### 3- Découvrez les visibilités
 Il existe 4 types de visibilités :
 - `private` : uniquement accessible dans la classe ;
 - `public` : accessible partout ;
 - ""   (rien) : accessible dans le package ;
 - `protected` : nous verrons ce type plus tard.



