(ns ogbe.fulcro.mui.icons.warning-outlined
  #?(:cljs (:require
            ["@mui/icons-material/WarningOutlined" :default WarningOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-warning-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WarningOutlined)))