package chat;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMedium implements Medium {
    private List<User> users=new ArrayList<User>();
    public void register(User user)
    {
        if(!users.contains(user))
        {
            users.add(user);
            user.setMedium(this);
        }
    }
    public void relay(String from,String ad)
    {
        for(User ob:users)
        {
            String name = ob.getName();
            if(!name.equals(from))
            {
                ((User)ob).receive(from,ad);
            }
        }
    }
}
