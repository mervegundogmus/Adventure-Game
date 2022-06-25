# Adventure Game

In the 23rd century the war between two empires led to a nuclear apocalypse which led to
extinction of nearly all civilization and animal life. As we are the only survivors we are trying to build
a new civilization but resources required to sustain life are rare. The radioactivity makes outdoors
dangerous. We are living in an old bunker that is left from WW2. Volunteers need to get out to the
dangerous lands and get to the places where they can get resources. Luckily the bunker we are
living has an old radar that can find creatures on our path to the resources. As a surviving engineer
you are required to write a simulation that can simulate if a volunteer can reach to resources. Be
aware that our radar indicates that there are dangerous creatures and even zombies on the
wasteland.
Write a simulation that find outs if the hero would survive or not. You can use the following sample
input and output as a reference. If the volunteer hero faces an enemy he needs to fight against it
until one of them dies. To simulate fights you can accept that enemy and the hero attack at the
same time. hp represents health points. Each attack decreases health points equal to attack. To
avoid radioactivity volunteer hero wears a special heavy armor that makes him walk meter by
meter.

## Hero and Enemies Skills

| Characters | Damage | Health |
|:-----------|:------:|-------:|
| Hero       |   10   |   1000 |
| Zombie     |   7    |    300 |
| Lion       |   15   |    100 |
| Bug        |   2    |     50 |
| ZombieDog  |   10   |     75 |
| Mutant     |   8    |    400 |

Sample Input 1
==============
Resources are 5000 meters away<br>
Hero has 1000 hp<br>
Hero attack is 10<br>
Bug is Enemy<br>
Lion is Enemy<br>
Zombie is Enemy<br>
Bug has 50 hp<br>
Bug attack is 2<br>
Lion has 100 hp<br>
Lion attack is 15<br>
Zombie has 300 hp<br>
Zombie attack is 7<br>
There is a Zombie at position 1681<br>
There is a Bug at position 276<br>
There is a Bug at position 489<br>
There is a Lion at position 1527<br>
There is a Lion at position 2865<br>
There is a Zombie at position 3523<br>

Sample Output 1
===============
Hero started journey with 1000 HP!<br>
Hero defeated Bug with 990 HP remaining<br>
Hero defeated Bug with 980 HP remaining<br>
Hero defeated Lion with 830 HP remaining<br>
Hero defeated Zombie with 620 HP remaining<br>
Hero defeated Lion with 470 HP remaining<br>
Hero defeated Zombie with 260 HP remaining<br>
Hero Survived!<br>

Sample Input 2
==============
Resources are 7500 meters away<br>
Hero has 500 hp<br>
Hero attack is 9<br>
ZombieDog is Enemy<br>
Mutant is Enemy<br>
Zombie is Enemy<br>
Mutant has 400 hp<br>
Mutant attack is 8<br>
ZombieDog has 75 hp<br>
ZombieDog attack is 10<br>
Zombie has 300 hp<br>
Zombie attack is 7<br>
There is a Zombie at position 1687<br>
There is a Mutant at position 274<br>
There is a ZombieDog at position 486<br>
There is a ZombieDog at position 1897<br>
There is a Mutant at position 5332<br>

Sample Output 2
===============
Hero started journey with 500 HP!<br>
Hero defeated Mutant with 140 HP remaining<br>
Hero defeated ZombieDog with 50 HP remaining<br>
Zombie defeated Hero with 228 HP remaining<br>
Hero is Dead!! Last seen at position 1687!!<br>
"# Adventure-Game" 
