package client_prototype.backend.model.interfaces;

import java.util.List;

public interface IService<Entity>
{
    List<Entity> getAll();

    Entity getById(Integer id);

    Entity insert(Entity entity);

    Entity update(Entity entity);

    Entity delete(Integer id);
}