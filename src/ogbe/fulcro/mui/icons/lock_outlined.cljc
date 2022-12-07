(ns ogbe.fulcro.mui.icons.lock-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LockOutlined" :default LockOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockOutlined)))