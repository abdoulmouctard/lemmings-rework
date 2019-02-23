package models.map;

class BlockFactory
{
    private BlockFactory(){}

    static Block make(String name, int i, int j)
    {
        name = name.toLowerCase();

        if (name.contains("fire")) return new FireBlock(i,j);
        if (name.contains("indestructible")) return new IndestructibleBlock(i,j);

        return new DestructibleBlock(i,j);
    }
}
