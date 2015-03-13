package controllers

import play.api.mvc._

import scala.concurrent.Future

object ApplicationController extends Controller {

  def index = Action.async { implicit request =>
    Future.successful(Ok(views.html.main()))
  }
}
