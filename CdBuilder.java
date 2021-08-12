public class CdBuilder {
    public CdType buildSonyCD() {
        CdType cds = new CdType();
        cds.addItem(new Sony());
        return cds;
    }

    public CdType buildSamsungCD() {
        CdType cds = new CdType();
        cds.addItem(new SamSung());
        return cds;
    }
}
