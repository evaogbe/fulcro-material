(ns ogbe.fulcro.mui.icons.policy-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PolicySharp" :default PolicySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-policy-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PolicySharp)))