# **Projet HomeShop**
## Ceci est un projet rélisé au fil du cours suivi sur [OpenClassrooms "Apprenez l’objet avec Java"](https://openclassrooms.com/fr/courses/4989236-apprenez-l-objet-avec-java) 
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


...

### II. Allez plus loin avec la programmation orientée objet

#### 1- Découvrez l'héritage
> Spécialisation
...

#### 2- Utilisez le polymorphisme
##### a. Généralisation
##### b. Surcharge
##### c. Classe abstraite

#### 3- Concevez une interface
##### a. Un contrat
>Qu'est-ce qu'un contrat ? <br>
Pour faire simple, on peut dire que c'est un **accord entre plusieurs parties** : "J'effectue telle action pour toi. En contrepartie, tu effectues telle action pour moi."

En développement, ce concept se représente via une **interface**. Quand vous travaillez avec d'autres développeurs, vous avez des interactions. Vous allez souvent vous retrouver en train de dire : "Tiens, je passe tel paramètre à ta méthode ; elle doit faire ça pour moi."

On utilise le mot ``implements`` pour utiliser une interface. Quand on utilise  ``implements`` , Java nous oblige à  ``Override``  chaque méthode de l'interface.

>NB. : **Une interface ne peut pas être instanciée.** <br>
Attention à ne pas confondre **Interface** et **Class** :
>- Interface : une interface est un contrat. Elle sert à spécifier un comportement attendu sans préciser le code de ce comportement.
>- Class : une classe définit le code d'un comportement. C'est dans une classe que l'on trouve le code servant à faire fonctionner votre application.


##### b. Conception de la livraison
##### Ajout d'un **Système de livraison**

Pour une facture => Un moyen de livraison

Moyens de livraison : 
- Livraison à domicile : prix toujours le même = 4.99€
- Livraison à domicile express 24h :  prix dans Paris = 6.99€ & prix dehors de Paris = 9.99€
- Livraison en point relais : identifiés par un numéro : 
    - 1 à 22 : gratuits 
    - 23 à 47 : 2.99€ 
    - autres : 4.99€ 
- Retrait gratuit à l'entrepôt dans Paris

##### c. Implémentation de la livraison
mplémentation de tests pour les logiques contenus dans ``ExpressDelivery``  et  ``RelayDelivery``

#### 4- Générez une facture

##### a. La méthode generate()
>Génerer une facture dans un fichier

Nouvelles fonctions : ``generate`` & ``getTotal``

##### b. Un Mock
Implémentation des **tests** pour les fonctions ``generate`` & ``getTotal``

Pour tester  ``generate`` , nous allons créer un faux  ``Writer``  : un  ``Writer``  qui n'écrit rien du tout, mais qui **stocke** ce qu'il doit écrire. Cela sera beaucoup plus simple pour tester. 

On appelle cela un **Mock**.

Cas d'exceptions ou on peut écrire des tests de différents classes dans un même fichier :
- **Les inner classes** : ce sont des classes **déclarées dans d'autres**. (Plutôt rare)
- **les classes anonymes** : (le cas ici) Cela consiste à faire un **héritage** dans le code, **sans créer de nouvelle classe**. On change le comportement de base de la classe sans en créer une nouvelle.

##### c. Le code de generate et getTotal
...

##### d. Un outil bien pratique
...

#### 5- Générez votre première exception
##### a. Plusieurs types d'exceptions
2 types d'exceptions :
- certaines que l'on est **obligé de catcher**  : la classe **Exception et ses enfants**. Exemples : FileNotFoundException, UnknownServiceException ...
- d'autres que l'on catche **si l'on veut** : même si la classe ``RuntimeException`` est un enfant d'Exception, on est pas obligé de catcher une  ``RuntimeException``.Exemples : NumberFormatException, IllegalArgumentException, IllegalStateException ...

Pour **lancer** une exception, il suffit d'utiliser le mot clé ``throw`` .

##### b. Vos exceptions
On peut utiliser les types d'exceptions **déjà présents dans Java**. Cependant, il est souvent plus judicieux de créer **ses propres types d'exceptions**.

Le gros intérêt d'utiliser son propre type d'exception est d'avoir une information claire pour les développeurs avec la ligne ``catch (NoProductInBillException e)`` . Un autre développeur comprendra immédiatement **le type de souci** qu'il peut y avoir à cet endroit du code.


