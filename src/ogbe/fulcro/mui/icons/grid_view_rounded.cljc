(ns ogbe.fulcro.mui.icons.grid-view-rounded
  #?(:cljs (:require
            ["@mui/icons-material/GridViewRounded" :default GridViewRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grid-view-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GridViewRounded)))