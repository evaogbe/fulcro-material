(ns ogbe.fulcro.mui.workspaces.main
  (:require
   ["highlight.js/lib/core" :as hljs]
   ["highlight.js/lib/languages/clojure" :as hl-clojure]
   [nubank.workspaces.core :as ws]
   [ogbe.fulcro.mui.workspaces.ui.button]
   [ogbe.fulcro.mui.workspaces.ui.date-pickers]
   [ogbe.fulcro.mui.workspaces.ui.form]
   [ogbe.fulcro.mui.workspaces.ui.menu]))

(js/goog.exportSymbol "hljs" hljs)
(hljs/registerLanguage "clojure" hl-clojure)

(defonce init (ws/mount))
