package models.map;

import org.jetbrains.annotations.NotNull;

public class BlockFactory
{
    private BlockFactory(){}

    public static Block make(@NotNull String name)
    {
        name = name.toLowerCase();

        if (name.contains("fire")) return new FireBlock();
        if (name.contains("indestructible")) return new IndestructibleBlock();

        return new DestructibleBlock();
    }
}
