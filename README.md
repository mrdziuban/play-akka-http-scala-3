To demonstrate the issue:

1. Clone this repository
2. `cd` into the directory
3. Run `sbt run`

You should see an error:

```
java.lang.NoSuchMethodError: 'void akka.actor.ExtensionId.$init$(akka.actor.ExtensionId)'
  at akka.http.scaladsl.Http$.<clinit>(Http.scala:845)
  at play.core.server.AkkaHttpServer.createServerBinding(AkkaHttpServer.scala:215)
  at play.core.server.AkkaHttpServer.$init$$$anonfun$4(AkkaHttpServer.scala:248)
  at play.core.server.AkkaHttpServer.$init$$$anonfun$adapted$1(AkkaHttpServer.scala:249)
  at scala.Option.map(Option.scala:242)
  at play.core.server.AkkaHttpServer.<init>(AkkaHttpServer.scala:249)
  at play.core.server.AkkaHttpServerProvider.createServer(AkkaHttpServer.scala:722)
  at play.core.server.AkkaHttpServerProvider.createServer(AkkaHttpServer.scala:721)
  at play.core.server.ServerProvider.createServer(ServerProvider.scala:30)
  at play.core.server.ServerProvider.createServer$(ServerProvider.scala:21)
  at play.core.server.AkkaHttpServerProvider.createServer(AkkaHttpServer.scala:720)
  at play.core.server.ProdServerStart$.start(ProdServerStart.scala:58)
  at play.core.server.ProdServerStart$.main(ProdServerStart.scala:28)
  at play.core.server.ProdServerStart.main(ProdServerStart.scala)
  at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
  at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
  at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
  at java.base/java.lang.reflect.Method.invoke(Method.java:568)
  at sbt.Run.invokeMain(Run.scala:143)
  at sbt.Run.execute$1(Run.scala:93)
  at sbt.Run.$anonfun$runWithLoader$5(Run.scala:120)
  at sbt.Run$.executeSuccess(Run.scala:186)
  at sbt.Run.runWithLoader(Run.scala:120)
  at sbt.Defaults$.$anonfun$bgRunTask$6(Defaults.scala:1983)
  at sbt.Defaults$.$anonfun$termWrapper$2(Defaults.scala:1922)
  at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
  at scala.util.Try$.apply(Try.scala:213)
  at sbt.internal.BackgroundThreadPool$BackgroundRunnable.run(DefaultBackgroundJobService.scala:366)
  at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
  at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
  at java.base/java.lang.Thread.run(Thread.java:833)
```
