(ns ogbe.fulcro.mui.icons.flag-rounded
  #?(:cljs (:require
            ["@mui/icons-material/FlagRounded" :default FlagRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flag-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlagRounded)))