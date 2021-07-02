package principles.solid;

/**
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * Abstractions should not depend on details. Details should depend on abstractions.
 *
 * When this principle is applied it means the high level classes are not working directly with low level classes,
 * they are using interfaces as an abstract layer.
 */
public class DependencyInversion {

    interface IWorker {
        public void work();
    }

    class Worker implements IWorker{
        public void work() {

        }
    }

    class SuperWorker  implements IWorker{
        public void work() {

        }
    }

    class Manager {
        IWorker worker;

        public void setWorker(IWorker worker) {
            this.worker = worker;
        }

        public void manage() {
            this.worker.work();
        }
    }


}
