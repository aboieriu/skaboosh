package facade;

import dao.IPresenceDao;
import model.Presence;

import java.util.List;

/**
 * Created by CataVlad on 17-Sep-15.
 */
public class PresenceFacade implements IPresenceFacade {


    private IPresenceDao presenceDao;


    public List<Presence> bringPresence() {
        return this.presenceDao.bringPresence();
    }

    public Presence getPresence(Long groupId,Long userId,Long presenceId) {
        return this.presenceDao.getPresence(groupId,userId,presenceId);
    }

    public void updatePresence(Presence presence) {
        this.presenceDao.updatePresence(presence);

    }

    public void addPresence(Presence presence) {
        this.presenceDao.addPresence(presence);

    }

    public void deletePresence(Long groupId,Long userId,Long presenceId) {
              this.presenceDao.deletePresence(groupId,userId,presenceId);

    }
    public IPresenceDao getPresenceDao() {
        return presenceDao;
    }

    public void setPresenceDao(IPresenceDao presenceDao) {
        this.presenceDao = presenceDao;
    }

}
