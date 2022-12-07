(ns ogbe.fulcro.mui.icons.fitbit-outlined
  #?(:cljs (:require
            ["@mui/icons-material/FitbitOutlined" :default FitbitOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fitbit-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FitbitOutlined)))