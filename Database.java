
class Database {
    private static Database dbObject;

    private Database() {
    }

    public static Database getInstance() {

        if (dbObject == null) {
            dbObject = new Database();
        }
        return dbObject;
    }

    public void getConnection() {
        System.out.println("Vous etes maintenant connecte a la base de donnees");
    }
    public static void main(String[] args) {
        Database d1;
        d1=Database.getInstance();
        d1.getConnection();
    }
}


