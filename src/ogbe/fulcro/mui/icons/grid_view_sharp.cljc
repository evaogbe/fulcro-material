(ns ogbe.fulcro.mui.icons.grid-view-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GridViewSharp" :default GridViewSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grid-view-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GridViewSharp)))