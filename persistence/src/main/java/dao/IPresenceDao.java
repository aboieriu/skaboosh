package dao;

import model.Presence;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 17.09.2015
 * Time: 11:48
 * To change this template use File | Settings | File Templates.
 */
public interface IPresenceDao {

    List<Presence> bringPresence();
    Presence getPresence(Long id);
    void updatePresence(Presence presence);
    void addPresence(Presence presence);
    void deletePresence(Long id);
}
