package controllers

import play.api.test.{WithApplication, FakeRequest, PlaySpecification}

class ApplicationControllerSpec extends PlaySpecification {

  "The `index` action" should {
    "return 200 status code" in new WithApplication() {
      val Some(result) = route(FakeRequest(routes.ApplicationController.index()))

      status(result) must beEqualTo(OK)
    }
  }
}
