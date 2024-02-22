---
titre: Java
sous-titre: Miniprojet 1 - Génération de terrain aléatoire en utilisant le bruit de Perlin
auteur: Philippe \textsc{Roussille}
date: 3iL 1A 2023
---

**Question :** pourquoi l'attribut graine est-il en final ?

**L'attribut graine est en final car ce terme permet de verrouiller la valeur de la graine afin qu'elle ne soit pas modifiée lors du programme.**
****
****
**Question :** Réaliser l'architecture que prendrait la forme d'une telle modélisation sous forme d'un diagramme UML. Quelle serait la différence d'attributs et de méthodes entre ces classes ? Expliquer, en s'appuyant sur un exercice vu en cours, pourquoi c'est une mauvaise idée. Quelle est la solution qu'il faudrait préférer (et que l'on va préférer) ?

![classe abstraite terrain.png](classe%20abstraite%20terrain.png)

**Les différents attributs et méthodes seraient la présence d'arbres, d'herbe ou encore d'eau. Ce serait une mauvaise idée de faire une classe mère car cela engendrerait une redondance dans les attributs. Il vaut mieux utiliser une énumération.**

****
****
**Question :** quel type utilisez-vous ?

**Jai décidé d'utiliser un double car c'est la variable utilisée dans le projet. L'utiliser ici me permettra de ne pas avoir de perte de données.**
****
****
**Question :** pourquoi sortir, selon vous, ce bout d'algorithme de la classe ?

**Selon moi, il faut sortir ce bout d'algorithme, car ce n'est pas à cette classe de déterminer le type de terrain.**
****
****
Réalisations :
 - J'ai pu céer et modifier les différentes classes demandées, je n'ai cependant pas fait les bonus.
****
****
Points difficiles :
- J'ai trouvé difficile de reprendre un code que je n'ai pas créé, j'ai passé un moment à m'imprégner du code afin de le comprendre et le modifier.
- N'ayant jamais fait de Java avant cette année, j'ai eu un peu de mal au niveau de la syntaxe.
****
****
Autres choses :
- J'ai apprécié faire ce projet, car il m'a permis de comprendre la création de maps pour des jeux ainsi que d'effets pour les films. De plus, ce projet m'a permis de comprendre comment avancer sur le projet Java/gestion de projet.
- J'ai fait mon code sous la dernière version de Java.
- Sur mon ordinateur, les générations de carte ne marchent pas.