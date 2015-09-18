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

    public List<Presence> bringPresence();
    public Presence getPresence(Long groupId,Long userId,Long presenceId);
    public void updatePresence(Presence presence);
    public void addPresence(Presence presence);
    public void deletePresence(Long groupId,Long userId,Long presenceId);
}
