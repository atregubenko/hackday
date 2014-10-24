package devfest.hack.day.materialdemo;

/**
 * Created by nnet on 24.10.14.
 */
public class CustomItem {
    private int resId;
    private String title;
    private String count;

    public CustomItem(int resId, String title, String count) {
        this.resId = resId;
        this.title = title;
        this.count = count;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
