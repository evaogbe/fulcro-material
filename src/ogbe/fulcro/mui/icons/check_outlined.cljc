(ns ogbe.fulcro.mui.icons.check-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CheckOutlined" :default CheckOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckOutlined)))