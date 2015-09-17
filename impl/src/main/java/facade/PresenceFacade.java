package facade;

import dao.IPresenceDao;
import model.Presence;

import java.util.List;

/**
 * Created by CataVlad on 17-Sep-15.
 */
public class PresenceFacade implements IPresenceFacade {

        private IPresenceDao presenceDao;

    public IPresenceDao getPresenceDao() {
        return presenceDao;
    }

    public void setPresenceDao(IPresenceDao presenceDao) {
        this.presenceDao = presenceDao;
    }

    public List<Presence> bringPresence() {
        return null;
    }

    public Presence getPresence(Long id) {
        return null;
    }

    public void updatePresence(Presence presence) {

    }

    public void addPresence(Presence presence) {

    }

    public void deletePresence(Long id) {

    }
}
