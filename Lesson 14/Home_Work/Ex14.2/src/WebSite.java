public class WebSite extends BaseEntity{
    protected long id;
    protected long version;
    protected String url;
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
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "url='" + url + '\'' +
                ", id=" + id +
                ", version=" + version +
                '}';
    }
}