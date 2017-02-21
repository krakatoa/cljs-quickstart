(ns cljs-quickstart.core
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]))

(enable-console-print!)

(println "Hello from Sarasa!")
;(js/alert "Hello from ClojureScript!")

(defonce app-state (atom {:text "Hello world!"}))

(om/root
  (fn [data owner]
    (reify om/IRender
      (render [_]
        (dom/div nil
                 (dom/p nil (:text data))
                 (dom/h3 nil "Edit this and watch it change!")))))
  app-state
  {:target (. js/document (getElementById "app"))})
