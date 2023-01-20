package controller;

import models.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;
import services.WorkerServices;

import java.util.List;

@Controller
public class RESTController {

    @Autowired
    WorkerServices workerServices;

    @RequestMapping(value = "/worker", method = RequestMethod.GET)
    public ResponseEntity<List<Worker>> listAllWorkers(){
        List<Worker> allWorkers = workerServices.findAllWorkers();

        if (allWorkers.isEmpty())
            return new ResponseEntity<List<Worker>>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<List<Worker>>(allWorkers, HttpStatus.OK);
    }

    @RequestMapping(value = "/worker/{workerName}", method = RequestMethod.GET)
    public ResponseEntity<Worker> getWorker(@PathVariable("workerName") final String workerName) {
        final Worker fetchedWorker = workerServices.findByNameOrNull(workerName);
        if (fetchedWorker == null) {
            return new ResponseEntity<Worker>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<Worker>(fetchedWorker, HttpStatus.OK);
    }

    @RequestMapping(value = "/worker", method = RequestMethod.POST)
    public ResponseEntity<Void> addWorker(@RequestBody Worker worker) {

        if (workerServices.isWorkerExist(worker.getName())) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        workerServices.addWorker(worker);

        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @RequestMapping(value = "/worker/{workerName}", method = RequestMethod.PUT)
    public ResponseEntity<Worker> updateWorker(@PathVariable("workerName") final String workerName,
                                                   @RequestBody String team) throws Exception {

        workerServices.editWorker(workerName, team);

        return new ResponseEntity<Worker>(HttpStatus.OK);
    }

    @RequestMapping(value = "/worker/{workerName}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteWorker(@PathVariable("workerName") final String workerName) {
        workerServices.deleteWorker(workerName);

        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
