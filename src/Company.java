public class Company implements ISO{
    private int cid;
    private String title;

    public Company(int cid, String title) {
        this.cid = cid;
        this.title = title;
    }

    public void display() {
        System.out.println(cid + " " + title);
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void quality() {
        System.out.println(title + " implements quality");
    }

    @Override
    public void hr() {
        System.out.println(title + " implements hr");
    }
}
