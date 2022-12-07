(ns ogbe.fulcro.mui.icons.shield-moon
  #?(:cljs (:require
            ["@mui/icons-material/ShieldMoon" :default ShieldMoon]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shield-moon
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShieldMoon)))