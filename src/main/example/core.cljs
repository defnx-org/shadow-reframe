(ns example.core
  (:require ["react-dom/client" :refer [createRoot]]
            [goog.dom :as gdom]
            [reagent.core :as r]))

(defn app []
      [:div "Hello world1!"])

(defonce root (createRoot (js/document.getElementById "root")))

(defn init []
      (.render root (r/as-element [app])))

(defn ^:dev/after-load re-render []
      (init))