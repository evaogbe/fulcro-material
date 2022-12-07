(ns ogbe.fulcro.mui.icons.lock-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LockRounded" :default LockRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lock-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LockRounded)))