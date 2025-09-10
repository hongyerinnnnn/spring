package com.multi.di.di4;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PersonCollection {
    private List<Person>list;
    private Set<Person>set;
    private Properties properties;
    private Map<Integer, Person>map;

    public PersonCollection() {
        super();
    }

    public PersonCollection(List<Person> list, Set<Person> set, Properties properties, Map<Integer, Person> map) {
        super();
        this.list = list;
        this.set = set;
        this.properties = properties;
        this.map = map;
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    public Set<Person> getSet() {
        return set;
    }

    public void setSet(Set<Person> set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Map<Integer, Person> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Person> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "PersonCollection [list=" + list + ", set=" + set + ", properties=" + properties + ", map=" + map + "]";
    }



}
