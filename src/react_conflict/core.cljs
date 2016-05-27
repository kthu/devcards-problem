(ns react-conflict.core
  (:require
   [sablono.core :as sab :include-macros true]))

(enable-console-print!)

(js/React.render (sab/html [:h1 "This is working"])
                 (.getElementById js/document "main-app-area"))

