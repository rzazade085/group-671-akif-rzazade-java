package classwork_15;

public class Qeroyiqri {
	String name;
    int level;
    int hp;
    int coins;

    Qeroyiqri(String name) {
        this.name = name;
        level = 1;
        hp = 100;
        coins = 0;
    }

    void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Уровень: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Монеты: " + coins);
        System.out.println("--------------");
    }

    void takeDamage(int damage) {
        hp -= damage;
        if (hp <= 0) {
            System.out.println("Герой погиб ☠️");
        }
    }

    void collectCoins(int amount) {
        coins += amount;
    }

    void levelUp() {
        if (coins >= 50) {
            level++;
            hp += 30;
            coins -= 50;
            System.out.println("Новый уровень!");
        } else {
            System.out.println("Мало монет!");
        }
    }
}

