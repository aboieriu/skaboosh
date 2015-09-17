package facade;

import model.Presence;

import java.util.List;

public interface IPresenceFacade {

    List<Presence> bringPresence();
    Presence getPresence(Long id);
    void updatePresence(Presence presence);
    void addPresence(Presence presence);
    void deletePresence(Long id);

}
