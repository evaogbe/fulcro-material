(ns ogbe.fulcro.mui.icons.lock-open
  #?(:cljs (:require
            ["@mui/icons-material/LockOpen" :default LockOpen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-open
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockOpen)))