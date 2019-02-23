package views;

import models.map.Location;

import java.awt.*;

public interface Printable
{
    void print(Graphics graphics, Location location);
}
