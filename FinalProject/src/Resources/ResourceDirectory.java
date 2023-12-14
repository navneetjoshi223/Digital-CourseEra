/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resources;

import java.util.ArrayList;

/**
 *
 * @author ashwinnair
 */
public class ResourceDirectory {
    private ArrayList<Resource> resources;

public ResourceDirectory() {
    this.resources = new ArrayList<Resource>();
}

public ArrayList<Resource> getResources() {
    return resources;
}

public void setResources(ArrayList<Resource> resources) {
    this.resources = resources;
}

public Resource addNewResource() {
    Resource newResource = new Resource();
    resources.add(newResource);
    return newResource;
}

public boolean searchResourceByName(String name) {
    for (Resource resource : resources) {
        if (resource.getItem().equals(name)) {
            return true; // Resource found
        }
    }
    return false; // Resource not found
}

public Resource getResourceByName(String name) {
    for (Resource resource : resources) {
        if (resource.getItem().equals(name)) {
            return resource; // Resource found
        }
    }
    return null; // Resource not found
}
}
