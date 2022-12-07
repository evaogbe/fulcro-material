(ns ogbe.fulcro.mui.icons.policy-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PolicyRounded" :default PolicyRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-policy-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PolicyRounded)))