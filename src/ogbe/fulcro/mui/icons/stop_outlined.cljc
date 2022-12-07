(ns ogbe.fulcro.mui.icons.stop-outlined
  #?(:cljs (:require
            ["@mui/icons-material/StopOutlined" :default StopOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stop-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StopOutlined)))