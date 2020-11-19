# AgileXpertTask
#A megoldandó probléma leírása
Képzeljünk el egy intelligens eszközökre alkalmazott kliens-szerver architektúrájú operációs rendszert. Az intelligens eszközök információkat gyűjtenek és megjelenítésre szolgálnak, míg a számítási műveletek elvégzése a felhőben történik. Ezt a szolgáltatást igénybe tudják venni családok, cégek, olyan csoportok, akik valamilyen tevékenységet közösen végeznek. Lényegében minden felhasználó testre szabhatja saját eszközét egy okos telefonhoz hasonlóan, de az információkat egy központi rendszer tárolja.

Adott egy család, szülők és gyerekek, ahol többen is ezt a szolgáltatást használják. Először csak az apának van hozzáférése a rendszerhez, ő veszi fel a családtagokat. Alapértelmezetten minden eszköz menüje egyforma. Ezt követően mindenki testre szabja saját felületét a szokásainak megfelelően. Az édesanya recepteket tartalmazó alkalmazást telepít, az édesapa GPS programot, a gyerekek különböző játékokat. A rendszer az alábbi funkciókkal rendelkezik:

* felhasználói fiókok (Név) létrehozása, módosítása, törlése
* főmenü kialakítása
* főmenüből nyíló almenü kezelése
* új ikon (Név) hozzáadása, módosítása, törlése
* alkalmazás elindítása
* háttérkép hozzáadása (Név)
* háttérkép kiválasztása (Név)
* arculatváltás (Név)
Feladatok:
1. (10 pont) - Adjon Java programozási nyelven implementált objektum orientált modellt a problémára. Az objektumok közötti egyed kapcsolatokat „egy-sok” és „sok-sok” kapcsolatok esetén listákkal (List) jelölje. Az egyes objektumok rendelkezzenek egyedi szöveges azonosítóval.

2. (10 pont) - Lássa el az egyes objektumokat a JPA megfelelő annotációival. A megoldásnak lehetővé kell tennie valamely standard perzisztencia megoldást (pl.: Hibernate) az adatbázisséma generálásra a felannotált osztályok alapján.

3. (10 pont) - Készítsen MAVEN-el fordítható, konzolon futtatható alkalmazást, mely hozzá adja Önt a felhasználókhoz és kedvenc alkalmazásait a menühöz.

4. (10 pont) – Egészítse ki az alkalmazást, olyan módon, hogy az elindítást követően véletlenszerűen hozza létre a felhasználókat, testre szabva a menüiket. Ezt követően a felhasználók indítsanak el egy-egy alkalmazást a menüből (az alkalmazás neve jelenjen meg a konzolon).
A megoldás memóriában futó adatbázist használjon (pl.: h2).

5. (10 pont) – A szimuláció eredményét jelenítse meg táblázatos formában: felhasználók, telepített alkalmazások, elindított alkalmazás, háttérkép, aktív arculat.

