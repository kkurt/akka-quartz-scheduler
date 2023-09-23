package com.typesafe.akka.extension.quartz.test;


import org.apache.pekko.actor.ActorSystem;
import com.typesafe.akka.extension.quartz.QuartzSchedulerExtension;

public class JavaCompileTest {
  
  @SuppressWarnings("unused") // compile only spec
  public void shouldBeAccessibleFromJava() throws Exception {
    final ActorSystem system = null;
    final QuartzSchedulerExtension t = QuartzSchedulerExtension.get(system);
  }
}
