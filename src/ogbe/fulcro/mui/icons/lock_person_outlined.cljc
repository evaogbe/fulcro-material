(ns ogbe.fulcro.mui.icons.lock-person-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LockPersonOutlined" :default LockPersonOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-person-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockPersonOutlined)))