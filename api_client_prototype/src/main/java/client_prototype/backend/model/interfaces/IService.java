package client_prototype.backend.model.interfaces;

import java.util.List;

public interface IService<Entity>
{
    List<Entity> getAll();

    Entity getById();

    Entity insert(Entity entity);

    Entity 
}