package controllers

import play.api.Environment
import play.api.mvc._

class Application()(implicit environment: Environment) extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

}
