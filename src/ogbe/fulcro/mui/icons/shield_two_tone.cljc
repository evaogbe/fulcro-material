(ns ogbe.fulcro.mui.icons.shield-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ShieldTwoTone" :default ShieldTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shield-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShieldTwoTone)))