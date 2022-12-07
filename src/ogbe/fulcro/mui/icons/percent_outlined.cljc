(ns ogbe.fulcro.mui.icons.percent-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PercentOutlined" :default PercentOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-percent-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PercentOutlined)))