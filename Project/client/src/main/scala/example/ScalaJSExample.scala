package example

import scala.scalajs.js
import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExport
import js.Dynamic.{ global => g } // Use g to represent the global context
import scalatags.JsDom._
import scalatags.JsDom.all._
import com.karasiq.bootstrap.modal.Modal
import com.karasiq.bootstrap.{Bootstrap, BootstrapHtmlComponent}  // Needed for the onclick event in the Modal

object ScalaJSExample extends js.JSApp {

  @JSExport
  def testFunction(): Unit = {
  	val title: Modifier = p("Test Dialog")  // simple case ~ just surrounding the text with '<p>' tags
  	val body: Modifier = div(p("This is the body of the dialog box. With example table."),  // Note here that everything is wrapped in a div tag
  		table(id:="testTable",`class`:="table", 				// Here is a basic table
  			thead(tr(td(b("Column 1")),td(b("Column 2")))),
  			tbody(tr(td("Data 1"),td("Data 2")))))
 	val button = Modal.button("Save", Modal.dismiss)  // Note that buttons in Modals are slightly different then elsewhere.

 	// Below are three variants of the modal button, showing off slight variations of the modal

	// This shows calling another dialog on the onClick event
	//Modal(title).withBody(body).withButtons(Modal.closeButton("Cancel"), onclick := Bootstrap.jsClick{_ ⇒ g.alert("Save Clicked!")}).show(backdrop = false)

	// This shows calling another function on the onClick event. This case is typical scala.js code with no Scala Tags
	//Modal(title).withBody(body).withButtons(Modal.closeButton("Cancel"), onclick := Bootstrap.jsClick{_ ⇒ showTestAlert()}).show(backdrop = false)

	// This last case is a typical Scala.js, Scala Tags call
 	Modal.apply(p("Test Dialog"), body, Modal.button("Save", Modal.dismiss)).show(backdrop = false)
  } 

  @JSExport
  def showTestAlert(): Unit = {
  	g.alert("Test Alert from Modal Button Click.")
  }
   	
  def main(): Unit = {
//    dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
  }
}
