package principles.solid;

/**
 * The Interface Segregation Principle states that clients should not be forced to implement interfaces they don't use.
 * Instead of one fat interface many small interfaces are preferred based on groups of methods, each one serving one submodule.
 *
 * If the design is already done fat interfaces can be segregated using the Adapter pattern.
 */
public class InterfaceSegregation {

    interface IWorkable {
        public void work();
    }

    interface IFeedable {
        public void eat();
    }

    class Worker implements IWorkable, IFeedable {
        public void work() {

        }
        public void eat() {

        }
    }

    class WorkerRobot implements IWorkable {
        public void work() {

        }
    }

    class SuperWorker implements IWorkable, IFeedable {
        public void work() {

        }
        public void eat() {

        }
    }

    class Manager {
        IWorkable worker;
        public void setWorker(IWorkable worker) {
            this.worker = worker;
        }
        public void manage() {
            this.worker.work();
        }
    }

}
