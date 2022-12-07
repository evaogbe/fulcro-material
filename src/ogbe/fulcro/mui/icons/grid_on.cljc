(ns ogbe.fulcro.mui.icons.grid-on
  #?(:cljs (:require
            ["@mui/icons-material/GridOn" :default GridOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grid-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GridOn)))