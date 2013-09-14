import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers

@RunWith(classOf[JUnitRunner])
class ScratchTests extends FunSuite with ShouldMatchers {

  test("should test something") {
    1 should equal(1)
  }

}