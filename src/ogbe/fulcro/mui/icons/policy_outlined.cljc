(ns ogbe.fulcro.mui.icons.policy-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PolicyOutlined" :default PolicyOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-policy-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PolicyOutlined)))