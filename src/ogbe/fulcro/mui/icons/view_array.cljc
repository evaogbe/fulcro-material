(ns ogbe.fulcro.mui.icons.view-array
  #?(:cljs (:require
            ["@mui/icons-material/ViewArray" :default ViewArray]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-array
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewArray)))