package my.spring;

public interface MRenderer
{
    void render();

    void setProvider(MProvider provider);

    MProvider getProvider();
}
