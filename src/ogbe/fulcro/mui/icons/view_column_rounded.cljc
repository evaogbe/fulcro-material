(ns ogbe.fulcro.mui.icons.view-column-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ViewColumnRounded" :default ViewColumnRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-view-column-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ViewColumnRounded)))