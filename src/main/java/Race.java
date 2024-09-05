public class Race {
    private String leader;
    private int distance;

    public Race() {
        this.leader="";
        this.distance=0;
    }


    public void bestCar (Car[] cars) {
        for (Car car : cars) {
            if (distance < car.getSpeed()*24) {
                distance = car.getSpeed()*24;
                leader= car.getName();
            }
        }

        System.out.println("Самая быстрая машина: " + leader);
    }

}
