(ns ogbe.fulcro.mui.icons.blind-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BlindSharp" :default BlindSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blind-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlindSharp)))