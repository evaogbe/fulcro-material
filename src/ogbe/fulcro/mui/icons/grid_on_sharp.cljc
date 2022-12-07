(ns ogbe.fulcro.mui.icons.grid-on-sharp
  #?(:cljs (:require
            ["@mui/icons-material/GridOnSharp" :default GridOnSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grid-on-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GridOnSharp)))