(ns ogbe.fulcro.mui.icons.cancel-outlined
  #?(:cljs (:require
            ["@mui/icons-material/CancelOutlined" :default CancelOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cancel-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CancelOutlined)))