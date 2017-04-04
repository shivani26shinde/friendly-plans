package database.repository;

import dagger.Component;
import javax.inject.Singleton;
import pg.autyzm.friendly_plans.TaskContainerFragment;
import pg.autyzm.friendly_plans.TaskListActivity;

@Singleton
@Component(modules = {DaoSessionModule.class, RepositoryModule.class})
public interface RepositoryComponent {

    @SuppressWarnings("unused")
    TaskTemplateRepository taskTemplateRepository();

    void inject(TaskContainerFragment activity);
    void inject(TaskListActivity taskListActivity);
}
