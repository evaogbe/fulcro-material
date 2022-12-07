(ns ogbe.fulcro.mui.icons.shield-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ShieldSharp" :default ShieldSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shield-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShieldSharp)))