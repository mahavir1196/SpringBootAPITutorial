package com.mahavir.springboot.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","spring framework","description"),
            new Topic("spring2","spring framework2","description2")
    ));

    List<Topic> getAllTopics() {
        return topics;
    }

    Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }

    void addTopic(Topic topic) {
        topics.add(topic);
    }

    void updateTopic(String id, Topic topic){
        for (int i=0;i<topics.size();i++){
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i,topic);
                return;
            }
        }
    }

    void deleteTopic(String id){
        topics.removeIf(t -> t.getId().equals(id));
    }
}
