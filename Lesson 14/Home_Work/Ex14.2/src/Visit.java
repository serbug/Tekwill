public class Visit extends BaseEntity{
    protected long id;
    protected long version;
    protected User user;
    protected WebSite site;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getVersion() {
        return version;
    }
    public void setVersion(long version) {
        this.version = version;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public WebSite getSite() {
        return site;
    }
    public void setSite(WebSite site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "user=" + user +
                ", site=" + site +
                ", id=" + id +
                ", version=" + version +
                '}';
    }
}