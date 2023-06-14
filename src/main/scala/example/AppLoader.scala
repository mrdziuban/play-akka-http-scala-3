package example

import play.api.{Application, ApplicationLoader, BuiltInComponentsFromContext}
import play.api.routing.Router

class AppLoader extends ApplicationLoader {
  def load(context: ApplicationLoader.Context): Application =
    new AppComponents(context).application
}

class AppComponents(context: ApplicationLoader.Context) extends BuiltInComponentsFromContext(context) {
  val httpFilters = Seq.empty
  val router = Router.empty
}
