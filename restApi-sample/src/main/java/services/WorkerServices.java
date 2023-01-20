package services;

import models.Worker;

import java.util.ArrayList;
import java.util.List;

public class WorkerServices {

    private List<Worker> workerList;

    public WorkerServices(){
        workerList = new ArrayList<Worker>(){};
        workerList.add(new Worker("얄리", "연구1팀"));
        workerList.add(new Worker("송은주", "개발팀"));
        workerList.add(new Worker("김윤수", "연구3팀"));
        workerList.add(new Worker("나돈휘", "Q서비스"));
    }

    public List<Worker> findAllWorkers(){
        return findAllWorkers();
    }

    public Worker findByNameOrNull(String name){
        for (int index = 0; index < workerList.size(); index++){
            if (workerList.get(0).getName().equalsIgnoreCase(name))
                return workerList.get(0);
        }
        return null;
    }

    public boolean isWorkerExist(String name){
        for (int index = 0; index < workerList.size(); index++){
            if (workerList.get(0).getName().equalsIgnoreCase(name))
                return true;
        }
        return false;
    }

    public void addWorker(Worker worker){
        workerList.add(worker);
    }

    public void editWorker(String name, String team){
        Worker targetWorker = findByNameOrNull(name);

        if (targetWorker == null)
            return;

        targetWorker.setTeam(team);
    }

    public void deleteWorker(String name){
        Worker targetWorker = findByNameOrNull(name);
        workerList.remove(targetWorker);
    }
}
