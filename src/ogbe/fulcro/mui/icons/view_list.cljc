(ns ogbe.fulcro.mui.icons.view-list
  #?(:cljs (:require
            ["@mui/icons-material/ViewList" :default ViewList]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-list
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewList)))