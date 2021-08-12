public class BuilderDemoApp {
    public static void main(String[] args) {
        CdBuilder cbuilder = new CdBuilder();
        CdType cdtype = cbuilder.buildSonyCD();
        cdtype.afficherItems();
        CdType cdtype2 = cbuilder.buildSamsungCD();
        cdtype2.afficherItems();
    }
}
