module Oblig3CardGame1 {

  /*  requires javafx.graphics;
    requires javafx.controls;
   // exports no.ntnu.idatg2001.Backend;
    */
    requires javafx.controls;
    requires javafx.fxml;

    opens no.ntnu.idatg2001.run to javafx.fxml;
    exports no.ntnu.idatg2001.run;
}
