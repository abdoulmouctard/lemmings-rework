package models.map;

import models.lemming.Lemming;
import views.Printable;

public interface BoardContainer extends Printable
{
    Location getLocation();
    Lemming getLemming();
    void addLemming(Lemming lemming);
    void removeLemming();
    boolean containLemming(Lemming lemming);
}
