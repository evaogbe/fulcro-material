(ns ogbe.fulcro.mui.icons.cable-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CableSharp" :default CableSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cable-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CableSharp)))