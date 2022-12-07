(ns ogbe.fulcro.mui.icons.policy
  #?(:cljs (:require
            ["@mui/icons-material/Policy" :default Policy]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-policy
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Policy)))