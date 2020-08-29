sap.ui.define([
  "com/myorg/ejemploJpaFront/controller/BaseController",
  "sap/m/MessageToast"
], function(Controller, MessageToast) {
  "use strict";

  return Controller.extend("com.myorg.ejemploJpaFront.controller.MainView", {

  TestGenData: function () {
  },

  TestGetPersona: function(){
    var settings = {
      "url": "/data/personas",
      "method": "GET",
      "timeout": 0,
    };

    $.ajax(settings).done(function (response) {
      MessageToast.show(JSON.stringify(response[0]));
    });
    }

  });
});
