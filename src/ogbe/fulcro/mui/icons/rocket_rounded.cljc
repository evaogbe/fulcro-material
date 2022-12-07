(ns ogbe.fulcro.mui.icons.rocket-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RocketRounded" :default RocketRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rocket-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RocketRounded)))