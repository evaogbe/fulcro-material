(ns ogbe.fulcro.mui.icons.view-array-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ViewArrayRounded" :default ViewArrayRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-array-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewArrayRounded)))