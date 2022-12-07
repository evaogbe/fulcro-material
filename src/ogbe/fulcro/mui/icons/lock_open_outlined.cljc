(ns ogbe.fulcro.mui.icons.lock-open-outlined
  #?(:cljs (:require
            ["@mui/icons-material/LockOpenOutlined" :default LockOpenOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-open-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockOpenOutlined)))