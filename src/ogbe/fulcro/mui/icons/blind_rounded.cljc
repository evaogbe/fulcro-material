(ns ogbe.fulcro.mui.icons.blind-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BlindRounded" :default BlindRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blind-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlindRounded)))