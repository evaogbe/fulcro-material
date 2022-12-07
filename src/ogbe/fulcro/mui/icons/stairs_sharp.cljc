(ns ogbe.fulcro.mui.icons.stairs-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StairsSharp" :default StairsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stairs-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StairsSharp)))