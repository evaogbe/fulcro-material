(ns ogbe.fulcro.mui.icons.paid-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PaidOutlined" :default PaidOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-paid-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PaidOutlined)))