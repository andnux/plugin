package top.andnux.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloWordPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.getTasks().create("hello", HelloWord.class, { task ->
            task.setMessage("Hello");
            task.setRecipient("World");
        });
    }
}