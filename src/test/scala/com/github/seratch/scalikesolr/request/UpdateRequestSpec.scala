package com.github.seratch.scalikesolr.request

import org.scalatest._
import org.scalatest.matchers._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import common.WriterType
import com.github.seratch.scalikesolr._

@RunWith(classOf[JUnitRunner])
class UpdateRequestSpec extends FlatSpec with ShouldMatchers {

  behavior of "UpdateRequest"

  it should "be available" in {
    val core: SolrCore = null
    val requestBody: String = ""
    val documents: List[SolrDocument] = Nil
    val writerType: WriterType = null
    val additionalQueryString: String = ""
    val instance = new UpdateRequest(core, requestBody, documents, writerType, additionalQueryString)
    instance should not be null
  }

}
