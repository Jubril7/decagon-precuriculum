public class Player {
    String playerName;
    int playerAge;

    // players salary has been encapsulated and can only the accessed with the getSalary method in the class
    private int playerSalary;

    public Player(String name, int age, int salary) {
        this.playerName = name;
        this.playerAge = age;
        this.playerSalary = salary;
    }

    public String playerProfile() {
        return playerName + " earns " + playerSalary + "k weekly at the age of " + playerAge +".";
    }


    public String getPlayerSalary() {
        return playerSalary + "k";
    }

    public String setPlayerSalary(int playerSalary) {
        this.playerSalary = playerSalary;
        return getPlayerSalary();
    }

    public String toString() {
        return "Player{ " + "name='" + playerName + '\'' + '}';
    }

}
