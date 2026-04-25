# GuessingGame — Jeu du Nombre à Deviner

> Exercice 2 — Chapitre 06 : Programmation Orientée Objet en Java  
> LPRGL3B

---

## Description

Jeu interactif en ligne de commande : l'ordinateur tire un **nombre aléatoire entre 1 et 100**,  
et le joueur a **10 essais** pour le deviner. Un indice (trop grand / trop petit) est donné  
après chaque tentative.

---

## Fonctionnalités

- Génération d'un nombre aléatoire avec `Math.random()`
- Boucle de jeu avec compteur d'essais
- Indices directionnels après chaque réponse incorrecte
- Message de victoire ou défaite à la fin
- Affichage du nombre d'essais utilisés en cas de victoire

---

## Structure du projet

```
GuessingGame/
├── src/
│   └── Main.java   # Tout le jeu en un seul fichier
└── README.md
```

---

## Prérequis

| Outil    | Version minimale |
|----------|-----------------|
| Java JDK | 21              |
| IntelliJ | toute version   |

---

## Comment exécuter

### Avec IntelliJ IDEA
1. Ouvrir IntelliJ → **File > Open** → sélectionner `GuessingGame`
2. Clic droit sur `Main.java` → **Run 'Main.main()'**
3. Saisir vos propositions dans la console IntelliJ

### Avec le terminal
```bash
cd src
javac Main.java
java Main
```

---

## Exemple de partie

```
╔══════════════════════════════════╗
║   Jeu du nombre à deviner 🎯     ║
╠══════════════════════════════════╣
║ Nombre entre 1 et 100 · 10 essais max   ║
╚══════════════════════════════════╝

Essai 1/10  (10 restant(s))
Votre proposition : 50
⬆  Trop petit ! Essayez plus grand.

Essai 2/10  (9 restant(s))
Votre proposition : 75
⬇  Trop grand ! Essayez plus petit.

Essai 3/10  (8 restant(s))
Votre proposition : 63

✅ Bravo ! Vous avez trouvé 63 en 3 essai(s) !
```

---

## Logique du programme

```
Générer nombreSecret ∈ [1, 100]
POUR essai DE 1 À 10 :
    Lire proposition
    SI proposition == nombreSecret → VICTOIRE, break
    SI proposition < nombreSecret  → "Trop petit"
    SINON                          → "Trop grand"
SI NON gagne → "Perdu, le nombre était X"
```

---

## Auteur

Étudiant AKAKPO CHRISTIAN LPRGL3B
