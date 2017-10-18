package my.spring;

public interface MRender
{
    void render();

    void setProvider(MProvider provider);

    MProvider getProvider();
}
