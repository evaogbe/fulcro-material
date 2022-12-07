(ns ogbe.fulcro.mui.icons.dangerous-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DangerousOutlined" :default DangerousOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dangerous-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DangerousOutlined)))