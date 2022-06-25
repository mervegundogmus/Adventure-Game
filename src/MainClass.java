import Character.Hero;
import Character.Common.Common;
import Character.Factory.CommonFactory;
import Character.Interface.CommonFactoryInterface;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * Bu proje oluşturulurken, nesne yönemlimli programlama kullanılmıştır.
 * Kullanılan bileşenler encapsulation, abstraction, inheritance ve polymorphism'dir.
 * Nesneleri üretmek için Factory Pattern kullanılmıştır.
 * Factory Pattern ile oluturulan karakterler abstract sınıfında genişletilmiştir.
 * Her karakterin davranışları interface kullanıllarak kontrol ediliir.
 * Main class'ta işlemler gerçekleştirilerek sonuçlar result.txt dosyasına yazılır.
 * Bu proje için Intellij Idea kullanılmıştır.
*/

public class MainClass {


    private static final CommonFactoryInterface factory = CommonFactory.instance;

    public static final int resources = 5000;
    private static CreateFile file = new CreateFile();


    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {


        Common[] enemy = randomEnemies();  // Düşman karakterleri random oluşturulur ve düşman değişkenine atanır.
        Hero myHero = myHero();            // Hero karakteri oluşturulur ve myHero değişkenine atanır.
        battle(myHero, enemy);             // Karakterler param da savaşır ve sonuç verir.
    }

    public static Common battle(Hero g1, Common[] g2) throws FileNotFoundException, UnsupportedEncodingException {

        // g1: değişken kahraman
        // g2: değişken düşmanlar

        file.openFile();
        String str1 = ("Resources are " + resources + " meter away\n" +
                g1.getName() + " has " + g1.getHealth() + " hp\n" +
                g1.getName() + " attack is " + g1.attackPoint()+"\n");
        file.addRecors(str1);

        // Düşmanların tüm özellikleri hakkında bilgi verir.

        for (Common temp : g2) {

            String str2 = (temp.getName() + " is Character." + " has hp " + temp.getHealth() + " attack point " +
                    temp.attackPoint() + " location " + temp.getLocation() + " meter.\n");

            file.addRecors(str2);

        }


        for (int i = 0; i < g2.length; i++) {

            boolean survive = true;

            while (survive) {

                // Döngünün koşulları, karakterlerin hayatta kalmasına bağlıdır.

                if (g2[i].isAlive() || g1.isAlive()) {
                    survive = false;
                    continue;
                }

                g1.attack(g2[i]);
                g1.setHealth(g1.getHealth() - g2[i].attackPoint());

                if (g1.isAlive()) {

                    String str2 = (g1.getName() + " vs " + g2[i].getName() + " battle and " + g1.getName() +
                            " died" + " at " + g2[i].getLocation() + " meters.");

                    file.addRecors(str2);
                    survive = false;

                } else if (g2[i].isAlive()) {

                    String str3 = (g1.getName() + " vs " + g2[i].getName() + " battle and " + g1.getName() +
                            " won. " + g1.getHealth() + " health left.\n");
                    file.addRecors(str3);
                    survive = false;
                }

            }

        }

        file.closeFile();

        return null;
    }


    public static Common[] randomEnemies() {
        // Düşman karakterler ile bir seri döndüren metodumuz.

        int totalEnemy = (int) (Math.random() * 7);         // Rastgele maximum sayı sınırı.
        Common[] enemy = new Common[totalEnemy];

        int[] location = new int[totalEnemy];               // Rastgele Location oluşturma.
        Random generator = new Random();

        for (int j = 0; j < enemy.length; j++) {
            location[j] = (generator.nextInt(resources));
        }

        Arrays.sort(location);                              // Location'un küçükten büyüğe değer bilgisi.

        for (int i = 0; i < enemy.length; i++) {

            int[] randomLocation = location;

            int enemyType = (int) (Math.random() * 5);      // Karakter türleri rastgele oluşturulur.
            switch (enemyType) {
                case 0:
                    enemy[i] = (Common) factory.make("Bug");
                    enemy[i].setLocation(randomLocation[i]);
                    break;
                case 1:
                    enemy[i] = (Common) factory.make("Lion");
                    enemy[i].setLocation(randomLocation[i]);

                    break;
                case 2:
                    enemy[i] = (Common) factory.make("Mutant");
                    enemy[i].setLocation(randomLocation[i]);

                    break;
                case 3:
                    enemy[i] = (Common) factory.make("Zombie");
                    enemy[i].setLocation(randomLocation[i]);

                    break;
                case 4:
                    enemy[i] = (Common) factory.make("ZombieDog");
                    enemy[i].setLocation(randomLocation[i]);

                    break;
            }

        }
        return enemy;
    }

    public static Hero myHero() {
        //Ana karakterimiz Hero'yu oluşturan metodumuz.

        Hero hero = (Hero) factory.make("Hero");
        return hero;
    }

}
