(ns ogbe.fulcro.mui.icons.check-circle-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CheckCircleOutlined" :default CheckCircleOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-circle-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckCircleOutlined)))