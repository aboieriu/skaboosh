package facade;

import model.Presence;

import java.util.List;

public interface IPresenceFacade {

    List<Presence> bringPresence();
    Presence getPresence(Long groupId,Long userId,Long presenceId);
    void updatePresence(Presence presence);
    void addPresence(Presence presence);
    void deletePresence(Long groupId,Long userId,Long presenceId);

}
