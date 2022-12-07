(ns ogbe.fulcro.mui.icons.cyclone-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CycloneSharp" :default CycloneSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cyclone-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CycloneSharp)))