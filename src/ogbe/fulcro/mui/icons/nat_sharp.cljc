(ns ogbe.fulcro.mui.icons.nat-sharp
  #?(:cljs (:require
            ["@mui/icons-material/NatSharp" :default NatSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nat-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NatSharp)))