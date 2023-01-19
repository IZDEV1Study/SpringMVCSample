package services;

import models.Worker;

import java.util.List;

public class WorkerServices {

    private List<Worker> workerList;

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
