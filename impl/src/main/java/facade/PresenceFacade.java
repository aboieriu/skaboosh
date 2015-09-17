package facade;
import dao.IPresenceDao;
import model.Presence;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by CataVlad on 17-Sep-15.
 */
public class PresenceFacade implements IPresenceFacade{
    @Autowired
    public IPresenceDao presenceDao;


    public List<Presence> getAllPresence(Long Id) {
        return this.presenceDao.getAllPresence(Id)  ;
    }

    public IPresenceDao getPresenceDao() {
        return presenceDao;
    }

    public void setPresenceDao(IPresenceDao presenceDao) {
        this.presenceDao = presenceDao;
    }
}
