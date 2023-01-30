public abstract class WebsiteTemplate {
    public abstract void showPageBody();

    public void showPage() {

        System.out.println("Header from public abstract class WebsiteTemplate");
        showPageBody();
        System.out.println("Footer from public abstract class WebsiteTemplate");
    }
}
