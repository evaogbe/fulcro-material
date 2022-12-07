(ns ogbe.fulcro.mui.icons.view-agenda
  #?(:cljs (:require
            ["@mui/icons-material/ViewAgenda" :default ViewAgenda]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-agenda
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewAgenda)))