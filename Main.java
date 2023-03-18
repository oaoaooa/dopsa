public class Main implements createPerson, createEyerss, ActionWihthPerson{
    public static void main(String[] args) {
        Main main= new Main();
        Baby baby= main.createBaby();
        Frakenbok frakenbok= main.createFrakenbok();
        Eyes eyes= main.createEyes();
        main.changeCondiotnoin(eyes);
        main.exSee(baby);
        main.exLoc(frakenbok);
        main.eXCry(baby);
        main.exThink(baby);
    }

    @Override
    public Baby createBaby() {
        return new Baby();
    }

    @Override
    public Frakenbok createFrakenbok() {
        return new Frakenbok();
    }

    @Override
    public Eyes createEyes() {
        return new Eyes();
    }

    @Override
    public void changeCondiotnoin(Eyes eyes) {
        eyes.condion=Condion.SAD;
    }

    @Override
    public void exSee(Baby baby) {
         baby.see();
    }

    @Override
    public void eXCry(Baby baby) {
        baby.cry();
    }

    @Override
    public void exThink(Baby baby) {
        baby.think();
    }

    @Override
    public void exLoc(Frakenbok frakenbok) {
        frakenbok.lock();
    }
}
